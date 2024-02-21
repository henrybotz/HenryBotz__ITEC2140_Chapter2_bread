/** Brioche.java
 * @author Henry Botz
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: February 19, 2024
 */

public class Brioche extends Bread {
    // Unique instance variables for brioche
    private boolean hasEggs;
    private boolean hasButter;

    // Constructors
    public Brioche() {
        // Call superclass constructor with default values
        super();
        this.hasEggs = true; // Brioche typically contains eggs
        this.hasButter = true; // Brioche typically contains butter
    }

    public Brioche(String ingredients, String recipe, boolean hasEggs, boolean hasButter) {
        // Call superclass constructor with custom values
        super(ingredients, recipe);
        this.hasEggs = hasEggs;
        this.hasButter = hasButter;
    }

    // Getters and setters for hasEggs and hasButter
    public boolean hasEggs() {
        return hasEggs;
    }

    public void setEggs(boolean hasEggs) {
        this.hasEggs = hasEggs;
    }

    public boolean hasButter() {
        return hasButter;
    }

    public void setButter(boolean hasButter) {
        this.hasButter = hasButter;
    }

    // Method to describe brioche recipe
    public void describeRecipe() {
        System.out.println("Brioche recipe:");
        System.out.println("- Mix flour, eggs, sugar, and yeast");
        System.out.println("- Add butter and continue mixing");
        System.out.println("- Let the dough rise");
        System.out.println("- Shape into desired forms");
        System.out.println("- Bake until golden brown");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Brioche{" + "ingredients='" + getIngredients() + '\'' + ", recipe='" + getRecipe() + '\'' + ", baked=" + isBaked() + ", hasEggs=" + hasEggs + ", hasButter=" + hasButter + '}';
    }
}
