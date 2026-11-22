package entity;

public class Ingredient {
    private final String name;
    public Ingredient(String ingredientName) {
        this.name = ingredientName.trim().toLowerCase();
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ingredient) {
            return ((Ingredient) obj).getName().equals(this.getName());
        }else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
