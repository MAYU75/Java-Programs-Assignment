//Java program that takes an age(for example 20) as input and
//prints something as "You look older than 20"

import java.util.*;

class age9th11
{
	public static void main(String[] args)
	{
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the age: ");
		age = scan.nextInt();
		if(age<=20)
		{
			System.out.println("You look older than 20.");
 		}
 		else
 		{
			System.out.println("You look younger than your age.");
		}
		System.out.println();
	}
}