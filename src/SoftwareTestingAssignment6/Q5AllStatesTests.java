package SoftwareTestingAssignment6;

/**
 * Contains all state tests
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q5AllStatesTests {

    @Test
    /**
     * Test Case ID: A6-EBG-TC01
     * Purpose: To verify that the system correctly processes a list containing only positive integers, transitioning through all states.
     */
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

    @Test
    /**
     * Test Case ID: A6-EBG-TC02
     * Purpose: To verify that the system correctly processes a list containing both positive and negative integers, transitioning through all states.
     */
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
    
    @Test
    /*
     * Test Case ID: A6-MS-AT01
     * Validate addTotal() can catch and handle values that exceed the limits 
     * of int (max int size = 2,147,483,647) 
     */
    void testMaxIntForAddTotal() {
    	System.out.println("Test Case ID: A6-MS-AT01");
    	AverageNumbers maxIntTest = new AverageNumbers();
    	int[] integersSet = new int[]{2147483646, 7, 4};
    	
    	maxIntTest.processList(integersSet);
    	System.out.println("The total is: " + maxIntTest.getTotal());
    	System.out.println("The average is: " + maxIntTest.getTotal());
    	
    	assertEquals(2147483646, maxIntTest.getTotal(), "A6-MS-AT01 - Total should be 2147483646");
    }
    
    @Test
    /*
     * Test Case ID: A6-MS-SA01
     * Validate setAverage() can catch and handle divide by 0 scenarios
     */
    void testDivideByZero() {
    	System.out.println("Test Case ID: A6-MS-SA01");
    	AverageNumbers divideByZeroTest = new AverageNumbers();
    	int[] integersSet = new int[]{0, 0, 0};
    	
    	divideByZeroTest.processList(integersSet);
    	System.out.println("The total is: " + divideByZeroTest.getTotal());
    	System.out.println("The average is: " + divideByZeroTest.getTotal());
    	    	
    	assertEquals(0.0, divideByZeroTest.getAverage(), "A6-MS-SA01 - Average should be 0.0");    	
    }

    @Test 

/* 

* Test Case ID: A6-MP-ST01 

* Test if addTotal() correctly adds a number to the total 

*/ 

void testAddTotal() { 

	System.out.println("Test Case ID: A6-MP-ST01"); 

	AverageNumbers testTotal = new AverageNumbers(); 

//add numbers	 

	testTotal.addTotal(5); 

	testTotal.addTotal(5); 

	testTotal.addTotal(5); 

	testTotal.addTotal(5); 

//output average and total 

	testTotal.setAverage(); 

	System.out.println("The total is: " + testTotal.getTotal()); 

	System.out.println("The average is: " + testTotal.getAverage()); 

	 

	 

	 

} 

@Test 

/* 

* Test Case ID: A6-MP-ST02 

* To verify if setAverage() correctly handles the calculation of the average 

*/ 

void testSetAverage() { 

	System.out.println("Test Case ID: A6-MP-ST02"); 

	AverageNumbers testAverage = new AverageNumbers(); 

	testAverage.addTotal(19); 

	testAverage.addTotal(63); 

	testAverage.addTotal(47); 

	testAverage.addTotal(94); 

	 

	testAverage.setAverage(); 

	System.out.println("The total is: " + testAverage.getTotal()); 

	System.out.println("The average is: " + testAverage.getAverage()); 

} 
}
