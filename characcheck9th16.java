//Java program to check whether a character is an alphabet, digit or special
//character

import java.util.*;

class characcheck9th16
{
	public static void main(String[] args)
	{
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the character: ");
		ch = scan.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("The character is an alphabet.");
		else if(ch>='0' && ch<='9')
				System.out.println("The character is a digit.");
		     else
				System.out.println("The character is a special character.");
		System.out.println();
	}
}