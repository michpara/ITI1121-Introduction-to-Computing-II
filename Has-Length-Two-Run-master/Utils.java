/**
* A library of methods that I am using for my test cases.
*
* @author Marcel Turcotte (marcel.turcotte@uottawa.ca)
*/


public class Utils {

    /**
    * Displays the content of an array of numbers (all of type <code>double</code>).
    *
    * @param xs an array of values to be displayed.
    */

    public static void displayArray(double[] xs) {

        System.out.print("[");
        for (int i=0; i<xs.length; i++) {
            if (i>0) {
                System.out.print(",");
            }
            System.out.print(xs[i]);
        }
        System.out.println("]");

    }

    /**
    * Displays the content of an array of strings (all of type <code>String</code>).
    *
    * @param xs an array of values to be displayed.
    */

    public static void displayArray(String[] xs) {

        System.out.print("[");
        for (int i=0; i<xs.length; i++) {
            if (i>0) {
                System.out.print(",");
            }
            System.out.print(xs[i]);
        }
        System.out.println("]");

    }

    /**
    * The method prints "success" on the standard output if <code>result</code> and
    * <code>expected</code> are equals, and error message otherwise.
    *
    * @param result some result
    * @param expected the expected value
    */

    public static void assertEquals(int result, int expected) {

        if (result == expected) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail: expected value = "+expected+", actual value = "+result);
        }

    }

    /**
    * The method prints "success" on the standard output if <code>result</code> and
    * <code>expected</code> are equals, and error message otherwise.
    *
    * @param result some result
    * @param expected the expected value
    */

    public static void assertEquals(boolean result, boolean expected) {

        if (result == expected) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail: expected value = "+expected+", actual value = "+result);
        }

    }

}