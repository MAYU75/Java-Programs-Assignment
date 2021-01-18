//Java program that takes three numbers (x,y,z) as input and
//print the output of (x+y).z and x.y + y.z

import java.util.Scanner;

class xyx9th10
{
	public static void main(String[] args)
	{
		int x,y,z,r1,r2;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter three numbers: ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		r1=(x+y)*z;
		r2=(x*y)+(y*z);
		System.out.println("\n (x+y).z = "+ r1);
 		System.out.println("\n x.y + y.z = "+ r2);
	}
}
