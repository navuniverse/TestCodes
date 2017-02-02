package restricted.hashset;
/**
 * @author naveen.kumar
 * 
 */
public class HashSetExample {

    public static void main(String[] args) {
        /* Using InheritedRestrictedHashSet */
        InheritedRestrictedHashSet restrictedHashSet = new InheritedRestrictedHashSet();
        int i = 0;
        while (i < 20) {
            restrictedHashSet.addValue(i);
            i++;
        }
        System.out.println("HashSet Size using InheritedRestrictedHashSet : "
                + restrictedHashSet.size());

        /* Using CompositeRestrictedHashSet */
        CompositeRestrictedHashSet compositeRestrictedHashSet = new CompositeRestrictedHashSet();
        i = 0;
        while (i < 20) {
            compositeRestrictedHashSet.addValue(i);
            i++;
        }
        System.out.println("HashSet Size using CompositeRestrictedHashSet : "
                + compositeRestrictedHashSet.getSet().size());
    }
}
