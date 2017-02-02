/**
 * 
 */
package design.patterns.creational.abstractfactory;

/**
 * @author naveen.kumar
 * 
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
