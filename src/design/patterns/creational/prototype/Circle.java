/**
 * 
 */
package design.patterns.creational.prototype;

/**
 * @author naveen.kumar
 * 
 */
public class Circle extends Shape {

    public Circle() {
        setShapeType("Circle");
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
