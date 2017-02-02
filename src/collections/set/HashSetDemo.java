/**
 * 
 */
package collections.set;

import java.util.Iterator;

/**
 * @author naveen.kumar
 * 
 */
public class HashSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HashSet.addValue("one");
        HashSet.addValue("two");
        HashSet.addValue("three");
        HashSet.addValue("four");
        HashSet.addValue("five");
        System.out.println("Set Stats after 5 entries: ");
        System.out.println("Set Size: " + HashSet.getHashSet().size());
        System.out.println("Set Values: " + HashSet.getHashSet());

        HashSet.addValue("six");
        HashSet.addValue("seven");
        HashSet.addValue("eight");
        HashSet.addValue("nine");
        HashSet.addValue("ten");
        System.out.println("Set Stats after 10 entries: ");
        System.out.println("Set Size: " + HashSet.getHashSet().size());
        System.out.println("Set Values: " + HashSet.getHashSet());

        HashSet.addValue("eleven");
        HashSet.addValue("twelve");
        HashSet.addValue("thirteen");
        HashSet.addValue("fouteen");
        HashSet.addValue("fifteen");
        System.out.println("Set Stats after 15 entries: ");
        System.out.println("Set Size: " + HashSet.getHashSet().size());
        System.out.println("Set Values: " + HashSet.getHashSet());

        HashSet.addValue("sixteen");
        HashSet.addValue("seventeen");
        HashSet.addValue("eighteen");
        HashSet.addValue("ninteen");
        HashSet.addValue("twenty");
        HashSet.addValue("twenty");
        System.out.println("Set Stats after 20 entries: ");
        System.out.println("Set Size: " + HashSet.getHashSet().size());
        System.out.println("Set Values: " + HashSet.getHashSet());

        for (Iterator<Object> iterator = HashSet.getHashSet().iterator(); iterator
                .hasNext();) {
            Object object = iterator.next();
            if (object.equals("ten")) {
                iterator.remove();
            }
        }

        System.out.println("Set Values after removing ten: "
                + HashSet.getHashSet());
    }

}
