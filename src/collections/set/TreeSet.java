/**
 * 
 */
package collections.set;

import java.util.Set;

/**
 * @author naveen.kumar
 * 
 */
public class TreeSet {

    private static Set<Object> set = new java.util.TreeSet<Object>();

    /**
     * Method to add a new value in the TreeSet
     * 
     * @param value
     */
    public static void addValue(Object value) {
        boolean success = set.add(value);
        System.out.println(String.format("Adding value %s and added: %s",
                value, success));
    }

    /**
     * Method to check whether the value present in TreeSet or not
     * 
     * @param value
     * @return true, if value exist in TreeSet
     */
    public static boolean hasValue(Object value) {
        return set.contains(value);
    }

    /**
     * Method to get the complete TreeSet
     * 
     * @return set
     */
    public static Set<Object> getTreeSet() {
        return set;
    }
}
