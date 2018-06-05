import java.util.Scanner;
public class CheckPrime{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The number:");
			int a = sc.nextInt(),b = 2,temp;
			boolean prime = true;
			//System.out.println(a/b);
				for (int i=2;i<=a/b;i++){
				temp = a%i;
					if(temp == 0){
							prime = false;
							break;
					}
			}
		if(prime){
			System.out.println("This Prime Number "+a);
		}else{
			System.out.println("Not a Prime Number "+a);
			
		}
		
											
											}
}