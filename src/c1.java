/**
 * 
 */

/**
 * @author naveen.kumar
 * 
 */
public class c1 implements int1, int2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int1 int1 = new c1();
        int1.a(5, 6);
        int1.m1(1,1,"hi");
    }

    /*
     * (non-Javadoc)
     * 
     * @see int1#m1()
     */
    @Override
    public void m1() {
        System.out.println("overided method");

    }

    @Override
    public void m1(int i) {
        System.out.println("overloaded method");
    }

    /*
     * (non-Javadoc)
     * 
     * @see int1#a(int, int)
     */
    @Override
    public void a(int i, Integer j) {
        System.out.println(i + " int  " + j);

    }

    /* (non-Javadoc)
     * @see int1#m1(int[])
     */
    @Override
    public void m1(Object... object) {
        System.out.println("overloaded method + var-args");
        
    }
}

interface int1 {

    void m1();

    void m1(int i);
    void m1(Object... object);
    void a(int i, Integer j);
    // void a(Integer i, int j);
}

interface int2 {
    void m1();
}