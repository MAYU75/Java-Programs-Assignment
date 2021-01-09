//java program to print on screen the output of adding, subtracting, multiplying and dividing of
//two numbers which will be entered by the user.
import java.util.*;
class calculate9th7
{
	public static void main(String[] args)
	{
		int num1,num2,res;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1= scan.nextInt();
		num2= scan.nextInt();
		res=num1+num2;
		System.out.println("Addition of two numbers is "+ res);
		res=num1-num2;
		System.out.println("Subtraction of two numbers is "+ res);
		res=num1*num2;
		System.out.println("Multiplication of two numbers is "+ res);
		res=num1/num2;
 		System.out.println("Division of two numbers is "+ res);
	}
}