/**
 * This class contains all states' tests
 * */

package SoftwareTestingAssignment6;

import org.junit.jupiter.api.Test;
import java.util.List;
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