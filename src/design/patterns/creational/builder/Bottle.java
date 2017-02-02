/**
 * 
 */
package design.patterns.creational.builder;

/**
 * @author naveen.kumar
 * 
 */
public class Bottle implements Packing {

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.builder.Packing#pack()
     */
    @Override
    public String pack() {
        return "Bottle";
    }

}
