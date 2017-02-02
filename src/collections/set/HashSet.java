/**
 * 
 */
package collections.set;

import java.util.Set;

/**
 * @author naveen.kumar
 * 
 */
public class HashSet {

    private static Set<Object> set = new java.util.HashSet<Object>();

    /**
     * Method to add a new value in the HashSet
     * 
     * @param value
     */
    public static void addValue(Object value) {
        boolean success = set.add(value);
        System.out.println(String.format("Adding value %s and added: %s",
                value, success));
    }

    /**
     * Method to check whether the value present in HashSet or not
     * 
     * @param value
     * @return true, if value exist in HashSet
     */
    public static boolean hasValue(Object value) {
        return set.contains(value);
    }

    /**
     * Method to get the complete HashSet
     * 
     * @return set
     */
    public static Set<Object> getHashSet() {
        return set;
    }
}
