/**
 * 
 */
package collections.map;

/**
 * @author naveen.kumar
 * 
 */
public class LinkedHashMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedHashMap.addValue("one", 1);
        LinkedHashMap.addValue("two", 2);
        LinkedHashMap.addValue("three", 3);
        LinkedHashMap.addValue("four", 4);
        LinkedHashMap.addValue("five", 5);
        System.out.println("Map Stats after 5 entries: ");
        System.out.println("Map Size: " + LinkedHashMap.getHashMap().size());
        System.out.println("map Values: " + LinkedHashMap.getHashMap());

        LinkedHashMap.addValue("six", 6);
        LinkedHashMap.addValue("seven", 7);
        LinkedHashMap.addValue("eight", 8);
        LinkedHashMap.addValue("nine", 9);
        LinkedHashMap.addValue("ten", 10);
        System.out.println("Map Stats after 10 entries: ");
        System.out.println("Map Size: " + LinkedHashMap.getHashMap().size());
        System.out.println("map Values: " + LinkedHashMap.getHashMap());

        LinkedHashMap.addValue("eleven", 11);
        LinkedHashMap.addValue("twelve", 12);
        LinkedHashMap.addValue("thirteen", 13);
        LinkedHashMap.addValue("fouteen", 14);
        LinkedHashMap.addValue("fifteen", 15);
        System.out.println("Map Stats after 15 entries: ");
        System.out.println("Map Size: " + LinkedHashMap.getHashMap().size());
        System.out.println("map Values: " + LinkedHashMap.getHashMap());

        LinkedHashMap.addValue("sixteen", 16);
        LinkedHashMap.addValue("seventeen", 17);
        LinkedHashMap.addValue("eighteen", 18);
        LinkedHashMap.addValue("ninteen", 19);
        LinkedHashMap.addValue("twenty", 20);
        System.out.println("Map Stats after 20 entries: ");
        System.out.println("Map Size: " + LinkedHashMap.getHashMap().size());
        System.out.println("map Values: " + LinkedHashMap.getHashMap());

        LinkedHashMap.addValue("twenty one", 21);
        LinkedHashMap.addValue("twenty one", 22);
        LinkedHashMap.addValue("twenty one", 23);
        LinkedHashMap.addValue("twenty one", 24);
        LinkedHashMap.addValue("twenty one", 25);
        System.out.println("Map Stats after 25 entries: ");
        System.out.println("Map Size: " + LinkedHashMap.getHashMap().size());
        System.out.println("map Values: " + LinkedHashMap.getHashMap());

    }

}
