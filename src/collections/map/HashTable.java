/**
 * 
 */
package collections.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * Hashtable- <li>
 * <ol>
 * synchronized
 * </ol>
 * <ol>
 * does not allow null key or value
 * </ol>
 * <ol>
 * slow due to synchronization
 * </ol>
 * <ol>
 * good to use in multi-threaded application
 * </ol>
 * <ol>
 * alternative is ConcurrentHashMap
 * </ol>
 * </li>
 * 
 * @author naveen.kumar
 * 
 */
public class HashTable {

    private static Map<Object, Object> hashTable = new Hashtable<Object, Object>();

    /**
     * Method to add value in HashTable
     * 
     * @param key
     * @param value
     */
    public static void addValue(Object key, Object value) {
        hashTable.put(key, value);
    }

    /**
     * Method to get value from HashTable
     * 
     * @param key
     * @return value corresponding to key
     */
    public static Object getValue(Object key) {
        return hashTable.get(key);
    }

    /**
     * Method to get the complete HashTable
     * 
     * @return hashTable
     */
    public static Map<Object, Object> getHashTable() {
        return hashTable;
    }
}
