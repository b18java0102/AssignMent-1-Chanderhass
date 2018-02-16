package assignment;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length");
		int a = s.nextInt();
		System.out.println("enter the breadth");
		int b = s.nextInt();
		System.out.println("enter the side");
		int c = s.nextInt();
		System.out.println("enter the radius");
		int r = s.nextInt();
		Area d = new Area();
		d.rectangleArea(a,b);
		Area e = new Area();
		e.squareArea(c);
		Area f = new Area();
		f.circumference(r);
		s.close();

	}
	void rectangleArea(int a, int b)
	{
		int c = a * b;
		System.out.println("Area of rectangle is "+c);
	}
	void squareArea(int a)
	{
		int b = a*a;
		System.out.println("Area of Square is "+b);
		
	}
	void circumference(int r)
	{
		double a = 2 * 3.14 * r;
		System.out.println("Circumference of circle is "+a);
		
	}

}
