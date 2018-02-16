package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		sc.close();
		while ( n != 0)
		{
			int rem = n % 10;
		    rev = (rev * 10) + rem;
			n = n / 10;
			
		}
		
		if ( rev == temp )
		{
			System.out.println("No is palindrome");
			
		}
		else
		{
			System.out.println("No. is not palindrome");
		}

	}

}
