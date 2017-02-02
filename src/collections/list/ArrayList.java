/**
 * 
 */
package collections.list;

import java.util.List;

/**
 * @author naveen.kumar
 * 
 */
public class ArrayList {

    private static List<Object> list = new java.util.ArrayList<Object>();

    /**
     * Method to add a new value in the ArrayList
     * 
     * @param value
     */
    public static void addValue(Object value) {
        boolean addSuccess = list.add(value);
        System.out.println(String.format(
                "Adding %s value in list and added: %s", value, addSuccess));
    }

    /**
     * Method to get a value from the ArrayList
     * 
     * @param index
     * @return value corresponding to index position
     */
    public static Object getValue(int index) {
        return list.get(index);
    }

    /**
     * Method to get the complete ArrayList
     * 
     * @return list
     */
    public static List<Object> getArrayList() {
        return list;
    }
}
