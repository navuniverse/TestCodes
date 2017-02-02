/**
 * 
 */
package collections.set;

import java.util.Iterator;

/**
 * @author naveen.kumar
 * 
 */
public class TreeSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeSet.addValue("one");
        TreeSet.addValue("two");
        TreeSet.addValue("three");
        TreeSet.addValue("four");
        TreeSet.addValue("five");
        System.out.println("Set Stats after 5 entries: ");
        System.out.println("Set Size: " + TreeSet.getTreeSet().size());
        System.out.println("Set Values: " + TreeSet.getTreeSet());

        TreeSet.addValue("six");
        TreeSet.addValue("seven");
        TreeSet.addValue("eight");
        TreeSet.addValue("nine");
        TreeSet.addValue("ten");
        System.out.println("Set Stats after 10 entries: ");
        System.out.println("Set Size: " + TreeSet.getTreeSet().size());
        System.out.println("Set Values: " + TreeSet.getTreeSet());

        TreeSet.addValue("eleven");
        TreeSet.addValue("twelve");
        TreeSet.addValue("thirteen");
        TreeSet.addValue("fouteen");
        TreeSet.addValue("fifteen");
        System.out.println("Set Stats after 15 entries: ");
        System.out.println("Set Size: " + TreeSet.getTreeSet().size());
        System.out.println("Set Values: " + TreeSet.getTreeSet());

        TreeSet.addValue("sixteen");
        TreeSet.addValue("seventeen");
        TreeSet.addValue("eighteen");
        TreeSet.addValue("ninteen");
        TreeSet.addValue("twenty");
        TreeSet.addValue("twenty");
        System.out.println("Set Stats after 20 entries: ");
        System.out.println("Set Size: " + TreeSet.getTreeSet().size());
        System.out.println("Set Values: " + TreeSet.getTreeSet());

        for (Iterator<Object> iterator = TreeSet.getTreeSet().iterator(); iterator
                .hasNext();) {
            Object object = iterator.next();
            if (object.equals("ten")) {
                iterator.remove();
            }
        }

        System.out.println("Set Values after removing ten: "
                + TreeSet.getTreeSet());

    }

}
