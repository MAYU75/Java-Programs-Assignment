//Java program to find largest of three numbers.

import java.util.*;

class largest9th13
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a>b && a>c)
			System.out.println(a + " is the largest number.");
		else if(b>a && b>c)
				System.out.println(b + " is the largest number.");
		     else
				System.out.println(c + " is the largest number.");
		System.out.println();
	}
}