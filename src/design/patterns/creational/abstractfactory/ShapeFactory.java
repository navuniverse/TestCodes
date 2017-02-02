/**
 * 
 */
package design.patterns.creational.abstractfactory;

/**
 * Class ShapeFactory that creates a new object of shape type as required
 * 
 * @author naveen.kumar
 * 
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * Method to get the required shape type either one of three available -
     * {@link Circle}, {@link Rectangle} or {@link Triangle}
     * 
     * @param shape
     * @return object of required shape
     */
    @Override
    public Shape getShape(String shape) {
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

    /*
     * (non-Javadoc)
     * 
     * @see
     * design.patterns.abstractfactory.AbstractFactory#getColor(java.lang.String
     * )
     */
    @Override
    public Color getColor(String color) {
        throw new UnsupportedOperationException(
                "Do you have any problem with your eyes that you can't see that this is a shape factory. Get the color from color factory");
    }
}
