package questions;

import java.util.HashSet;

public class DulicateElementInArray2 {

	public static void main(String[] args) 
	
	{
		int[] arr= {6,5,2,1,2,3,4,5,6,7,7,6};
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		//Now we print the duplicate element using the hashset
		HashSet<Integer> myset= new HashSet<Integer>();
		for(int i=0;i<len;i++)
		{
			int n=arr[i];
			if(myset.contains(n))
			{
				System.out.println("Duplicate element is "+n);
				
			}
			myset.add(n);
		}
		//System.out.println(myset);
		
	}
	
	
}