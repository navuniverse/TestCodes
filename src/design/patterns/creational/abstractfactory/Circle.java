/**
 * 
 */
package design.patterns.creational.abstractfactory;

/**
 * @author naveen.kumar
 * 
 */
public class Circle implements Shape {

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.factory.Shape#draw()
     */
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

}
