package methods;

public class leapYear {
	

	//Main point of entry
	public static void main(String[] args) {
		
		System.out.println(leapYear1(2005));
	}
	
	public static boolean leapYear1(int year) {
		
		if (year%4 !=0) {
			return false;
		}
		
		if (year%400 == 0) {
			return true;
		}
		
		if(year%100 == 0) {
			return false;
		}
		
		return true;
	}

}
