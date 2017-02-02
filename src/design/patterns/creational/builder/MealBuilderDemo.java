/**
 * 
 */
package design.patterns.creational.builder;

import java.util.Scanner;

/**
 * @author naveen.kumar
 * 
 */
public class MealBuilderDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char mealChoice;
        char orderMore = 'y';
        int mealQuantity;
        while (orderMore == 'y' || orderMore == 'Y') {
            System.out
                    .print("Please enter type of meal required: Veg(V) OR Non-Veg(N)- ");
            mealChoice = reader.next().charAt(0);
            System.out.print("Please enter quantity of meal required: ");
            mealQuantity = reader.nextBigInteger().intValue();

            if (mealChoice == 'v' || mealChoice == 'V') {
                System.out.println("\n--------------Veg Meal-----------------");
                MealBuilder.prepareVegMeal(mealQuantity);
                System.out.println("---------------------------------------");
            } else if (mealChoice == 'n' || mealChoice == 'N') {
                System.out.println("\n------------Non-Veg Meal---------------");
                MealBuilder.prepareNonVegMeal(mealQuantity);
                System.out.println("---------------------------------------");
            }

            System.out.print("\nWant to order another meal: Yes(Y) OR No(N)- ");
            orderMore = reader.next().charAt(0);
        }

        if (reader != null) {
            reader.close();
        }

        System.out
                .println("----------------Thank You for Using Our Service--------------");
    }

}
