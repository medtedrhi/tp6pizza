package com.example.tp6_pizza;

import java.util.List;

/**
 * Data Access Object (DAO) interface for PizzaProduit.
 * This interface defines the standard operations to be performed on a PizzaProduit model object.
 *
 * @param <T> The type of the object, which must be a PizzaProduit.
 */
public interface IPizzaDao<T> {

    /**
     * Creates a new pizza product in the data source.
     *
     * @param t The pizza product to create.
     * @return The created pizza product with its new ID.
     */
    T create(T t);

    /**
     * Updates an existing pizza product in the data source.
     *
     * @param t The pizza product to update.
     * @return The updated pizza product.
     */
    T update(T t);

    /**
     * Deletes a pizza product from the data source using its ID.
     *
     * @param id The ID of the pizza product to delete.
     * @return true if the deletion was successful, false otherwise.
     */
    boolean delete(long id);

    /**
     * Finds a pizza product by its ID.
     *
     * @param id The ID of the pizza product to find.
     * @return The found pizza product, or null if not found.
     */
    T findById(long id);

    /**
     * Retrieves all pizza products from the data source.
     *
     * @return A list of all pizza products.
     */
    List<T> findAll();
}
