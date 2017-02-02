/**
 * 
 */
package design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author naveen.kumar
 * 
 */
public class ShapeCache {

    private static Map<String, Shape> shapeCache;

    /**
     * Method to create the shape objects once and put in map to access later
     */
    public static void loadShapeCache() {
        shapeCache = new HashMap<String, Shape>();

        Shape rectangle = new Rectangle();
        rectangle.setShapeId("Rectangle");
        shapeCache.put(rectangle.getShapeId(), rectangle);

        Shape circle = new Circle();
        circle.setShapeId("Circle");
        shapeCache.put(circle.getShapeId(), circle);
    }

    /**
     * Method to get the required object of shape from shapeCache map based on
     * shape id
     * 
     * @param shapeId
     * @return instance of Shape
     */
    public static Shape getShape(String shapeId) {
        return (Shape) shapeCache.get(shapeId).clone();
    }
}
