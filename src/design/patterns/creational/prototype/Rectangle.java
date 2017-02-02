/**
 * 
 */
package design.patterns.creational.prototype;

/**
 * @author naveen.kumar
 * 
 */
public class Rectangle extends Shape {

    public Rectangle() {
        setShapeType("Rectangle");
    }

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.prototype.Shape#drawShape()
     */
    @Override
    public void drawShape() {
        System.out.println("Drawing Shape: " + getShapeType());
    }

}
