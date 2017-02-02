/**
 * 
 */
package collections.map;

import java.util.Iterator;

/**
 * @author naveen.kumar
 * 
 */
public class HashMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        HashMap.addValue("one", 1);
        HashMap.addValue("two", 2);
        HashMap.addValue("three", 3);
        HashMap.addValue("four", 4);
        HashMap.addValue("five", 5);
        System.out.println("Map Stats after 5 entries: ");
        System.out.println("Map Size: " + HashMap.getHashMap().size());
        System.out.println("map Values: " + HashMap.getHashMap());

        HashMap.addValue("six", 6);
        HashMap.addValue("seven", 7);
        HashMap.addValue("eight", 8);
        HashMap.addValue("nine", 9);
        HashMap.addValue("ten", 10);
        System.out.println("Map Stats after 10 entries: ");
        System.out.println("Map Size: " + HashMap.getHashMap().size());
        System.out.println("map Values: " + HashMap.getHashMap());

        HashMap.addValue("eleven", 11);
        HashMap.addValue("twelve", 12);
        HashMap.addValue("thirteen", 13);
        HashMap.addValue("fouteen", 14);
        HashMap.addValue("fifteen", 15);
        System.out.println("Map Stats after 15 entries: ");
        System.out.println("Map Size: " + HashMap.getHashMap().size());
        System.out.println("map Values: " + HashMap.getHashMap());

        HashMap.addValue("sixteen", 16);
        HashMap.addValue("seventeen", 17);
        HashMap.addValue("eighteen", 18);
        HashMap.addValue("ninteen", 19);
        HashMap.addValue("twenty", 20);
        System.out.println("Map Stats after 20 entries: ");
        System.out.println("Map Size: " + HashMap.getHashMap().size());
        System.out.println("map Values: " + HashMap.getHashMap());

        HashMap.addValue("twenty one", 21);
        HashMap.addValue(null, 22);
        HashMap.addValue(null, 23);
        HashMap.addValue("twenty one", 24);
        HashMap.addValue("twenty one", 25);
        System.out.println("Map Stats after 25 entries: ");
        System.out.println("Map Size: " + HashMap.getHashMap().size());
        System.out.println("map Values: " + HashMap.getHashMap());

        System.out.println("Value of null: " + HashMap.getValue(null));

        for (Iterator<Object> iterator = HashMap.getHashMap().values()
                .iterator(); iterator.hasNext();) {
            Object object = iterator.next();
            System.out.println(object);
        }

    }

}
