package com.example.tp6_pizza.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp6_pizza.PizzaProduit;
import com.example.tp6_pizza.R;
import com.example.tp6_pizza.service.PizzaService;

/**
 * This activity displays the full details of a single pizza.
 * It retrieves the pizza's information based on the ID passed from the ListPizzaActivity.
 */
public class PizzaDetailActivity extends AppCompatActivity {

    // The service for fetching pizza data.
    private PizzaService pizzaService;

    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to our custom layout for the pizza detail screen.
        setContentView(R.layout.activity_pizza_detail);

        // Initialize the PizzaService.
        pizzaService = new PizzaService();

        // Get the pizza ID from the intent that started this activity.
        long pizzaId = getIntent().getLongExtra("pizza_id", -1);

        // Find the pizza by its ID.
        PizzaProduit pizza = pizzaService.findById(pizzaId);

        // If the pizza is found, populate the UI with its details.
        if (pizza != null) {
            // Get references to all the views in our layout.
            ImageView detailPizzaImage = findViewById(R.id.detailPizzaImage);
            TextView detailPizzaName = findViewById(R.id.detailPizzaName);
            TextView detailPizzaDescription = findViewById(R.id.detailPizzaDescription);
            TextView detailPizzaIngredients = findViewById(R.id.detailPizzaIngredients);
            TextView detailPizzaSteps = findViewById(R.id.detailPizzaSteps);

            // Set the pizza's data to the corresponding views.
            // Use the same image resource from the pizza model (mipmap images assigned in PizzaService).
            int imgRes = pizza.getImageRes();
            if (imgRes != 0) {
                detailPizzaImage.setImageResource(imgRes);
            } else {
                detailPizzaImage.setImageResource(R.mipmap.icon);
            }
            detailPizzaName.setText(pizza.getNom());
            detailPizzaDescription.setText(pizza.getDescription());
            detailPizzaIngredients.setText(pizza.getIngredients());
            detailPizzaSteps.setText(pizza.getEtapes());
        } else {
            // If the pizza is not found, show a toast message and finish the activity.
            Toast.makeText(this, "Pizza not found", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
