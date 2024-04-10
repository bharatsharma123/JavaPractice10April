package questions;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 10;
	        int num2 = 20;
	        int num3 = 15;

	        // Finding the largest among three numbers
	        int largest = num1; // Assume num1 is the largest initially

	        if (num2 > largest) {
	            largest = num2;
	        }

	        if (num3 > largest) {
	            largest = num3;
	        }

	        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
	    }
		

	}


