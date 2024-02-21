/** Pastries.java
 * @author Henry Botz
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: February 19, 2024
 */
public class Pastry extends Bread {
    // Unique instance variables for pastry
    private String filling;

    // Constructors
    public Pastry() {
        // Call superclass constructor with default values
        super();
        this.filling = "None";
    }

    public Pastry(String ingredients, String recipe, String filling) {
        // Call superclass constructor with custom values
        super(ingredients, recipe);
        this.filling = filling;
    }

    // Getter and setter for filling
    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    // Method to describe pastry recipe
    public void describeRecipe() {
        System.out.println("Pastry recipe:");
        System.out.println("- Prepare the dough");
        System.out.println("- Roll out the dough");
        System.out.println("- Add filling: " + filling);
        System.out.println("- Shape the pastry");
        System.out.println("- Bake until golden brown");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Pastry{" + "ingredients='" + getIngredients() + '\'' + ", recipe='" + getRecipe() + '\'' + ", baked=" + isBaked() + ", filling='" + filling + '\'' + '}';
    }
}
