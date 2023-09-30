package SoftwareTestingAssignment6;

public class SoftwareTestingAssignment6 {

	public static void main(String[] args) {

		AverageNumbers averageTracker = new AverageNumbers();
		int[] integersSet = new int[]{2147483635, 70, 1, 80, 5};
		
		averageTracker.processList(integersSet);
		
		System.out.println("The total is " + averageTracker.getTotal());
		System.out.println("The average is " + averageTracker.getAverage());
	}

}
