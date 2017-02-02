/**
 * 
 */
package design.patterns.creational.factory;

/**
 * Main class to demo the use of factory pattern
 * 
 * @author naveen.kumar
 * 
 */
public class FactoryPatternDemo {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        // getting shape CIRCLE from ShapeFactory. Creation logic is not visible
        // here
        Shape shape = ShapeFactory.getShape("CIRCLE");
        shape.draw();

        // getting shape RECTANGLE from ShapeFactory.
        shape = ShapeFactory.getShape("RECTANGLE");
        shape.draw();

        // getting shape TRIANGLE from ShapeFactory.
        shape = ShapeFactory.getShape("TRIANGLE");
        shape.draw();
    }

}
