package com.example.tp6_pizza.service;

import com.example.tp6_pizza.IPizzaDao;
import com.example.tp6_pizza.PizzaProduit;
import com.example.tp6_pizza.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A service class that provides in-memory implementation of the IPizzaDao.
 * This class is used for managing pizza data for the application.
 */
public class PizzaService implements IPizzaDao<PizzaProduit> {
    // A shared list to store pizza products in memory so all service
    // instances see the same data (prevents ID mismatches between
    // different PizzaService instances created in different activities).
    private static List<PizzaProduit> pizzaProduits = new ArrayList<>();

    /**
     * Constructor for PizzaService.
     * Initializes the service with some default pizza data.
     */
    public PizzaService() {
        // Populate sample data only once.
        if (pizzaProduits.isEmpty()) {
            // We are adding some sample pizzas here. The image resource IDs are set
            // to mipmap resources (pizza1..pizza10) that exist in the project.
            pizzaProduits.add(new PizzaProduit("BBQ BEEF SUPREME", 4.0, R.mipmap.pizza1, "40 min",
                "- 1/2 pound ground beef\n- 1/2 cup barbecue sauce\n- 1 prebaked pizza crust\n- 1 small red onion, sliced\n- 1/2 cup corn kernels\n- 2 cups shredded mozzarella cheese\n- 1/2 teaspoon black pepper",
                "A smoky and savory pizza loaded with seasoned beef, sweet corn and melted cheese. Perfect for family dinners and weekend treats.",
                "STEP 1:\n\n  Cook ground beef over medium heat until browned; drain excess fat. Stir in barbecue sauce and pepper.\n\nSTEP 2:\n\n  Spread beef mixture over pizza crust. Top with onion, corn and mozzarella cheese.\n\nSTEP 3:\n\n  Bake at 400° for 15-18 minutes or until cheese is melted and bubbly. Yield: 8 slices."
        ));

        pizzaProduits.add(new PizzaProduit("VEGGIE DELIGHT PIZZA", 3.0, R.mipmap.pizza2, "30 min",
                "- 1 prebaked thin crust\n- 1/2 cup tomato sauce\n- 1/2 cup sliced mushrooms\n- 1/2 cup chopped bell peppers\n- 1/4 cup sliced olives\n- 2 cups shredded mozzarella cheese\n- 1 teaspoon Italian seasoning",
                "A colorful vegetarian pizza packed with fresh vegetables and delicious melted cheese. Light, healthy and full of flavor.",
                "STEP 1:\n\n  Spread tomato sauce evenly over crust.\n\nSTEP 2:\n\n  Add mushrooms, bell peppers and olives. Sprinkle with Italian seasoning.\n\nSTEP 3:\n\n  Top with mozzarella and bake at 425° for 12-15 minutes until golden brown. Yield: 6 slices."
        ));

        pizzaProduits.add(new PizzaProduit("CREAMY GARLIC CHICKEN PIZZA", 5.0, R.mipmap.pizza3, "45 min",
                "- 1 pizza dough\n- 1/2 cup Alfredo sauce\n- 1 cup cooked chicken, diced\n- 1/2 cup sliced mushrooms\n- 1/2 teaspoon garlic powder\n- 2 cups mozzarella cheese",
                "A rich and creamy pizza topped with tender chicken and garlic flavor that melts perfectly with mozzarella cheese.",
                "STEP 1:\n\n  Roll out pizza dough onto greased pan.\n\nSTEP 2:\n\n  Spread Alfredo sauce over dough. Add chicken and mushrooms.\n\nSTEP 3:\n\n  Sprinkle garlic powder and mozzarella cheese on top.\n\nSTEP 4:\n\n  Bake at 400° for 18-20 minutes until crust is golden. Yield: 8 slices."
        ));

        pizzaProduits.add(new PizzaProduit("SPICY TUNA PIZZA", 2.0, R.mipmap.pizza4, "25 min",
                "- 1 prebaked crust\n- 1 can tuna, drained\n- 1/4 cup mayonnaise\n- 1/4 teaspoon chili flakes\n- 1 small onion, sliced\n- 1 cup mozzarella cheese",
                "A bold and spicy tuna pizza with creamy texture and a slight kick. Perfect for seafood lovers.",
                "STEP 1:\n\n  Mix tuna with mayonnaise and chili flakes.\n\nSTEP 2:\n\n  Spread mixture over crust and add onion slices.\n\nSTEP 3:\n\n  Top with mozzarella and bake at 400° for 12-15 minutes. Yield: 6 slices."
        ));

        pizzaProduits.add(new PizzaProduit("MEDITERRANEAN FETA PIZZA", 4.0, R.mipmap.pizza5, "35 min",
                "- 1 pizza crust\n- 1/2 cup tomato sauce\n- 1/2 cup cherry tomatoes\n- 1/4 cup black olives\n- 1/2 cup crumbled feta cheese\n- 1 cup mozzarella cheese",
                "A Mediterranean-inspired pizza with tangy feta, olives and fresh tomatoes for a refreshing taste.",
                "STEP 1:\n\n  Spread sauce over crust.\n\nSTEP 2:\n\n  Add cherry tomatoes and olives.\n\nSTEP 3:\n\n  Sprinkle feta and mozzarella cheese.\n\nSTEP 4:\n\n  Bake at 425° for 15 minutes until cheese melts. Yield: 8 slices."
        ));

        pizzaProduits.add(new PizzaProduit("HAWAIIAN PINEAPPLE PIZZA", 5.0, R.mipmap.pizza6, "30 min",
                "- 1 prebaked crust\n- 1/2 cup pizza sauce\n- 1 cup diced ham\n- 1/2 cup pineapple chunks\n- 2 cups mozzarella cheese",
                "A sweet and savory classic with juicy pineapple and smoky ham over melted cheese.",
                "STEP 1:\n\n  Spread pizza sauce over crust.\n\nSTEP 2:\n\n  Add ham and pineapple evenly.\n\nSTEP 3:\n\n  Cover with mozzarella cheese.\n\nSTEP 4:\n\n  Bake at 400° for 15 minutes until bubbly. Yield: 8 slices."
        ));

        pizzaProduits.add(new PizzaProduit("BUFFALO CHICKEN PIZZA", 3.0, R.mipmap.pizza7, "35 min",
                "- 1 pizza crust\n- 1/2 cup buffalo sauce\n- 1 cup cooked chicken, shredded\n- 1/4 cup red onion slices\n- 2 cups mozzarella cheese",
                "A spicy and tangy buffalo chicken pizza with bold flavors and creamy melted cheese.",
                "STEP 1:\n\n  Spread buffalo sauce over crust.\n\nSTEP 2:\n\n  Top with shredded chicken and onion.\n\nSTEP 3:\n\n  Sprinkle mozzarella cheese.\n\nSTEP 4:\n\n  Bake at 425° for 15-18 minutes. Yield: 8 slices."
        ));

        pizzaProduits.add(new PizzaProduit("FOUR CHEESE PIZZA", 1.0, R.mipmap.pizza8, "20 min",
                "- 1 thin pizza crust\n- 1/2 cup pizza sauce\n- 1/2 cup mozzarella\n- 1/2 cup cheddar\n- 1/4 cup parmesan\n- 1/4 cup provolone",
                "A cheese lover’s dream featuring four rich and melty cheeses blended to perfection.",
                "STEP 1:\n\n  Spread sauce over crust.\n\nSTEP 2:\n\n  Sprinkle all cheeses evenly.\n\nSTEP 3:\n\n  Bake at 425° for 12-15 minutes until golden. Yield: 6 slices."
        ));

        pizzaProduits.add(new PizzaProduit("MUSHROOM LOVERS PIZZA", 2.0, R.mipmap.pizza9, "30 min",
                "- 1 pizza crust\n- 1/2 cup tomato sauce\n- 1 cup sliced mushrooms\n- 1/2 teaspoon oregano\n- 2 cups mozzarella cheese",
                "A simple yet flavorful mushroom pizza packed with earthy taste and cheesy goodness.",
                "STEP 1:\n\n  Spread tomato sauce on crust.\n\nSTEP 2:\n\n  Add mushrooms and oregano.\n\nSTEP 3:\n\n  Top with mozzarella and bake at 400° for 15 minutes. Yield: 8 slices."
        ));

            pizzaProduits.add(new PizzaProduit("ITALIAN SAUSAGE CLASSIC", 5.0, R.mipmap.pizza10, "45 min",
                    "- 1 pizza dough\n- 1/2 pound Italian sausage\n- 1/2 cup pizza sauce\n- 1 small green pepper, sliced\n- 2 cups mozzarella cheese",
                    "A hearty Italian-style pizza with savory sausage and fresh peppers baked to perfection.",
                    "STEP 1:\n\n  Cook sausage until browned; drain.\n\nSTEP 2:\n\n  Roll dough onto greased pan and spread sauce.\n\nSTEP 3:\n\n  Add sausage, green pepper and mozzarella.\n\nSTEP 4:\n\n  Bake at 400° for 20 minutes until crust is golden. Yield: 8 slices."
            ));
        }
    }

    @Override
    public PizzaProduit create(PizzaProduit pizzaProduit) {
        pizzaProduits.add(pizzaProduit);
        return pizzaProduit;
    }

    @Override
    public PizzaProduit update(PizzaProduit pizzaProduit) {
        for (int i = 0; i < pizzaProduits.size(); i++) {
            if (pizzaProduits.get(i).getId() == pizzaProduit.getId()) {
                pizzaProduits.set(i, pizzaProduit);
                return pizzaProduit;
            }
        }
        return null; // Or throw an exception if not found
    }

    @Override
    public boolean delete(long id) {
        PizzaProduit pizzaToRemove = findById(id);
        if (pizzaToRemove != null) {
            return pizzaProduits.remove(pizzaToRemove);
        }
        return false;
    }

    @Override
    public PizzaProduit findById(long id) {
        for (PizzaProduit p : pizzaProduits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<PizzaProduit> findAll() {
        return new ArrayList<>(pizzaProduits);
    }
}
