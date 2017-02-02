/**
 * 
 */
package collections.map;

import java.util.Map;

/**
 * @author naveen.kumar
 * 
 */
public class TreeMap {

    private static Map<Object, Object> map = new java.util.TreeMap<Object, Object>();

    /**
     * Method to add new value in TreeMap
     * 
     * @param key
     * @param value
     */
    public static void addValue(Object key, Object value) {
        map.put(key, value);
    }

    /**
     * Method to get value from TreeMap corresponding to key
     * 
     * @param key
     * @return value corresponding to key
     */
    public static Object getValue(Object key) {
        return map.get(key);
    }

    /**
     * Method to get the complete TreeMap
     * 
     * @return
     */
    public static Map<Object, Object> getTreeMap() {
        return map;
    }
}
