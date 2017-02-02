/**
 * 
 */
package design.patterns.creational.prototype;

/**
 * @author naveen.kumar
 * 
 */
public abstract class Shape implements Cloneable {

    private String shapeId;
    private String shapeType;

    /**
     * Getter for shapeId
     * 
     * @return the shapeId
     */
    public String getShapeId() {
        return shapeId;
    }

    /**
     * Setter for shapeId
     * 
     * @param shapeId
     *            the shapeId to set
     */
    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    /**
     * Getter for shapeType
     * 
     * @return the shapeType
     */
    public String getShapeType() {
        return shapeType;
    }

    /**
     * Setter for shapeType
     * 
     * @param shapeType
     *            the shapeType to set
     */
    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    /**
     * Draw shape.
     */
    public abstract void drawShape();

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cannot create clone: " + e.getMessage());
        }
        return clone;
    }
}
