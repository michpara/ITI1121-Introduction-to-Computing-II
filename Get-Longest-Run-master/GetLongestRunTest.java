/**
* Test cases for the class <code>GetLongestRun</code>.
*
* @author Marcel Turcotte (marcel.turcotte@uottawa.ca)
*/

public class GetLongestRunTest {

    /**
    * In Java, an application must have a <code>main</code> method. Its signature must
    * exactly as below. Otherwise, the virtual machinine will fail to find
    * the entry point to your program. On the command line, you can run
    * this program as follows:
    * <pre>
    * $ java GetLongestRunTest
    * </pre>
    * See <a href="https://docs.oracle.com/javase/tutorial/getStarted/application/index.html">https://docs.oracle.com/javase/tutorial/getStarted/application/index.html</a>.
    *
    * @param args the parameters passed on the command line when executing the program
    *
    */

    public static void main(String[] args){

        double[] a;

        StudentInfo.display();

        System.out.println("Testing GetLongestRun.getLongestRun:");
        System.out.println();

        a = new double[] {1.0, 1.0, 2.0, 3.0, 3.0, 3.0, 3.0, 3.0, 6.0, 5.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(GetLongestRun.getLongestRun(a), 5);

        System.out.println();

        a = new double[] {6.0, 6.0, 7.0, 1.0, 1.0, 1.0, 1.0, 4.5, 1.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(GetLongestRun.getLongestRun(a), 4);

        System.out.println();

        a = new double[] {6.0, 2.4, 4.0, 8.0, 6.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(GetLongestRun.getLongestRun(a), 1);

        System.out.println();

        a = new double[] {3.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(GetLongestRun.getLongestRun(a), 1);

        System.out.println();

        a = new double[] {};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(GetLongestRun.getLongestRun(a), 0);

        System.out.println();

        a = new double[] {6.0, 6.0, 7.0, 1.0, 1.0, 1.0, 1.0, 4.5, 1.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(GetLongestRun.getLongestRun(a), 4);

        System.out.println();

        String[] b;

        b = new String[8];

        b[0] = new String("alpha");
        b[1] = new String("alpha");
        b[2] = new String("beta");
        b[3] = new String("charlie");
        b[4] = b[3];
        b[5] = new String("charlie");
        b[6] = new String("delta");
        b[7] = new String("charlie");

        System.out.print("Test case: ");
        Utils.displayArray(b);

        Utils.assertEquals(GetLongestRun.getLongestRun(b), 3);

        System.out.println();

    }

}
