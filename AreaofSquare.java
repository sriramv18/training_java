import java.util.Scanner;
public class AreaofSquare{
	public static void main(String[] args)
	{
		int a,b=1,c=2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number Area of Square: ");
		a = scan.nextInt();
		while(c!=0)
		{
			b *=a;
			c--;
		}
		System.out.println("Area of square of "+b);
	}
}