package assignment;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the no. " );
		int x=sc.nextInt();
		sc.close();
		
		
		factorial t = new factorial();
		t.fact( x );
		
	}
	    void fact( int d )
		{
		
		int j = 1;
		for ( int n = 1; n <= d; n++  )
		{
			 j = j * n;
			
			
		}
		System.out.println("Factorial of no. is "+j);
		
		
		}
		

}


