//Write a program in java to accept a grade and decare the equivalent description :
//Grade Description:
//E Excellent
//V Very Good
//G Good
//A Average
//F Fail

import java.util.*;

class grade9th20
{
	public static void main(String[] args)
	{
		 char grade;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("\nEnter the grade obtained by the student in uppercase(E/V/G/A/F) : ");
		 grade = scan.next().charAt(0);
		 switch(grade)
		 {
		  case 'E': System.out.println("Grade is excellent.");
			        break;
		  case 'V': System.out.println("Grade is very good.");
			        break;
		  case 'G': System.out.println("Grade is good.");
			    	break;
		  case 'A': System.out.println("Grade is average.");
			    	break;
		  case 'F': System.out.println("Grade is fail.");
			    	break;
		  default : System.out.println("Wrong choice.");
 		}
	}
}
