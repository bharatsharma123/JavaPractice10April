package questions;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";
		String b="World";
		
		System.out.println("Before swapping the values of string a is "+a+" and the value of string b is  "+b);
		a=a+b;//HelloWorld
		b=a.substring(0,a.length()-b.length());//Hello
		a=a.substring(b.length());//World
		System.out.println("After swapping the values of string a is "+a+" and the value of string b is  "+b);
		
	}

}
