/**
 * 
 */
package design.patterns.creational.prototype;

/**
 * @author naveen.kumar
 * 
 */
public class ShapeDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ShapeCache.loadShapeCache();

        Shape rectangle = ShapeCache.getShape("Rectangle");
        rectangle.drawShape();

        Shape circle = ShapeCache.getShape("Circle");
        circle.drawShape();

    }

}
