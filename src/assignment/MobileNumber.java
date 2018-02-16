package assignment;

public class MobileNumber {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
		String s1 = "9541496464";
		for ( int k = 0; k < s1.length(); k++ )
		{
			if ( s1.charAt(k) == '0' )
			{
			   a++;
			}
			if ( s1.charAt(k) == '1' )
			{
			   b++;
			}
			if ( s1.charAt(k) == '2' )
			{
			   c++;
			}
			if ( s1.charAt(k) == '3' )
			{
			   d++;
			}
			if ( s1.charAt(k) == '4' )
			{
			   e++;
			}
			if ( s1.charAt(k) == '5' )
			{
			   f++;
			}
			if ( s1.charAt(k) == '6' )
			{
			   g++;
			}
			if ( s1.charAt(k) == '7' )
			{
			   h++;
			}
			if ( s1.charAt(k) == '8' )
			{
			   i++;
			}
			if ( s1.charAt(k) == '9' )
			{
			   j++;
			}
		}
		System.out.println( " no. of 0's are "+a);
		System.out.println( " no. of 1's are "+b);
		System.out.println( " no. of 2's are "+c);
		System.out.println( " no. of 3's are "+d);
		System.out.println( " no. of 4's are "+e);
		System.out.println( " no. of 5's are "+f);
		System.out.println( " no. of 6's are "+g);
		System.out.println( " no. of 7's are "+h);
		System.out.println( " no. of 8's are "+i);
		System.out.println( " no. of 9's are "+j);


	}

}
