package questions;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		
		//we do it with the help of regular expression
		//[^a-zA-Z0-9] ^ indicates not off
		String s="!@##$#%$%$%abcdefg   hijklmnopqrst__****";
		s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);

	}

}
