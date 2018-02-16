package assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = s.nextInt();
		int temp = n;
		int rev = 0;
		s.close();
		while( n < 0 )
		{
			int rem = n % 10;
			rev = rev + (rem*rem*rem);
			n = n / 10;
		}
		if ( temp == n )
		{
			System.out.println("No. is Armstrong");
		}
		else
		{
			System.out.println("No. is not Armstrong");
		}
		

	}

}
