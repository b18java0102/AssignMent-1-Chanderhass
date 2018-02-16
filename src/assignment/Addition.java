package assignment;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first no");
		int a = s.nextInt();
		System.out.println("enter the second no");
		int b = s.nextInt();
		Addition c = new Addition();
		c.add(a,b);
		s.close();

	}
	void add(int a, int b)
	{
		while ( b != 0)
		{
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		System.out.println("Sum is "+a);
	}

}
