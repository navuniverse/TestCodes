/**
 * 
 */
package design.patterns.creational.abstractfactory;

/**
 * @author naveen.kumar
 * 
 */
public class Red implements Color {

    /*
     * (non-Javadoc)
     * 
     * @see design.patterns.abstractfactory.Color#fill()
     */
    @Override
    public void fill() {
        System.out.println("Fill with Red color.");

    }

}
