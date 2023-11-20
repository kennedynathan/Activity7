package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	 /**
     * The entry point for executing the JUnit tests in the {@code testAssertions} class.
     * <p>
     * method runs the tests and prints any failures.
     * At the end will print a message indicating if all tests passed.
     * </p>
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(testAssertions.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("A JUnit test failed: " + failure.toString());
        }

        System.out.println("The JUnit Tests " + (result.wasSuccessful() ? "Passed" : "Failed"));
    }
}