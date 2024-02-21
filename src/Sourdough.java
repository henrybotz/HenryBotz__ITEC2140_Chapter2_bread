/** Sourdough.java
 * @author Henry Botz
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: February 19, 2024
 */

public class SourdoughBread extends Bread {
    // Unique instance variables for sourdough bread
    private boolean isStarterUsed;

    // Constructors
    public SourdoughBread() {
        // Call superclass constructor with default values
        super();
        this.isStarterUsed = true;
    }

    public SourdoughBread(String ingredients, String recipe, boolean isStarterUsed) {
        // Call superclass constructor with custom values
        super(ingredients, recipe);
        this.isStarterUsed = isStarterUsed;
    }

    // Getter and setter for isStarterUsed
    public boolean isStarterUsed() {
        return isStarterUsed;
    }

    public void setStarterUsed(boolean starterUsed) {
        isStarterUsed = starterUsed;
    }

    // Method to describe sourdough bread recipe
    public void describeRecipe() {
        System.out.println("Sourdough bread recipe:");
        System.out.println("- Mix sourdough starter with flour and water");
        System.out.println("- Allow the dough to ferment");
        System.out.println("- Knead the dough and shape it");
        System.out.println("- Let it rise");
        System.out.println("- Bake in a preheated oven");
    }

    // Override toString method
    @Override
    public String toString() {
        return "SourdoughBread{" + "ingredients='" + getIngredients() + '\'' + ", recipe='" + getRecipe() + '\'' + ", baked=" + isBaked() + ", isStarterUsed=" + isStarterUsed + '}';
    }
}
