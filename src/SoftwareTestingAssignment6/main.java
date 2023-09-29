package SoftwareTestingAssignment6;

public class main {

	public static void main(String[] args) {

		AverageNumbers averageTracker = new AverageNumbers();
		int[] integersSet = new int[]{-1, -6, 4, -12, -15};
		
		averageTracker.processList(integersSet);
		
		System.out.println("The total is " + averageTracker.getTotal());
		System.out.println("The average is " + averageTracker.getAverage());
	}

}
