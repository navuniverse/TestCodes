/**
 * 
 */

/**
 * @author naveen.kumar
 * 
 */
public class Pattern {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (i = 5; i > 1; i--) {
            if (i == 5) {
                for (j = 1; j <= 5; j++) {
                    System.out.print(j);
                    continue;
                }
                System.out.println();
                System.out.print(i);
            }
            for (j = 4; j >= 1; j--) {
                System.out.print(5 - j);
            }
            System.out.println();
            if (i > 2) {
                System.out.print(i - 1);
            }
        }

    }

}
