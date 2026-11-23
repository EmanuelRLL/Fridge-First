package entity;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Pantry {
    private final Set<Ingredient> ingredients = new LinkedHashSet<>();

    public boolean add(Ingredient ingredient) {
        return ingredients.add(ingredient);
    }


    public boolean remove(Ingredient ingredient) {
        return ingredients.remove(ingredient);
    }

    public boolean contains(Ingredient ingredient) {
        return ingredients.contains(ingredient);
    }


    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}
