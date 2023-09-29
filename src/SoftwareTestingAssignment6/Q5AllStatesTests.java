package SoftwareTestingAssignment6;
/**
 * Contains all state tests
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q5AllStatesTests {

    // Test Case: All States - Positive Numbers
    @Test
    void testAllStatesPositiveNumbers() {
        // Creating an instance of AverageNumbers class to perform operations.
        AverageNumbers processor = new AverageNumbers();

        // Processing a list containing only positive integers.
        processor.processList(new int[]{5, 10, 15});

        // Asserting that the total of the positive integers in the list is correctly calculated.
        assertEquals(30, processor.getTotal(), "TC01 - Total should be 30");

        // Asserting that the average of the positive integers in the list is correctly calculated.
        assertEquals(10, processor.getAverage(), "TC01 - Average should be 10");
    }

    // Test Case: All States - Mixed Numbers
    @Test
    void testAllStatesMixedNumbers() {
        // Creating an instance of AverageNumbers class to perform operations.
        AverageNumbers processor = new AverageNumbers();

        // Processing a list containing both positive and negative integers.
        processor.processList(new int[]{5, -10, 15});

        // Asserting that the total of the positive integers in the list is correctly calculated.
        assertEquals(20, processor.getTotal(), "TC02 - Total should be 20");

        // Asserting that the average of the positive integers in the list is correctly calculated.
        assertEquals(10, processor.getAverage(), "TC02 - Average should be 10");
    }
}