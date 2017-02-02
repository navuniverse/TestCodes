/**
 * 
 */
package linkedlist.doubly;

import java.util.Scanner;

/**
 * @author naveen.kumar
 * 
 */
public class DoublyLinkedListTesting {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = null;
        DoublyLinkedListOperations doublyLinkedList = new DoublyLinkedListOperations();
        char ch;
        int value;
        int position;

        try {
            scan = new Scanner(System.in);
            System.out.println("\n Doubly Linked List Testing- ");

            do {
                System.out.println("\n Doubly Linked List Operations\n");
                System.out.println(" 1. Insertion");
                System.out.println(" 2. Deletion");
                System.out.println(" 3. Traversal");
                System.out.println(" 4. Size");
                System.out.println(" 5. Exit");
                System.out.print(" Enter your choice- ");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\n DOUBLY LINKED LIST INSERTION");
                        System.out.print(" Enter number to insert- ");
                        value = scan.nextInt();
                        System.out.print(" Enter position to insert- ");
                        position = scan.nextInt();
                        if (doublyLinkedList
                                .insertInLinkedList(value, position)) {
                            System.out.println(" Insertion Successfull!!!");
                        } else {
                            System.out.println(" Insertion Failed!!!");
                        }
                        break;

                    case 2:
                        System.out.println("\n DOUBLY LINKED LIST DELETION");
                        System.out.print(" Enter position to delete- ");
                        position = scan.nextInt();

                        if (doublyLinkedList.deleteInLinkedList(position)) {
                            System.out.println(" Deletion Successfull!!!");
                        } else {
                            System.out.println(" Deletion Failed!!!");
                        }

                        break;

                    case 3:
                        System.out
                                .println("\n DOUBLY LINKED LIST TRAVERSAL IN FORWARD DIRECTION");
                        doublyLinkedList.traverseDoublyLinkedListForward();
                        break;

                    case 4:
                        System.out.println("\n DOUBLY LINKED LIST SIZE: "
                                + doublyLinkedList.getSize());
                        break;

                    case 5:
                        System.out.println("\n Exitting!!!!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println(" Please provide a valid choice!!");
                        break;
                }
                System.out.print("\n Do you want to continue (Y|N)- ");
                ch = scan.next().charAt(0);
            } while (ch == 'y' || ch == 'Y');
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }

}
