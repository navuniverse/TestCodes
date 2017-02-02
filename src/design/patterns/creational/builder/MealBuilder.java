/**
 * 
 */
package design.patterns.creational.builder;

/**
 * @author naveen.kumar
 * 
 */
public class MealBuilder {

    public static void prepareVegMeal(int quantity) {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.showOrderDetails(quantity);
    }

    public static void prepareNonVegMeal(int quantity) {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        meal.showOrderDetails(quantity);
    }
}
