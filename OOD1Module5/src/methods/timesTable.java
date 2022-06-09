package methods;

public class timesTable {
	//Main method
	//Point of entry
	public static void main(String[] args) {
		System.out.println(displayTimesTable1(2));
	}
	
	//make sure to change void to int
	public static int displayTimesTable1(int table) {
		
		for (int count = 1; count <= 12; count++) {
			System.out.println(count + "x" + table + "-" + (count * table));
		}
		
		//needs to return a value to be used 
		return table;
		
	}

}
