/**
* Test cases for the class <code>HasLengthTwoRun/code>.
*
* @author Marcel Turcotte (marcel.turcotte@uottawa.ca)
*/

public class HasLengthTwoRunTest{

    /**
     * In Java, an application must have a <code>main</code> method. Its signature must
     * exactly as below. Otherwise, the virtual machinine will fail to find
     * the entry point to your program. On the command line, you can run
     * this program as follows:
     * <pre>
     * $ java HasLengthTwoRunTest
     * </pre>
     * See <a href="https://docs.oracle.com/javase/tutorial/getStarted/application/index.html">https://docs.oracle.com/javase/tutorial/getStarted/application/index.html</a>.
     *
     * @param args the parameters passed on the command line when executing the program
     */

    public static void main(String[] args) {

        double[] a;

        StudentInfo.display();

        System.out.println("Testing HasLengthTwoRun.hasLengthTwoRun:");
        System.out.println();

        a = new double[] {1.0, 4.0, 3.0, 3.0, 4.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(HasLengthTwoRun.hasLengthTwoRun(a), true);

        System.out.println();

        a = new double[] {1.0, 2.0, 3.0, 3.0, 3.0, 4.5, 6.0, 5.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(HasLengthTwoRun.hasLengthTwoRun(a), true);

        System.out.println();

        a = new double[] {1.0, 2.0, 3.7, 4.0, 3.0, 2.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(HasLengthTwoRun.hasLengthTwoRun(a), false);

        System.out.println();

        a = new double[] {7.7};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(HasLengthTwoRun.hasLengthTwoRun(a), false);

        System.out.println();

        a = new double[] {2.7, 1.0, 1.0, 0.5, 3.0, 1.0};

        System.out.print("Test case: ");
        Utils.displayArray(a);

        Utils.assertEquals(HasLengthTwoRun.hasLengthTwoRun(a), true);

    }

}
