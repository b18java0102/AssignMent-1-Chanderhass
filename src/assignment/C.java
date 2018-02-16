package assignment;

public class C {

	public static void main(String[] args) {
		int i,j;
		for (  i = 1; i <= 3; i++ )
		{
			for ( j = 7; j >= 2*i - 1; j--)
			{
				System.out.print(" ");
			}
			if (i == 1)
			{
				System.out.print("**");
			}
			System.out.print("*");
			System.out.println();
		}
		for ( i = 1; i <= 2; i++ )
		{
			for ( j = 3; j >= 1; j-- )
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			System.out.println();
		}
		for ( i = 2; i <= 3; i++ )
		{
			for ( j = 1; j <= 2*i + 1; j++)
			{
				System.out.print(" ");
			}
			if ( i == 3)
			{
				System.out.print("**");
			}
			System.out.print("*");
			System.out.println();
		}
		
			
	}

}
