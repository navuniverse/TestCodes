/**
 * 
 */
package collections.map;

/**
 * @author naveen.kumar
 * 
 */
public class LinkedHashMap {

    /* Creating HashMap with initial size 20 and load factor 0.50 */
    private static java.util.Map<Object, Object> map = new java.util.LinkedHashMap<Object, Object>(
            20, (float) 0.50);

    /**
     * Method to add new value in LinkedHashMap
     * 
     * @param key
     * @param value
     */
    public static void addValue(Object key, Object value) {
        map.put(key, value);
    }

    /**
     * Method to get value from LinkedHashMap
     * 
     * @param key
     * @return value corresponding to key
     */
    public static Object getValue(Object key) {
        return map.get(key);
    }

    /**
     * Method to get the LinkedHashMap
     * 
     * @return map
     */
    public static java.util.Map<Object, Object> getHashMap() {
        return map;
    }
}
