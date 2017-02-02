/**
 * 
 */
package design.patterns.creational.builder;

/**
 * @author naveen.kumar
 * 
 */
public class Pepsi extends ColdDrink {

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.builder.Item#name()
     */
    @Override
    public String name() {
        return "Pepsi";
    }

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.builder.ColdDrink#price()
     */
    @Override
    public float price() {
        return (float) 30.0;
    }

}
