package assignment;

public class Trio {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
		System.out.print(n1+" "+n2+" "+n3+" ");
		int f = 10;
        for ( int i= 3; i <= f; i++)
        {
        	int n4 = n1 + n2 + n3;
        	System.out.print(n4+ " ");
        	n1 = n2;
        	n2 = n3;
        	n3 = n4; 
        }
	}

}
