package randomquestions;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="BharatSharma";
		String b=a.substring(1,5);//5 index i.e end index is not included in it
		System.out.println(b);
		String c=a.substring(1);//starts from the 1st index itself 1 is included
		System.out.println(c);
		
		String name="Bhardwaj";
		String aa=name.toLowerCase();
		System.out.println(aa);
		System.out.println(name.toUpperCase());
		String[] z=name.split("ha");
		String first=z[0];
		String second=z[1];
		System.out.println(first);
		System.out.println(second);
		
		

	}

}
