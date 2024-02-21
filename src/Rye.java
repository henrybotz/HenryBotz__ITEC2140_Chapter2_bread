/** Rye.java
 * @author Henry Botz
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: February 19, 2024
 */
public class Rye extends Bread {
    // Unique instance variables for rye bread
    private boolean hasCarawaySeeds;

    // Constructors
    public Rye() {
        // Call superclass constructor with default values
        super();
        this.hasCarawaySeeds = false; // Assuming rye bread typically doesn't have caraway seeds
    }

    public Rye(String ingredients, String recipe, boolean hasCarawaySeeds) {
        // Call superclass constructor with custom values
        super(ingredients, recipe);
        this.hasCarawaySeeds = hasCarawaySeeds;
    }

    // Getter and setter for hasCarawaySeeds
    public boolean hasCarawaySeeds() {
        return hasCarawaySeeds;
    }

    public void setCarawaySeeds(boolean hasCarawaySeeds) {
        this.hasCarawaySeeds = hasCarawaySeeds;
    }

    // Method to describe rye bread recipe
    public void describeRecipe() {
        System.out.println("Rye bread recipe:");
        System.out.println("- Mix rye flour with water, yeast, and salt");
        if (hasCarawaySeeds) {
            System.out.println("- Optionally add caraway seeds");
        }
        System.out.println("- Knead the dough and shape it");
        System.out.println("- Let it rise");
        System.out.println("- Bake until crusty");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Rye{" + "ingredients='" + getIngredients() + '\'' + ", recipe='" + getRecipe() + '\'' + ", baked=" + isBaked() + ", hasCarawaySeeds=" + hasCarawaySeeds + '}';
    }
}
