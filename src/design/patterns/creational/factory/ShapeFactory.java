/**
 * 
 */
package design.patterns.creational.factory;

/**
 * Class ShapeFactory that creates a new object of shape type as required
 * 
 * @author naveen.kumar
 * 
 */
public class ShapeFactory {

    /**
     * Method to get the required shape type either one of three available -
     * {@link Circle}, {@link Rectangle} or {@link Triangle}
     * 
     * @param shape
     * @return object of required shape
     */
    public static Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException(String.format(
                    "No shape exist with name: %s", shape));
        }
    }
}
