# Fridge First

# Team Members name:
- Emanuel Ribeiro Lemos Pereira
- Kazuki baba
- Yafet Araya Tekelehaimanot

[Project Domain]
meal planner


[User story 1] - Emanuel

As a user, I want to add or remove an ingredient from pantry list so that i can use these ingredients to get a recipe.
The user opens the pantry panel and adds or removes an ingredient. (We expect the user to enter the ingredients that they already have in their home)

Use Case 1: Manage Pantry
The user opens the pantry panel and adds or removes an ingredient. (We expect the user to enter the ingredients that they already have in their home)
1. User enters an ingredient name.
2. User clicks "Add Ingredient" / User clicks “Remove Ingredient”
3. System validates and normalizes the name.
4. System updates the pantry.
5. System saves the pantry locally.
6. Updated pantry appears on the screen.
Alternative flows: empty ingredient name / duplicate ingredient
Precondition: App is running
Postcondition: The updated pantry is saved and displayed.

[User story 2] - Yafet

As a user, I want to set my allergies, vegan preference and calorie range target so i only get recipes which satisfies my conditions.

1. User selects food allergies or ingredients to avoid.
2. User enters a calorie range.
3. User enters vegan preference. 
4. System validates the input.
5. System saves the preferences locally.
6. System displays a confirmation.
Alternative flows: Invalid or negative calorie values
Precondition: App is running
Postcondition: Preferences are saved for future recommendations.

[User story 3] - Kazuki

As a user, I want to press generate recipe button so that i can get top 5 ranked recipes.

1. System retrieves pantry ingredients and dietary preferences.
2. System requests candidate recipes using Spoonacular.
3. System identifies recipes with no known missing ingredients.
4. System excludes recipes that conflict with stated allergy restrictions.
5. System checks available calorie information and applies the selected range.
6. System displays matching recipes with their names and calories.
Alternative flows: No matching recipes / missing calorie data / no pantry ingredients / API failure (maybe)
Precondition: Pantry contains at least one ingredient and valid preferences are available
Postcondition: Matching recipes appear, or the system displays a clear explanation of why no results are available

[User story 4] - All team members

As a user, I want to save recipes so that i can find them again quickly.

1. User selects a displayed recipe.
2. User clicks “Add to Favourites” / User clicks “Remove from Favourites”
3. System updates the favourites list.
4. System saves the favourites locally.
5. Updated favourites appear on the screen.
Alternative flows: recipe already in favourites / empty favourites list
Precondition: At least one recipe has been displayed.
Postcondition: The updated favourites list is saved and displayed.

Entites:
- Ingredient
- Pantry
- DietaryPreferences
- Recipe
- User

<img width="3061" height="7490" alt="Recipe Pantry Matching Model-2026-11-23-184717" src="https://github.com/user-attachments/assets/73f810ca-5473-4f95-ade2-9378262506f4" />

Draft of our UML Diagram.



API Name: spoonacular recipe 
API link: https://spoonacular.com/food-api/

