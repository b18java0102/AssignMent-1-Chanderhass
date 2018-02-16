package assignment;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first no");
		int a = s.nextInt();
		System.out.println("enter the second no");
		int b = s.nextInt();
		Swap c = new Swap();
		c.show(a,b);
		s.close();
		
		

	}
	void show(int a, int b)
	{
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	

}
