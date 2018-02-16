package assignment;

public class Replace {

	public static void main(String[] args) {
		String s = "chandigarh is city beautifull";
		String s2 = s.replaceAll("[aeiou]", "*");
		
		System.out.println( s2 );
	}

}
