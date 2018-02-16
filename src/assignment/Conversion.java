package assignment;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no. of days");
		int a = s.nextInt();
		Conversion c = new Conversion();
		c.convert(a);
		s.close();

	}
	void convert(int a)
	{
		int months = a / 30;
		int days = a % 30;
		System.out.println("Months = "+ months);
		System.out.println("Days = "+ days);
		
	}
	 
}
