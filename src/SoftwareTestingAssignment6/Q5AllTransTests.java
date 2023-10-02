package SoftwareTestingAssignment6;
/**
 * Contains all transition tests
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q5AllTransTests {

    @Test
    /**
     * Test Case ID: A6-EBG-TC03
     * Purpose: To verify that the system correctly transitions from processing a positive number to a negative number.
     */
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

    @Test
    /**
     * Test Case ID: A6-EBG-TC04
     * Purpose: To verify that the system correctly transitions from processing a negative number to the end state when there are no more numbers to process.
     */
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
    	System.out.println("Test Case ID: A6-MS-AT02");
    	AverageNumbers maxIntTest = new AverageNumbers();
    	int[] integersSet1 = new int[]{2147483635};
    	int[] integersSet2 = new int[]{70, 1};
    	int[] integersSet3 = new int[]{80, 5};
    	
    	maxIntTest.processList(integersSet1);
    	System.out.println("The total is: " + maxIntTest.getTotal());
    	System.out.println("The average is: " + maxIntTest.getTotal());
    	assertEquals(2147483635, maxIntTest.getTotal(), "A6-MS-AT02 - Total should be 2147483635");
    	
    	maxIntTest.processList(integersSet2);
    	System.out.println("The total is: " + maxIntTest.getTotal());
    	System.out.println("The average is: " + maxIntTest.getTotal());
    	assertEquals(2147483636, maxIntTest.getTotal(), "A6-MS-AT02 - Total should be 2147483636");
    	
    	maxIntTest.processList(integersSet3);
    	System.out.println("The total is: " + maxIntTest.getTotal());
    	System.out.println("The average is: " + maxIntTest.getTotal());
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
    	System.out.println("Test Case ID: A6-MS-GA01");
    	AverageNumbers divideByZeroTransitionTest = new AverageNumbers();
    	int[] integersSet1 = new int[]{-8, 0, -75};
    	int[] integersSet2 = new int[]{0, 0, 0};
    	int[] integersSet3 = new int[]{1, 2, 3};
    	int[] integersSet4 = new int[]{-3, -5, -6};
    	
    	divideByZeroTransitionTest.processList(integersSet1);
    	System.out.println("The total is: " + divideByZeroTransitionTest.getTotal());
    	System.out.println("The average is: " + divideByZeroTransitionTest.getTotal());
    	assertEquals(0.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 0");
    	
    	divideByZeroTransitionTest.processList(integersSet2);
    	System.out.println("The total is: " + divideByZeroTransitionTest.getTotal());
    	System.out.println("The average is: " + divideByZeroTransitionTest.getTotal());
    	assertEquals(0.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 0");
    	
    	divideByZeroTransitionTest.processList(integersSet3);
    	System.out.println("The total is: " + divideByZeroTransitionTest.getTotal());
    	System.out.println("The average is: " + divideByZeroTransitionTest.getTotal());
    	assertEquals(2.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 2.0");
    	
    	divideByZeroTransitionTest.processList(integersSet4);
    	System.out.println("The total is: " + divideByZeroTransitionTest.getTotal());
    	System.out.println("The average is: " + divideByZeroTransitionTest.getTotal());
    	assertEquals(2.0, divideByZeroTransitionTest.getAverage(), "A6-MS-GA01 - Average should be 2.0");    	
    }
}