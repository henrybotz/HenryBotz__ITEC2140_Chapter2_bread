/** Bread.java
 * @author Henry Botz
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: February 19, 2024
 */

public class Bread {
    // Properties
    private String ingredients;
    private String recipe;
    public boolean baked;

    // Default constructor with general ingredients and recipe
    public Bread() {
        this.ingredients = "Flour, water, yeast, salt, sugar";
        this.recipe = "Mix ingredients, knead dough, let it rise, shape, bake";
        this.baked = false;
    }

    // Constructor with parameters
    public Bread(String ingredients, String recipe) {
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.baked = false;
    }

    // Getter and setter methods
    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    // toString method
    @Override
    public String toString() {
        return "Bread{" + "ingredients='" + ingredients + '\'' + ", recipe='" + recipe + '\'' + ", baked=" + baked + '}';
    }

    // Method to bake the bread
    public void bake() {
        if (!baked) {
            baked = true;
            System.out.println("The bread is now baked.");
        } else {
            System.out.println("The bread is already baked.");
        }
    }
}

