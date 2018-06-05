import java.util.Scanner;
public class Reversenumber{
	public static void main(String[] args){
		int num ,reverse=0;
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Number: ");
		 num = scan.nextInt();
		while(num !=0){
			  reverse  = reverse*10;			
			  reverse = reverse+num%10;			  
			 num  = num/10;
		}
			System.out.println("Reverse Number is: "+reverse);
	}
}