/**
 * 
 */
package collections.map;

/**
 * @author naveen.kumar
 * 
 */
public class HashTableDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HashTable.addValue("one", 1);
        HashTable.addValue("two", 2);
        HashTable.addValue("three", 3);
        HashTable.addValue("four", 4);
        HashTable.addValue("five", 5);
        System.out.println("Map Stats after 5 entries: ");
        System.out.println("Map Size: " + HashTable.getHashTable().size());
        System.out.println("map Values: " + HashTable.getHashTable());

        HashTable.addValue("six", 6);
        HashTable.addValue("seven", 7);
        HashTable.addValue("eight", 8);
        HashTable.addValue("nine", 9);
        HashTable.addValue("ten", 10);
        System.out.println("Map Stats after 10 entries: ");
        System.out.println("Map Size: " + HashTable.getHashTable().size());
        System.out.println("map Values: " + HashTable.getHashTable());

        HashTable.addValue("eleven", 11);
        HashTable.addValue("twelve", 12);
        HashTable.addValue("thirteen", 13);
        HashTable.addValue("fouteen", 14);
        HashTable.addValue("fifteen", 15);
        System.out.println("Map Stats after 15 entries: ");
        System.out.println("Map Size: " + HashTable.getHashTable().size());
        System.out.println("map Values: " + HashTable.getHashTable());

        HashTable.addValue("sixteen", 16);
        HashTable.addValue("seventeen", 17);
        HashTable.addValue("eighteen", 18);
        HashTable.addValue("ninteen", 19);
        HashTable.addValue("twenty", 20);
        System.out.println("Map Stats after 20 entries: ");
        System.out.println("Map Size: " + HashTable.getHashTable().size());
        System.out.println("map Values: " + HashTable.getHashTable());

        HashTable.addValue("twenty one", 21);
        HashTable.addValue("twenty one", 22);
        HashTable.addValue("twenty one", 23);
        HashTable.addValue("twenty one", 24);
        HashTable.addValue("twenty one", 25);
        System.out.println("Map Stats after 25 entries: ");
        System.out.println("Map Size: " + HashTable.getHashTable().size());
        System.out.println("map Values: " + HashTable.getHashTable());
    }

}
