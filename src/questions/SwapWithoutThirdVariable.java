package questions;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap using arithmetic operations
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

		

	}

}
