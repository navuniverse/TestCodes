/**
 * 
 */
package linkedlist.doubly;

/**
 * @author naveen.kumar
 * 
 */
public class DoublyLinkedList {

    private int data;
    private DoublyLinkedList nextPointer;
    private DoublyLinkedList backPointer;

    /**
     * Default Constructor
     */
    public DoublyLinkedList() {
        data = 0;
        nextPointer = null;
        backPointer = null;
    }

    /**
     * Parameterized Constructor
     * 
     * @param data
     * @param nextPointer
     * @param backPointer
     */
    public DoublyLinkedList(int data, DoublyLinkedList nextPointer,
            DoublyLinkedList backPointer) {
        this.data = data;
        this.nextPointer = nextPointer;
        this.backPointer = backPointer;
    }

    /**
     * Getter for data
     * 
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * Setter for data
     * 
     * @param data
     *            the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Getter for nextPointer
     * 
     * @return the nextPointer
     */
    public DoublyLinkedList getNextPointer() {
        return nextPointer;
    }

    /**
     * Setter for nextPointer
     * 
     * @param nextPointer
     *            the nextPointer to set
     */
    public void setNextPointer(DoublyLinkedList nextPointer) {
        this.nextPointer = nextPointer;
    }

    /**
     * Getter for backPointer
     * 
     * @return the backPointer
     */
    public DoublyLinkedList getBackPointer() {
        return backPointer;
    }

    /**
     * Setter for backPointer
     * 
     * @param backPointer
     *            the backPointer to set
     */
    public void setBackPointer(DoublyLinkedList backPointer) {
        this.backPointer = backPointer;
    }

}
