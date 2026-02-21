package com.example.tp6_pizza;

/**
 * Represents a Pizza product with various attributes.
 * This class is used to model a pizza with its details.
 */
public class PizzaProduit {
    // A static variable to auto-increment the ID for each new product in memory.
    private static long AUTO_ID = 1;

    // The unique ID of the pizza product.
    private long id;
    // The name of the pizza.
    private String nom;
    // The price of the pizza.
    private double prix;
    // The resource ID for the pizza's image.
    private int imageRes;
    // The preparation time for the pizza.
    private String duree;
    // The ingredients of the pizza.
    private String ingredients;
    // A short description of the pizza.
    private String description;
    // The steps to prepare the pizza.
    private String etapes;

    /**
     * Default constructor for PizzaProduit.
     * Initializes a new instance with an auto-incremented ID.
     */
    public PizzaProduit() {
        this.id = AUTO_ID++;
    }

    /**
     * Constructs a new PizzaProduit with specified details.
     *
     * @param nom         The name of the pizza.
     * @param prix        The price of the pizza.
     * @param imageRes    The resource ID for the pizza's image.
     * @param duree       The preparation time.
     * @param ingredients The list of ingredients.
     * @param description A short description of the pizza.
     * @param etapes      The preparation steps.
     */
    public PizzaProduit(String nom, double prix, int imageRes, String duree,
                        String ingredients, String description, String etapes) {
        this.id = AUTO_ID++;
        this.nom = nom;
        this.prix = prix;
        this.imageRes = imageRes;
        this.duree = duree;
        this.ingredients = ingredients;
        this.description = description;
        this.etapes = etapes;
    }

    // Getters and Setters for the fields of the PizzaProduit class.

    /**
     * Gets the unique ID of the pizza.
     * @return The ID of the pizza.
     */
    public long getId() { return id; }

    /**
     * Gets the name of the pizza.
     * @return The name of the pizza.
     */
    public String getNom() { return nom; }

    /**
     * Sets the name of the pizza.
     * @param nom The new name for the pizza.
     */
    public void setNom(String nom) { this.nom = nom; }

    /**
     * Gets the price of the pizza.
     * @return The price of the pizza.
     */
    public double getPrix() { return prix; }

    /**
     * Sets the price of the pizza.
     * @param prix The new price for the pizza.
     */
    public void setPrix(double prix) { this.prix = prix; }

    /**
     * Gets the image resource ID of the pizza.
     * @return The image resource ID.
     */
    public int getImageRes() { return imageRes; }

    /**
     * Sets the image resource ID of the pizza.
     * @param imageRes The new image resource ID.
     */
    public void setImageRes(int imageRes) { this.imageRes = imageRes; }

    /**
     * Gets the preparation time (duration) of the pizza.
     * @return The preparation time.
     */
    public String getDuree() { return duree; }

    /**
     * Sets the preparation time (duration) of the pizza.
     * @param duree The new preparation time.
     */
    public void setDuree(String duree) { this.duree = duree; }

    /**
     * Gets the ingredients of the pizza.
     * @return The ingredients list as a string.
     */
    public String getIngredients() { return ingredients; }

    /**
     * Sets the ingredients of the pizza.
     * @param ingredients The new list of ingredients.
     */
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    /**
     * Gets the description of the pizza.
     * @return The description of the pizza.
     */
    public String getDescription() { return description; }

    /**
     * Sets the description of the pizza.
     * @param description The new description for the pizza.
     */
    public void setDescription(String description) { this.description = description; }

    /**
     * Gets the preparation steps of the pizza.
     * @return The preparation steps.
     */
    public String getEtapes() { return etapes; }

    /**
     * Sets the preparation steps of the pizza.
     * @param etapes The new preparation steps.
     */
    public void setEtapes(String etapes) { this.etapes = etapes; }

    /**
     * Returns a string representation of the PizzaProduit object.
     * @return A string containing the name and price of the pizza.
     */
    @Override
    public String toString() {
        return nom + " - " + prix + " €";
    }
}