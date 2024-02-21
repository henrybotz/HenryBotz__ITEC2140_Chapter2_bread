/** Baguette.java
 * @author Henry Botz
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: February 19, 2024
 */

public class Baguette extends Bread {

    // Unique instance variables for baguette
    private boolean isLongShape;

    // Constructors
    public Baguette() {
        // Call superclass constructor with default values
        super();
        this.isLongShape = true; // Assuming baguettes are typically long in shape
    }

    public Baguette(String ingredients, String recipe, boolean isLongShape) {
        // Call superclass constructor with custom values
        super(ingredients, recipe);
        this.isLongShape = isLongShape;
    }

    // Getter and setter for isLongShape
    public boolean isLongShape() {
        return isLongShape;
    }

    public void setLongShape(boolean longShape) {
        isLongShape = longShape;
    }

    // Method to describe baguette recipe
    public void describeRecipe() {
        System.out.println("Baguette recipe:");
        System.out.println("- Mix flour, water, yeast, and salt");
        System.out.println("- Shape the dough into a long, narrow loaf");
        System.out.println("- Let it rise");
        System.out.println("- Score the top of the dough");
        System.out.println("- Bake until golden brown");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Baguette{" + "ingredients='" + getIngredients() + '\'' + ", recipe='" + getRecipe() + '\'' + ", baked=" + isBaked() + ", isLongShape=" + isLongShape + '}';
    }
}
