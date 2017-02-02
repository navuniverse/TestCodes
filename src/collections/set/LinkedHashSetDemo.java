/**
 * 
 */
package collections.set;

import java.util.Iterator;

/**
 * @author naveen.kumar
 * 
 */
public class LinkedHashSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedHashSet.addValue("one");
        LinkedHashSet.addValue("two");
        LinkedHashSet.addValue("three");
        LinkedHashSet.addValue("four");
        LinkedHashSet.addValue("five");
        System.out.println("Set Stats after 5 entries: ");
        System.out.println("Set Size: "
                + LinkedHashSet.getLinkedHashSet().size());
        System.out.println("Set Values: " + LinkedHashSet.getLinkedHashSet());

        LinkedHashSet.addValue("six");
        LinkedHashSet.addValue("seven");
        LinkedHashSet.addValue("eight");
        LinkedHashSet.addValue("nine");
        LinkedHashSet.addValue("ten");
        System.out.println("Set Stats after 10 entries: ");
        System.out.println("Set Size: "
                + LinkedHashSet.getLinkedHashSet().size());
        System.out.println("Set Values: " + LinkedHashSet.getLinkedHashSet());

        LinkedHashSet.addValue("eleven");
        LinkedHashSet.addValue("twelve");
        LinkedHashSet.addValue("thirteen");
        LinkedHashSet.addValue("fouteen");
        LinkedHashSet.addValue("fifteen");
        System.out.println("Set Stats after 15 entries: ");
        System.out.println("Set Size: "
                + LinkedHashSet.getLinkedHashSet().size());
        System.out.println("Set Values: " + LinkedHashSet.getLinkedHashSet());

        LinkedHashSet.addValue("sixteen");
        LinkedHashSet.addValue("seventeen");
        LinkedHashSet.addValue("eighteen");
        LinkedHashSet.addValue("ninteen");
        LinkedHashSet.addValue("twenty");
        LinkedHashSet.addValue("twenty");
        System.out.println("Set Stats after 20 entries: ");
        System.out.println("Set Size: "
                + LinkedHashSet.getLinkedHashSet().size());
        System.out.println("Set Values: " + LinkedHashSet.getLinkedHashSet());

        for (Iterator<Object> iterator = LinkedHashSet.getLinkedHashSet()
                .iterator(); iterator.hasNext();) {
            Object object = iterator.next();
            if (object.equals("ten")) {
                iterator.remove();
            }
        }

        System.out.println("Set Values after removing ten: "
                + LinkedHashSet.getLinkedHashSet());

    }

}
