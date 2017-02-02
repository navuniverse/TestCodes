/**
 * 
 */
package linkedlist.singly;

/**
 * @author naveen.kumar
 * 
 */
public class SinglyLinkedListOperations {

    private SinglyLinkedList startNode;
    private SinglyLinkedList endNode;
    private int size;

    /**
     * Default Constructor
     */
    public SinglyLinkedListOperations() {
        startNode = null;
        endNode = null;
        size = 0;
    }

    /**
     * Getter for size
     * 
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Method to check whether the SinglyLinked list is empty
     * 
     * @return true if list is empty
     */
    public boolean isEmpty() {
        return startNode == null;
    }

    /**
     * Method to traverse the singly list Traversing means visiting each node in
     * linked list exactly once
     * 
     */
    public void traverseLinkedList() {

        System.out.print(" Nodes in Singly Linked List: ");
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        if (startNode.getPointer() == null) {
            System.out.println(startNode.getData());
            return;
        }
        SinglyLinkedList ptr = startNode;
        System.out.print(startNode.getData() + "->");
        ptr = startNode.getPointer();
        while (ptr.getPointer() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getPointer();
        }
        System.out.println(ptr.getData());
    }

    /**
     * Method to insert a new node in singly linked list at any position
     * 
     * @param value
     * @param position
     */
    public boolean insertInLinkedList(int value, int position) {

        SinglyLinkedList newNode = new SinglyLinkedList(value, null);

        if (null == startNode) {
            /* Checking if linked list is empty */
            System.out
                    .println(" No Linked List present. Creating new Singly list and inserting the element.");
            startNode = newNode;
            endNode = startNode;
        } else if (position == 1) {
            /* Insertion at beginning */
            System.out.println(" Inserting at start of linked list.");
            newNode.setPointer(startNode);
            startNode = newNode;
        } else if (position == size + 1) {
            /* Insertion at end */
            System.out.println(" Inserting at end of linked list.");
            endNode.setPointer(newNode);
            endNode = newNode;
        } else {
            /* Insertion at any position */
            if (position > size + 1 || position < 1) {
                System.out.println(" Invalid Position to insert!!");
                traverseLinkedList();
                return false;
            }

            SinglyLinkedList pointer = startNode;
            for (int i = 1; i <= size; i++) {
                if (i == position - 1) {
                    SinglyLinkedList tempNode = pointer.getPointer();
                    pointer.setPointer(newNode);
                    newNode.setPointer(tempNode);
                    break;
                }
                pointer = pointer.getPointer();
            }
        }

        size++;
        traverseLinkedList();
        return true;
    }

    /**
     * Method to delete a node in singly linked list at any position
     * 
     * @param position
     */
    public boolean deleteInLinkedList(int position) {

        if (position == 1) {
            /* Deleting the first node in linked list */
            System.out.println(" Deleting the first node of linked list.");
            startNode = startNode.getPointer();
        } else if (position == size) {
            /* Deleting the last node in linked list */
            System.out.println(" Deleting the last node of linked list.");
            SinglyLinkedList list = startNode;
            SinglyLinkedList tempNode = startNode;

            while (list != endNode) {
                tempNode = list;
                list = list.getPointer();
            }
            endNode = tempNode;
            endNode.setPointer(null);
        } else {
            /* Deletion at any position */
            if (position > size || position < 1) {
                System.out.println(" Invalid Position to delete!!");
                traverseLinkedList();
                return false;
            }

            SinglyLinkedList pointer = startNode;
            for (int i = 1; i <= size; i++) {
                if (i == position - 1) {
                    SinglyLinkedList tempNode = pointer.getPointer();
                    tempNode = tempNode.getPointer();
                    pointer.setPointer(tempNode);
                    break;
                }
                pointer = pointer.getPointer();
            }
        }

        size--;
        traverseLinkedList();
        return true;
    }
}
