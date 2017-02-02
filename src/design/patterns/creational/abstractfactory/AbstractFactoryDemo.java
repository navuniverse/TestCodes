/**
 * 
 */
package design.patterns.creational.abstractfactory;

/**
 * Class to show the demo of Abstract factory design pattern
 * 
 * @author naveen.kumar
 * 
 */
public class AbstractFactoryDemo {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        // getting instances of shape and color factory
        ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer
                .getFactory("SHAPE");
        ColorFactory colorFactory = (ColorFactory) FactoryProducer
                .getFactory("COLOR");

        // getting shape CIRCLE from shapeFactory
        Shape shape = shapeFactory.getShape("CIRCLE");
        // getting color RED from colorFactory
        Color color = colorFactory.getColor("RED");

        // draw the shape CIRCLE and fill the color RED
        shape.draw();
        color.fill();

        // getting shape RECTANGLE from shapeFactory
        shape = shapeFactory.getShape("RECTANGLE");
        // getting color GREEN from colorFactory
        color = colorFactory.getColor("GREEN");

        // draw the shape RECTANGLE and fill the color GREEN
        shape.draw();
        color.fill();

        // getting shape TRIANGLE from shapeFactory
        shape = shapeFactory.getShape("TRIANGLE");
        // getting color BLUE from colorFactory
        color = colorFactory.getColor("BLUE");

        // draw the shape TRIANGLE and fill the color BLUE
        shape.draw();
        color.fill();
    }

}
