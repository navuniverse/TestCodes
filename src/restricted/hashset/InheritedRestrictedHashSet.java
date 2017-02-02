package restricted.hashset;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author naveen.kumar
 * 
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class InheritedRestrictedHashSet extends HashSet {

    @SuppressWarnings("unchecked")
    public void addValue(Object object) {
        if (size() < 10) {
            add(object);
        }
    }

}
