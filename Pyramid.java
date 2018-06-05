import java.util.Scanner;
/********************
*Pyramid Box Created*
*
********************/
public class Pyramid{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the row length: ");
			int row = scan.nextInt();
			System.out.println("Enter the name or number: ");
		char name = scan.next().charAt(0); 
		for(int i=0;i<row;i++)
    {
        for(int j=0;j<row-i-1;j++)
        {
            System.out.print(" ");
        }
        for(int k=row-i;k<=row;k++)
        {
            System.out.print(name);
        }
        for(int k=row-i;k<row;k++)
        {
            System.out.print(name);
        }
        for(int j=1;j<row-i;j++)
        {
            System.out.print(" ");
        }
		
        
		System.out.println();
    }
	System.out.println("\n");
		for(int i=row;i>15;i--)
    {
        for(int j=0;j<row-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=row-i;k<=row;k++)
        {
            System.out.print(name);
        }
        for(int k=row-i;k<row;k++)
        {
            System.out.print(name);
        }
        for(int j=0;j<row+i-1;j++)
        {
            System.out.print(" ");
        }
		
        
		System.out.println();
    }
		
	}
	
}