package methods;

public class summingNumbers {
	//main method
	//point of entry for the code. It needs to stay in this format.
	public static void main(String args[]) {
		System.out.println(sumOfNumbersUpTo(5));
		}
	

	//https://code4coding.com/java-program-to-display-multiplication-table/
	//logic explanation for this method
	public static long sumOfNumbersUpTo(int endNumber) {
		long total = 0;
		
		for (int count = 1; count <= endNumber; count++) {
			total += count;
		}
		return total;
		

	}

}
