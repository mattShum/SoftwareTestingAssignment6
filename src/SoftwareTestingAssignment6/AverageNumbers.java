package SoftwareTestingAssignment6;

/**
 * 
 */
public class AverageNumbers {
	
	private int totalOfValues;
	private float averageOfValues;
	private int numberOfValues;
	
	/**
	 * This is the default constructor for the AverageNumbers object
	 */
	public AverageNumbers() {
		totalOfValues = 0;
		numberOfValues = 0;
		averageOfValues = 0;
	}
	
	/**
	 * This is the private method that accepts an integer as a parameter
	 * and adds that integer to the object's totalOfVales. This
	 * method also adds 1 to the number of values each time it is called.
	 * @param num
	 */
	private void addTotal(int num) {
		try {
			totalOfValues += num;
			numberOfValues += 1;			
		}
		catch(Exception e) {
			System.out.println("Data must be an integer.  Error: " + e);
		}		
	}
	
	/**
	 * This public method returns the integer total number of values that
	 * have been added to the totalOfValues.
	 * @return int
	 */
	public int getTotal() {
		return totalOfValues;
	}
	
	/**
	 * This public method returns the average of all values for the
	 * AverageNumbers object.
	 * @return float
	 */
	public float getAverage() {
		return averageOfValues;
	}
	
	/**
	 * This private method calculates and sets the average of values by 
	 * dividing the totalOfVales by the number of values.
	 */
	private void setAverage() {
		averageOfValues = (totalOfValues / numberOfValues);
	}
	
	
	/**
	 * This public method accepts an array of integers as an argument
	 * and then processes each of those integers to the addTotal() method
	 * if the integers meet the criteria of being a positive number.
	 * Note that 0 is neither positive nor negative therefore cannot
	 * be considered a positive number.  This method catches non integers
	 * and generates a console message to the user.  Once the array of
	 * integers has been processed the setAverage method is called
	 * to update the average.
	 * @param int[] list
	 */
	public void processList(int [] list) {
		try {
			boolean validList = true;
			for (int num : list) {
				if (num != (int)num) {
					validList = false;
					System.out.println("Array must contain only integers.");
				}
			}
			if (validList) {
				boolean numberAdded = false;
				for (int num : list) {
					if (num > 0) {
						addTotal(num);
						numberAdded = true;
					}
					else {
						System.out.println("Only positive integers (integers greater than 0) will be averaged.  Invalid number: " + num);
					}
				}
				if(numberAdded) {
					setAverage();
				}				
			}			
		}
		catch(Exception e) {
			System.out.println("Array must contain only integers.  Error: " + e);
		}
	}
}
