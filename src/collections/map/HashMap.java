/**
 * 
 */
package collections.map;

/**
 * @author naveen.kumar
 * 
 */
public class HashMap {

    /* Creating HashMap with initial size 20 and load factor 0.50 */
    private static java.util.Map<Object, Object> map = new java.util.HashMap<Object, Object>(
            20, (float) 0.50);

    /**
     * Method to add new value in HashMap
     * 
     * @param key
     * @param value
     */
    public static void addValue(Object key, Object value) {
        map.put(key, value);
    }

    /**
     * Method to get value from HashMap
     * 
     * @param key
     * @return value corresponding to key
     */
    public static Object getValue(Object key) {
        return map.get(key);
    }

    /**
     * Method to get the HashMap
     * 
     * @return map
     */
    public static java.util.Map<Object, Object> getHashMap() {
        return map;
    }
}
