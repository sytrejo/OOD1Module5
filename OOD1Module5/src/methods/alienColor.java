package methods;

public class alienColor {

	//point of entry for the code. It needs to stay in this format.
		public static void main(String args[]) {
			int points = getPoints("green");
			System.out.println("you've scored " + points + "!");
			}
		
		//Alien Color edit for methods
		public static int getPoints(String alienColor) {
			
//			String[] alienColors = {"green", "red", "yellow"};
			
			if(alienColor.equals("green")) {
				return 5;
			}
			
			if(alienColor.equals("red")) {
				return 10;
			}
			
			if(alienColor.equals("yellow")){
				return 15;
			}
			
			return 0;
		}
		

}
