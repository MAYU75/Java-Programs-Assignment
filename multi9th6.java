//java program to print the output of multiplication of three numbers which will be entered by the user.
import java.util.*;
class multi9th6
{
	public static void main(String[] args)
	{
		int num1,num2,num3,mul;
		System.out.println("Enter the three numbers for multiplication: ");
		Scanner scan = new Scanner(System.in);
		num1= scan.nextInt();
		num2= scan.nextInt();
		num3= scan.nextInt();
		mul=num1*num2*num3;
  	    System.out.println("Multiplication of three numbers is " + mul);
	}
}