package entity;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Pantry {
    private final Set<Ingredient> ingredients = new LinkedHashSet<>();

    /** Returns false if the ingredient is already in the pantry. */
    public boolean add(Ingredient ingredient) {
        return ingredients.add(ingredient);
    }

    /** Returns false if the ingredient was not in the pantry. */
    public boolean remove(Ingredient ingredient) {
        return ingredients.remove(ingredient);
    }

    public boolean contains(Ingredient ingredient) {
        return ingredients.contains(ingredient);
    }

    /** Returns a copy so callers can't change the pantry directly. */
    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}
