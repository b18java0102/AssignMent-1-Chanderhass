package assignment;

import java.util.Scanner;

public class Conversions {
	public static void main(String[] args)
	{
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int n = sc.nextInt();
	Conversions c = new Conversions();
	c.binary(n);
	Conversions d = new Conversions();
	d.octal(n);
	Conversions e = new Conversions();
	e.hexadecimal(n);
	sc.close();
	
	

}

void binary( int n )
{
	String rev = "";
	while( n > 0 )
	{
	int rem = n % 2;
	rev = rem + rev;
	n = n / 2;
	}
	System.out.println("binary no. is "+rev);
	
		
	
}
void octal( int n )
{
	String rev = "";
	while( n > 0 )
	{
	int rem = n % 8;
	rev = rem + rev;
	n = n / 8;
	}
	System.out.println("octal no. is "+rev);
	
	
}
void hexadecimal( int n )
{
	String rev = "";
	while( n > 0 )
	{

	int rem = n % 16;
	rev = rem + rev;
	n = n / 16;
	}
	System.out.println("hexadecimal no. is "+rev);
}
}