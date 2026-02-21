package com.example.tp6_pizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tp6_pizza.service.PizzaService
import com.example.tp6_pizza.ui.theme.Tp6pizzaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tp6pizzaTheme {
                // A Scaffold provides a basic layout structure.
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // We get an instance of our PizzaService.
                    val pizzaService = remember { PizzaService() }
                    // We get the list of all pizzas.
                    val pizzas = remember { pizzaService.findAll() }

                    // We display the list of pizzas.
                    PizzaList(
                        pizzas = pizzas,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * A Composable function that displays a list of pizzas.
 *
 * @param pizzas The list of pizzas to display.
 * @param modifier A Modifier for this composable.
 */
@Composable
fun PizzaList(pizzas: List<PizzaProduit>, modifier: Modifier = Modifier) {
    // A LazyColumn is a vertically scrolling list that only composes and lays out the currently visible items.
    LazyColumn(modifier = modifier) {
        // We iterate over the list of pizzas.
        items(pizzas) { pizza ->
            // For each pizza, we display its details in a PizzaListItem.
            PizzaListItem(pizza = pizza)
        }
    }
}

/**
 * A Composable function that displays a single pizza item.
 *
 * @param pizza The pizza to display.
 */
@Composable
fun PizzaListItem(pizza: PizzaProduit) {
    // A Column lays out its children in a vertical sequence.
    Column(modifier = Modifier.padding()) {
        // We display the name of the pizza.
        Text(text = pizza.nom)
        // We display the price of the pizza.
        Text(text = "Price: ${pizza.prix} €")
        // We display the description of the pizza.
        Text(text = pizza.description)
    }
}

/**
 * A Preview for the PizzaList composable.
 */
@Preview(showBackground = true)
@Composable
fun PizzaListPreview() {
    Tp6pizzaTheme {
        val pizzaService = PizzaService()
        val pizzas = pizzaService.findAll()
        PizzaList(pizzas)
    }
}
