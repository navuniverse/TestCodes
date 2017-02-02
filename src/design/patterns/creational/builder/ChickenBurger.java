/**
 * 
 */
package design.patterns.creational.builder;

/**
 * @author naveen.kumar
 * 
 */
public class ChickenBurger extends Burger {

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.builder.Item#name()
     */
    @Override
    public String name() {
        return "Chicken Burger";
    }

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.builder.Burger#price()
     */
    @Override
    public float price() {
        return (float) 45.0;
    }

}
