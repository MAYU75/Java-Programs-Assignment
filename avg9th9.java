//Java program that takes four numbers as input to calculate and print average
import java.util.*;
class avg9th9
{
	public static void main(String[] args)
	{
		int n1,n2,n3,n4;
		float avg;
 		Scanner scan = new Scanner(System.in);
 		System.out.println("\n Enter the four numbers to calculate average: ");
 		n1 = scan.nextInt();
 		n2 = scan.nextInt();
 		n3 = scan.nextInt();
 		n4 = scan.nextInt();
 		avg=(n1+n2+n3+n4)/4;
 		System.out.println("Average of four numbers is "+ avg);
	}
}