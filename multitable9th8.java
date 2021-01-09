//java program that takes a number as input and print its multiplication table.
import java.util.*;
class multitable9th8
{
	public static void main(String[] args)
	{
		int num,i,r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number whose multiplication table you want to create:");
		num= scan.nextInt();
		System.out.println("Multiplication table for "+ num);
		for(i=1;i<=10;i++)
		{
			r=num*i;
		    System.out.println(i + " * "+ num + " = "+ r);
		}
	}
}