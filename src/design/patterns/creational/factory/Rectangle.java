/**
 * 
 */
package design.patterns.creational.factory;

/**
 * @author naveen.kumar
 * 
 */
public class Rectangle implements Shape {

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.factory.Shape#draw()
     */
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");

    }

}
