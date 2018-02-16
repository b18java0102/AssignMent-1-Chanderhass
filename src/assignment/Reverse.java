package assignment;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no ");
		int n = sc.nextInt();
		sc.close();
	 
	     while ( n != 0)
	       {
	    	   rev = rev * 10;
	    	   rev = rev + n % 10;
	    	   n = n / 10;
	       }
	     System.out.print("Reverse of no is "+rev);
	       

	}

}
