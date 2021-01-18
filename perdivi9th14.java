//Java program to read roll no, name and marks of three subjects and calculate
//the total, percentage and division.

import java.util.*;

class perdivi9th14
{
	public static void main(String[] args)
	{
		int rollno,m1,m2,m3,total;
		float per;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the roll no. of the student: ");
		rollno = scan.nextInt();
		System.out.println("Enter the name of the student: ");
		name = scan.next();
		System.out.println("Enter the three subject marks of the student: ");
		m1 = scan.nextInt();
		m2 = scan.nextInt();
		m3 = scan.nextInt();
		total=m1+m2+m3;
		per=total/3;
		if(per>=80)
			System.out.println(name + " passed in first division with " + per + " percentage.");
		else if(per<80 && per>=60)
				System.out.println(name + " passed in second division with " + per + " percentage.");
		     else if(per<60 && per>=40)
			     	System.out.println(name + " passed in third division with " + per + " percentage.");
			   	  else
	     			System.out.println(name + " has failed with " + per + " percentage.");
	    System.out.println();
	}
}