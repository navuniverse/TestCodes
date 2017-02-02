/**
 * 
 */
package design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naveen.kumar
 * 
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost(int quantity) {
        float cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        System.out.println("\nItems Cost\t:\tRs. " + (quantity * cost));
        float vat = (float) (quantity * cost * 0.1236);
        System.out.println("VAT 12.36%\t:\tRs. " + vat);
        return (quantity * cost) + vat;
    }

    public void showOrderDetails(int quantity) {
        System.out.println("------------Order Details--------------");
        for (Item item : items) {
            System.out.println("\nItem Name\t:\t " + item.name());
            System.out.println("Item Price\t:\t Rs. " + item.price());
            System.out.println("Item Packing\t:\t " + item.packing().pack());
            System.out.println("Item Quanity\t:\t " + quantity);
        }
        float totalCost = getCost(quantity);
        System.out.println("\nTotal Cost\t:\tRs. " + totalCost);
    }
}
