/**
 * 
 */
package design.patterns.creational.abstractfactory;

/**
 * Class to return a type of factory: {@link ColorFactory} or
 * {@link ShapeFactory}, depending on choice
 * 
 * @author naveen.kumar
 * 
 */
public class FactoryProducer {

    /**
     * Method to get the factory as required
     * 
     * @param factory
     * @return object of required factory type
     */
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            throw new IllegalArgumentException(String.format(
                    "No factory found with name: %s", factory));
        }
    }
}
