import java.util.Scanner;
public class Thrice{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
			int a,b,thricenumber,twicenumber;
			System.out.println("Enter the Increment Number: ");
			a = scan.nextInt();
			thricenumber = a*3;
		System.out.println("The Thrice Value of "+a+"Answer is "+thricenumber);
		System.out.println("Enter The Decerment Number: ");
			b = scan.nextInt();
			twicenumber = b/2;
			System.out.println("The twice value of "+b+"Answer is "+twicenumber);
		
	}
	
}