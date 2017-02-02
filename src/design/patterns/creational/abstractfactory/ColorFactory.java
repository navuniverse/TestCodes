/**
 * 
 */
package design.patterns.creational.abstractfactory;

/**
 * Class color factory to provide object of required type of color
 * 
 * @author naveen.kumar
 * 
 */
public class ColorFactory extends AbstractFactory {

    /*
     * (non-Javadoc)
     * 
     * @see
     * design.patterns.abstractfactory.AbstractFactory#getShape(java.lang.String
     * )
     */
    @Override
    public Shape getShape(String shape) {
        throw new UnsupportedOperationException(
                "Do you have any problem with your eyes that you can't see that this is a color factory. Get the shape from shape factory");
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
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else {
            throw new IllegalArgumentException(String.format(
                    "No color exist with name: %s", color));
        }
    }

}
