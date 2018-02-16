package assignment;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	       System.out.println( "enter a no." );
	       int n = s.nextInt();
	       s.close();
	       for ( int i = 1; i <= 10; i++)
	       {
	    	   
	    	   int m = n * i;
	    	   System.out.println(m);
	       }
	       

	}

}
