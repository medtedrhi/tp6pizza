package com.example.tp6_pizza.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tp6_pizza.PizzaProduit;
import com.example.tp6_pizza.R;
import com.example.tp6_pizza.adapter.PizzaListAdapter;
import com.example.tp6_pizza.service.PizzaService;
import java.util.List;

/**
 * This activity displays a list of available pizzas.
 * It allows users to see a summary of each pizza and select one for more details.
 */
public class ListPizzaActivity extends AppCompatActivity {

    // The ListView that will display the pizzas.
    private ListView pizzaListView;
    // The service class for accessing pizza data.
    private PizzaService pizzaService;

    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to our custom layout for the pizza list.
        setContentView(R.layout.activity_list_pizza);

        // Initialize the ListView and the PizzaService.
        pizzaListView = findViewById(R.id.pizzaListView);
        pizzaService = new PizzaService();

        // Retrieve all the pizzas from the service.
        List<PizzaProduit> pizzas = pizzaService.findAll();

        // Create an instance of our custom adapter.
        PizzaListAdapter adapter = new PizzaListAdapter(this, pizzas);

        // Set the adapter on the ListView to display the data.
        pizzaListView.setAdapter(adapter);

        // Set an item click listener on the ListView to handle user taps.
        pizzaListView.setOnItemClickListener((parent, view, position, id) -> {
            // When a pizza is tapped, create an Intent to open the PizzaDetailActivity.
            Intent intent = new Intent(this, PizzaDetailActivity.class);
            // Get the pizza id directly from our list to avoid relying on the
            // ListView's 'id' parameter which can be unreliable in some setups.
            long pizzaId = pizzas.get(position).getId();
            intent.putExtra("pizza_id", pizzaId);
            // Start the detail activity.
            startActivity(intent);
        });
    }
}
