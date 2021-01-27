// Java program to create a class calculator with methods addition, subtraction,
//multiplication, division, modulus.

import java.util.*;
class Calculator
{
	int addition(int num1,int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	int subtraction(int num1,int num2)
	{
		int sub = num1-num2;
		return sub;
	}
	int multiplication(int num1,int num2)
	{
		int mul = num1*num2;
		return mul;
	}
	float division(int num1,int num2)
	{
		float div = num1/num2;
		return div;
	}
	float modulus(int num1,int num2)
	{
		float modul = num1%num2;
		return modul;
	}
}

class calculatormain
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Enter first number: ");
		int n1=scan.nextInt();
		System.out.println("Enter second number: ");
		int n2=scan.nextInt();
		Calculator c = new Calculator();
		System.out.println("Enter your choice from the menu given below:\n 1 :Addition \n 2 :Subtraction \n 3:Multiplication \n 4:Division \n 5:Modulus");
	 	int ch=scan.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Addition = " + c.addition(n1,n2));
					break;
			case 2: System.out.println("Subtraction = " + c.subtraction(n1,n2));
					break;
			case 3: System.out.println("Multiplication = " + c.multiplication(n1,n2));
					break;
			case 4:	System.out.println("Division = " + c.division(n1,n2));
					break;
			case 5: System.out.println("Modulus = " + c.modulus(n1,n2));
					break;
			default:System.out.println("Entered choice is invalid");
					break;
		}
	}
}
