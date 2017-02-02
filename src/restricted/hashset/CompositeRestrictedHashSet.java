package restricted.hashset;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author naveen.kumar
 * 
 */
public class CompositeRestrictedHashSet {

    @SuppressWarnings("rawtypes")
    private Set set = new HashSet();

    /**
     * Getter for set
     * 
     * @return the set
     */
    @SuppressWarnings("rawtypes")
    public Set getSet() {
        return set;
    }

    @SuppressWarnings("unchecked")
    public void addValue(Object object) {
        if (set.size() < 10) {
            set.add(object);
        }
    }

}
