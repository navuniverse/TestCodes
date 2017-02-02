/**
 * 
 */
package collections.set;

import java.util.Set;

/**
 * @author naveen.kumar
 * 
 */
public class LinkedHashSet {

    private static Set<Object> set = new java.util.LinkedHashSet<Object>();

    /**
     * Method to add a new value in the LinkedHashSet
     * 
     * @param value
     */
    public static void addValue(Object value) {
        boolean success = set.add(value);
        System.out.println(String.format("Adding value %s and added: %s",
                value, success));
    }

    /**
     * Method to check whether the value present in LinkedHashSet or not
     * 
     * @param value
     * @return true, if value exist in LinkedHashSet
     */
    public static boolean hasValue(Object value) {
        return set.contains(value);
    }

    /**
     * Method to get the complete LinkedHashSet
     * 
     * @return set
     */
    public static Set<Object> getLinkedHashSet() {
        return set;
    }
}
