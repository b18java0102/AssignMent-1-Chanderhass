package assignment;

import java.util.Scanner;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		sc.close();
		for(int i = 2; i <= n; i++ )
		{
			boolean flag = true;
			for ( int j = 2; j <= i/2; j++ )
			{
				if( i % j == 0)
				{
					flag = false;
					break;
				}
					
			}
			if ( flag == true )
			{
				System.out.print(i+" ");
			}
		}

	}

}
