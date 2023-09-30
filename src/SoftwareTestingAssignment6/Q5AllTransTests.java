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
    
    @Test
    /*
     * Test Case ID: A6-MS-AT02
     * Validate addTotal() can handle alternating numbers that would exceed the
     *  limits of int and that can be validly added to int and will add valid 
     *  values to total even if a previous number was too large to add to total
     */
    void testMaxIntAlternatingValues() {
    	AverageNumbers maxIntTest = new AverageNumbers();
    	int[] integersSet1 = new int[]{2147483635};
    	int[] integersSet2 = new int[]{70, 1};
    	int[] integersSet3 = new int[]{80, 5};
    	
    	maxIntTest.processList(integersSet1);
    	assertEquals(2147483635, maxIntTest.getTotal(), "A6-MS-AT02 - Total should be 2147483635");
    	
    	maxIntTest.processList(integersSet2);
    	assertEquals(2147483636, maxIntTest.getTotal(), "A6-MS-AT02 - Total should be 2147483636");
    	
    	maxIntTest.processList(integersSet3);
    	assertEquals(2147483641, maxIntTest.getTotal(), "A6-MS-AT02 - Total should be 2147483641");
    }
    
    @Test
    /*
     * Test Case ID: A6-MS-GA01
     * Purpose: Validate getAverage() returns accurate average when multiple 
     * divide by 0 situations have been handled. setAverage() adds then 
     * subtracts 1 to and from the number of values when numberOfValues ==  0,
     * this test validates the transition from handling that scenario and 
     * back to happy path scenarios still produces the expected results. 
     */
    void testDivideByZeroTransition() {
    	AverageNumbers divideByZeroTransitionTest = new AverageNumbers();
    	int[] integersSet1 = new int[]{-8, 0, -75};
    	int[] integersSet2 = new int[]{0, 0, 0};
    	int[] integersSet3 = new int[]{1, 2, 3};
    	int[] integersSet4 = new int[]{-3, -5, -6};
    	
    	divideByZeroTransitionTest.processList(integersSet1);
    	assertEquals(0.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 0");
    	
    	divideByZeroTransitionTest.processList(integersSet2);
    	assertEquals(0.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 0");
    	
    	divideByZeroTransitionTest.processList(integersSet3);
    	assertEquals(2.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 2.0");
    	
    	divideByZeroTransitionTest.processList(integersSet4);
    	assertEquals(2.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 2.0");    	
    }
}