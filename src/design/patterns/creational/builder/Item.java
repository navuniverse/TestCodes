/**
 * 
 */
package design.patterns.creational.builder;

/**
 * @author naveen.kumar
 * 
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
