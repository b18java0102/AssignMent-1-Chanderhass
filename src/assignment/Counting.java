package assignment;

public class Counting {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0, a = 0;
		String s = "chandigarh is also known as city beautifull 3451237";
		for ( int i = 0; i < s.length(); i++ )
		{
			if ( s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
			{
				x++;
			}
			else if(s.charAt(i) == ' ')
			{
				y++;
			}
			else if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9')
			{
				z++;
			}
			else
			{
				a++;
			}
		}
		System.out.println("No. of vowels are "+x );
		System.out.println("No. of spaces are "+y );
		System.out.println("No. of digits are "+z );
		System.out.println("No. of consonents are "+a );
		

	}

}
