/**
 * 
 */
package collections.list;

import java.util.ListIterator;

/**
 * @author naveen.kumar
 * 
 */
public class ArrayListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList.addValue("one");
        ArrayList.addValue("two");
        ArrayList.addValue("three");
        ArrayList.addValue("four");
        ArrayList.addValue("five");
        System.out.println("List Stats after 5 entries: ");
        System.out.println("List Size: " + ArrayList.getArrayList().size());
        System.out.println("List Values: " + ArrayList.getArrayList());

        ArrayList.addValue("six");
        ArrayList.addValue("seven");
        ArrayList.addValue("eight");
        ArrayList.addValue("nine");
        ArrayList.addValue("ten");
        System.out.println("List Stats after 10 entries: ");
        System.out.println("List Size: " + ArrayList.getArrayList().size());
        System.out.println("List Values: " + ArrayList.getArrayList());

        ArrayList.addValue("eleven");
        ArrayList.addValue("twelve");
        ArrayList.addValue("thirteen");
        ArrayList.addValue("fouteen");
        ArrayList.addValue("fifteen");
        System.out.println("List Stats after 15 entries: ");
        System.out.println("List Size: " + ArrayList.getArrayList().size());
        System.out.println("List Values: " + ArrayList.getArrayList());

        ArrayList.addValue("sixteen");
        ArrayList.addValue("seventeen");
        ArrayList.addValue("eighteen");
        ArrayList.addValue("ninteen");
        ArrayList.addValue("twenty");
        ArrayList.addValue("twenty");
        System.out.println("List Stats after 20 entries: ");
        System.out.println("List Size: " + ArrayList.getArrayList().size());
        System.out.println("List Values: " + ArrayList.getArrayList());

        for (ListIterator<Object> iterator = ArrayList.getArrayList()
                .listIterator(); iterator.hasNext();) {
            Object object = iterator.next();
            if (object.equals("ten")) {
                iterator.remove();
            }
        }

        System.out.println("List Values after removing ten: "
                + ArrayList.getArrayList());
    }

}
