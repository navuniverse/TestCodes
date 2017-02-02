/**
 * 
 */
package linkedlist.singly;

import java.util.Scanner;

/**
 * @author naveen.kumar
 * 
 */
public class SinglyLinkedListTesting {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = null;
        SinglyLinkedListOperations singlyLinkedList = new SinglyLinkedListOperations();
        char ch;
        int value;
        int position;

        try {
            scan = new Scanner(System.in);
            System.out.println("\n Singly Linked List Testing- ");

            do {
                System.out.println("\n Singly Linked List Operations\n");
                System.out.println(" 1. Insertion");
                System.out.println(" 2. Deletion");
                System.out.println(" 3. Traversal");
                System.out.println(" 4. Size");
                System.out.println(" 5. Exit");
                System.out.print(" Enter your choice- ");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\n SINGLY LINKED LIST INSERTION");
                        System.out.print(" Enter number to insert- ");
                        value = scan.nextInt();
                        System.out.print(" Enter position to insert- ");
                        position = scan.nextInt();
                        if (singlyLinkedList
                                .insertInLinkedList(value, position)) {
                            System.out.println(" Insertion Successfull!!!");
                        } else {
                            System.out.println(" Insertion Failed!!!");
                        }
                        break;

                    case 2:
                        System.out.println("\n SINGLY LINKED LIST DELETION");
                        System.out.print(" Enter position to delete- ");
                        position = scan.nextInt();
                        if (singlyLinkedList.deleteInLinkedList(position)) {
                            System.out.println(" Deletion Successfull!!!");
                        } else {
                            System.out.println(" Deletion Failed!!!");
                        }
                        break;

                    case 3:
                        System.out.println("\n SINGLY LINKED LIST TRAVERSAL");
                        singlyLinkedList.traverseLinkedList();
                        break;

                    case 4:
                        System.out.println("\n SINGLY LINKED LIST SIZE: "
                                + singlyLinkedList.getSize());
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
