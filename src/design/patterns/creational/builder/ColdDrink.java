/**
 * 
 */
package design.patterns.creational.builder;

/**
 * @author naveen.kumar
 * 
 */
public abstract class ColdDrink implements Item {

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.builder.Item#packing()
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.creational.builder.Item#price()
     */
    @Override
    public abstract float price();

}
