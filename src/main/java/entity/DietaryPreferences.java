package entity;

import java.util.*;

public class DietaryPreferences {
    private final Set<String> allergies = new HashSet<>();
    private final boolean vegan;
    private final int minCalories;
    private final int maxCalories;

    public DietaryPreferences(Set<String> allergies, boolean vegan,
                              int minCalories, int maxCalories) {
        for (String a : allergies) {
            this.allergies.add(a.trim().toLowerCase(Locale.ROOT));
        }
        this.vegan = vegan;
        this.minCalories = minCalories;
        this.maxCalories = maxCalories;
    }

    public boolean isValidRange() {
        return minCalories >= 0 && maxCalories >= 0 && minCalories <= maxCalories;
    }

    /** Substring match, so "peanut" catches "peanut butter". */
    public boolean isAllergicTo(Ingredient ingredient) {
        for (String a : allergies) {
            if (ingredient.getName().contains(a)) return true;
        }
        return false;
    }

    /** Policy: recipes with unknown calories are allowed (UI can flag them). */
    public boolean allowsCalories(Recipe recipe) {
        if (!recipe.hasCalories()) return true;
        int c = recipe.getCalories();
        return c >= minCalories && c <= maxCalories;
    }

    public Set<String> getAllergies() { return new HashSet<>(allergies); }
    public boolean isVegan() { return vegan; }
    public int getMinCalories() { return minCalories; }
    public int getMaxCalories() { return maxCalories; }
}