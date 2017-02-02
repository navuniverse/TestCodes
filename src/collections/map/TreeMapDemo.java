/**
 * 
 */
package collections.map;

/**
 * @author naveen.kumar
 * 
 */
public class TreeMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeMap.addValue("one", 1);
        TreeMap.addValue("two", 2);
        TreeMap.addValue("three", 3);
        TreeMap.addValue("four", 4);
        TreeMap.addValue("five", 5);
        System.out.println("Map Stats after 5 entries: ");
        System.out.println("Map Size: " + TreeMap.getTreeMap().size());
        System.out.println("map Values: " + TreeMap.getTreeMap());

        TreeMap.addValue("six", 6);
        TreeMap.addValue("seven", 7);
        TreeMap.addValue("eight", 8);
        TreeMap.addValue("nine", 9);
        TreeMap.addValue("ten", 10);
        System.out.println("Map Stats after 10 entries: ");
        System.out.println("Map Size: " + TreeMap.getTreeMap().size());
        System.out.println("map Values: " + TreeMap.getTreeMap());

        TreeMap.addValue("eleven", 11);
        TreeMap.addValue("twelve", 12);
        TreeMap.addValue("thirteen", 13);
        TreeMap.addValue("fouteen", 14);
        TreeMap.addValue("fifteen", 15);
        System.out.println("Map Stats after 15 entries: ");
        System.out.println("Map Size: " + TreeMap.getTreeMap().size());
        System.out.println("map Values: " + TreeMap.getTreeMap());

        TreeMap.addValue("sixteen", 16);
        TreeMap.addValue("seventeen", 17);
        TreeMap.addValue("eighteen", 18);
        TreeMap.addValue("ninteen", 19);
        TreeMap.addValue("twenty", 20);
        System.out.println("Map Stats after 20 entries: ");
        System.out.println("Map Size: " + TreeMap.getTreeMap().size());
        System.out.println("map Values: " + TreeMap.getTreeMap());

        TreeMap.addValue("twenty one", 21);
        TreeMap.addValue("twenty one", 22);
        TreeMap.addValue("twenty one", 23);
        TreeMap.addValue("twenty one", 24);
        TreeMap.addValue("twenty one", 25);
        System.out.println("Map Stats after 25 entries: ");
        System.out.println("Map Size: " + TreeMap.getTreeMap().size());
        System.out.println("map Values: " + TreeMap.getTreeMap());

    }

}
