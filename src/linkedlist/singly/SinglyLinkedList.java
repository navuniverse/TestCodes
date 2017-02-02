/**
 * 
 */
package linkedlist.singly;

/**
 * @author naveen.kumar
 * 
 */
public class SinglyLinkedList {

    private int data;
    private SinglyLinkedList pointer;

    /**
     * Default Constructor
     * 
     * @param data
     * @param pointer
     */
    public SinglyLinkedList() {
        data = 0;
        pointer = null;
    }

    /**
     * Parameterised Constructor
     * 
     * @param data
     * @param pointer
     */
    public SinglyLinkedList(int data, SinglyLinkedList pointer) {
        this.data = data;
        this.pointer = pointer;
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
     * Getter for pointer
     * 
     * @return the pointer
     */
    public SinglyLinkedList getPointer() {
        return pointer;
    }

    /**
     * Setter for pointer
     * 
     * @param pointer
     *            the pointer to set
     */
    public void setPointer(SinglyLinkedList pointer) {
        this.pointer = pointer;
    }

}
