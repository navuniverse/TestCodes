/**
 * 
 */
package linkedlist.doubly;

/**
 * @author naveen.kumar
 * 
 */
public class DoublyLinkedListOperations {

    private DoublyLinkedList startNode;
    private DoublyLinkedList endNode;
    private int size;

    /**
     * Default Constructor
     */
    public DoublyLinkedListOperations() {
        startNode = null;
        endNode = null;
        size = 0;
    }

    /**
     * Getter for size
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Method to check whether the Doubly Linked List is empty
     * 
     * @return true - if list is empty
     */
    public boolean isEmpty() {
        return startNode == null;
    }

    /**
     * Method to traverse the doubly linked list in forward direction.
     * Traversing means visiting each node in linked list exactly once
     * 
     */
    public void traverseDoublyLinkedListForward() {

        System.out.print(" Nodes in Doubly Linked List: ");
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        if (startNode.getNextPointer() == null) {
            System.out.println(startNode.getData());
            return;
        }
        DoublyLinkedList ptr = startNode;
        System.out.print(startNode.getData() + "->");
        ptr = startNode.getNextPointer();
        while (ptr.getNextPointer() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getNextPointer();
        }
        System.out.println(ptr.getData());
    }

    /**
     * Method to traverse the doubly linked list in backward direction.
     * Traversing means visiting each node in linked list exactly once
     * 
     */
    public void traverseDoublyLinkedListBackward() {

        System.out.print(" Nodes in Doubly Linked List: ");
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        if (endNode.getBackPointer() == null) {
            System.out.println(startNode.getData());
            return;
        }
        DoublyLinkedList ptr = endNode;
        System.out.print(endNode.getData() + "->");
        ptr = endNode.getBackPointer();
        while (ptr.getBackPointer() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getBackPointer();
        }
        System.out.println(ptr.getData());
    }

    /**
     * Method to insert a new node in doubly linked list at any position
     * 
     * @param value
     * @param position
     */
    public boolean insertInLinkedList(int value, int position) {

        DoublyLinkedList newNode = new DoublyLinkedList(value, null, null);

        if (null == startNode) {
            /* Checking if linked list is empty */
            System.out
                    .println(" No Linked List present. Creating new Doubly list and inserting the element.");
            startNode = newNode;
            endNode = startNode;
        } else if (position == 1) {
            /* Insertion at beginning */
            System.out.println(" Inserting at start of linked list.");
            newNode.setNextPointer(startNode);
            startNode.setBackPointer(newNode);
            startNode = newNode;
        } else if (position == size + 1) {
            /* Insertion at end */
            System.out.println(" Inserting at end of linked list.");
            endNode.setNextPointer(newNode);
            newNode.setBackPointer(newNode);
            endNode = newNode;
        } else {
            /* Insertion at any position */
            if (position > size + 1 || position < 1) {
                System.out.println(" Invalid Position to insert!!");
                traverseDoublyLinkedListForward();
                return false;
            }

            DoublyLinkedList pointer = startNode;
            for (int i = 1; i <= size; i++) {
                if (i == position - 1) {
                    DoublyLinkedList tempNextNode = pointer.getNextPointer();
                    pointer.setNextPointer(newNode);
                    newNode.setBackPointer(pointer);
                    newNode.setNextPointer(tempNextNode);
                    break;
                }
                pointer = pointer.getNextPointer();
            }
        }

        size++;
        traverseDoublyLinkedListForward();
        return true;
    }

    /**
     * Method to delete a node in doubly linked list at any position
     * 
     * @param position
     */
    public boolean deleteInLinkedList(int position) {

        if (position == 1) {
            /* Deleting the first node in doubly linked list */
            System.out
                    .println(" Deleting the first node in doubly linked list.");
            startNode = startNode.getNextPointer();
            startNode.setBackPointer(null);
        } else if (position == size) {
            /* Deleting the last node in linked list */
            System.out.println(" Deleting the last node in linked list.");
            endNode = endNode.getBackPointer();
            endNode.setNextPointer(null);
        } else {
            /* Deletion at any position */
            if (position > size || position < 1) {
                System.out.println(" Invalid Position to delete!!");
                traverseDoublyLinkedListForward();
                return false;
            }

            DoublyLinkedList pointer = startNode;
            for (int i = 1; i <= size; i++) {
                if (i == position) {
                    DoublyLinkedList tempNextNode = pointer.getNextPointer();
                    DoublyLinkedList tempPreviousNode = pointer
                            .getBackPointer();
                    tempPreviousNode.setNextPointer(tempNextNode);
                    pointer.setBackPointer(null);
                    pointer.setNextPointer(null);
                    tempNextNode.setBackPointer(tempPreviousNode);
                    break;
                }
                pointer = pointer.getNextPointer();
            }
        }

        size--;
        traverseDoublyLinkedListForward();
        return true;
    }
}
