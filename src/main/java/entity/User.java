package entity;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String username;
    private Pantry pantry;
    private DietaryPreferences dietaryPreferences;
    private Set<Recipe> favouriteRecipes;

    public User(String username, Pantry pantry, DietaryPreferences dietaryPreferences) {
        this.username = username;
        this.pantry = pantry;
        this.dietaryPreferences = dietaryPreferences;
        this.favouriteRecipes = new HashSet<>();
    }

    public boolean addFavouriteRecipe(Recipe targetRecipe) {
        return favouriteRecipes.add(targetRecipe);
    }
    public boolean removeFavouriteRecipe(Recipe targetRecipe) {
        return favouriteRecipes.remove(targetRecipe);
    }
    public boolean isFavouriteRecipe(Recipe targetRecipe){
        return favouriteRecipes.contains(targetRecipe);
    }
    public void setDietaryPreferences(DietaryPreferences dietaryPreferences) {
        this.dietaryPreferences = dietaryPreferences;
    }
    public String getUsername() {
        return username;
    }
    public Pantry getPantry() {
        return pantry;
    }
    public DietaryPreferences getDietaryPreferences() {
        return dietaryPreferences;
    }
    public Set<Recipe> getFavouriteRecipes() {
        return favouriteRecipes;
    }
}
