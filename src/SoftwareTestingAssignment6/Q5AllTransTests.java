package SoftwareTestingAssignment6;
/**
 * Contains all transition tests
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q5AllTransTests {

    // Test Case: All Transitions - Positive to Negative Transition
    @Test
    void testPositiveToNegativeTransition() {
        // Creating an instance of AverageNumbers class to perform operations.
        AverageNumbers processor = new AverageNumbers();

        // Processing a list containing a positive integer followed by a negative integer.
        processor.processList(new int[]{5, -10});

        // Asserting that the total is correctly calculated as the sum of positive integers in the list.
        assertEquals(5, processor.getTotal(), "TC03 - Total should be 5");

        // Asserting that the average is correctly calculated as the average of positive integers in the list.
        assertEquals(5, processor.getAverage(), "TC03 - Average should be 5");
    }

    // Test Case: All Transitions - Negative to End State Transition
    @Test
    void testNegativeToEndStateTransition() {
        // Creating an instance of AverageNumbers class to perform operations.
        AverageNumbers processor = new AverageNumbers();

        // Processing a list containing only a single negative integer.
        processor.processList(new int[]{-5});

        // Asserting that the total is 0 as there are no positive integers in the list.
        assertEquals(0, processor.getTotal(), "TC04 - Total should be 0");

        // Asserting that the average is 0 as there are no positive integers in the list to calculate the average.
        assertEquals(0, processor.getAverage(), "TC04 - Average should be 0");
    }

}