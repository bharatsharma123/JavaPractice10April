package questions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this program works only for sorted sequence
		
		int a[]= {1,2,3,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		int missing=sum2-sum;
		System.out.println("missing number is " +missing);
		

	}

}
