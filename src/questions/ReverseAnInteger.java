package questions;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		System.out.println(1/10);
		int rev = 0; 
        // remainder 
        int rem; 
        int n=123;
        while (n > 0) { 
            rem = n % 10; 
            rev = (rev * 10) + rem; 
            n = n / 10; 
        } 
        System.out.println(rev);
		

	}

}
