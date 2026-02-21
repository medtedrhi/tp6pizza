package com.example.tp6_pizza.adapter;

import android.app.Activity;
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

public class PizzaAdapter extends BaseAdapter {

    private List<PizzaProduit> pizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<PizzaProduit> pizzas) {
        this.pizzas = pizzas;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return pizzas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item_pizza, null);
        }

        PizzaProduit pizza = pizzas.get(position);

        ImageView pizzaImageView = view.findViewById(R.id.pizzaImageView);
        TextView pizzaNameTextView = view.findViewById(R.id.pizzaNameTextView);
        TextView pizzaDurationTextView = view.findViewById(R.id.pizzaDurationTextView);
        TextView pizzaPriceTextView = view.findViewById(R.id.pizzaPriceTextView);

        // You will need to have images in your drawable folder for this to work
        // For now, we will set a placeholder image
        pizzaImageView.setImageResource(R.mipmap.ic_launcher);
        pizzaNameTextView.setText(pizza.getNom());
        pizzaDurationTextView.setText(pizza.getDuree());
        pizzaPriceTextView.setText(String.format("%.2f €", pizza.getPrix()));

        return view;
    }
}
