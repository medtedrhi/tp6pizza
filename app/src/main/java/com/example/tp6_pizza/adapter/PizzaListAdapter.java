package com.example.tp6_pizza.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp6_pizza.PizzaProduit;
import com.example.tp6_pizza.R;

import java.util.List;

/**
 * A custom adapter for displaying a list of pizzas.
 * This adapter is responsible for creating and binding the views for each pizza in the list.
 */
public class PizzaListAdapter extends BaseAdapter {

    // The application context.
    private final Context context;
    // The list of pizzas to display.
    private final List<PizzaProduit> pizzas;

    /**
     * Constructor for the PizzaListAdapter.
     *
     * @param context The current context.
     * @param pizzas  The list of pizzas to be displayed.
     */
    public PizzaListAdapter(Context context, List<PizzaProduit> pizzas) {
        this.context = context;
        this.pizzas = pizzas;
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     */
    @Override
    public int getCount() {
        return pizzas.size();
    }

    /**
     * Get the data item associated with the specified position in the data set.
     */
    @Override
    public Object getItem(int position) {
        return pizzas.get(position);
    }

    /**
     * Get the row id associated with the specified position in the list.
     */
    @Override
    public long getItemId(int position) {
        return pizzas.get(position).getId();
    }

    /**
     * Get a View that displays the data at the specified position in the data set.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // If the convertView is null, we need to inflate a new view.
        if (convertView == null) {
            // The LayoutInflater is used to instantiate layout XML files into their corresponding View objects.
            LayoutInflater inflater = LayoutInflater.from(context);
            // Inflate the custom layout for a single row.
            convertView = inflater.inflate(R.layout.row_pizza, parent, false);
        }

        // Find the views within the custom layout.
        ImageView pizzaImage = convertView.findViewById(R.id.imgPizza);
        TextView pizzaName = convertView.findViewById(R.id.tvNom);
        TextView pizzaMeta = convertView.findViewById(R.id.tvMeta);

        // Get the pizza object for the current position.
        PizzaProduit pizza = pizzas.get(position);

        // Set the data to the views.
        // Use the image resource provided by the PizzaProduit; fall back to `icon` if missing.
        int imgRes = pizza.getImageRes();
        if (imgRes != 0) {
            pizzaImage.setImageResource(imgRes);
        } else {
            pizzaImage.setImageResource(R.mipmap.icon);
        }
        pizzaName.setText(pizza.getNom());
        // Combine duration and price into one string for the meta TextView.
        String metaText = pizza.getDuree() + " • " + String.format("%.2f", pizza.getPrix()) + " €";
        pizzaMeta.setText(metaText);

        // Return the completed view to render on screen.
        return convertView;
    }
}
