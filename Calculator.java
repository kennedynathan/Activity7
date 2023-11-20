
package junitt;
/**
 * Represents a simple calculator with basic arithmetic operations.
 * 
 */

public class Calculator {

    /**
     * Adds two integers.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     * 
     * @param a The first integer.
     * @param b The integer to subtract.
     * @return The result of subtraction.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of the two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * 
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of the division.
     */
    public int divide(int a, int b) {
        return a / b;
    }

    /**
     * Main method for testing the calculator functionalities.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Adding 1 + 2: " + calc.add(1, 2));       // Should print 3
        System.out.println("Subtraction 2 from 1 is: " + calc.subtract(2, 1)); // Should print 1
        System.out.println("Multiplication of 10 and 2: " + calc.multiply(10, 2)); // Should print 20
        System.out.println("Division of 10 by 2 is: " + calc.divide(10, 2));     // Should print 5
    }
}