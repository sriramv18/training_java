import java.util.Scanner;
 
class ArmstrongNumber
{
   public static void main(String args[])
   {
      int in, sum = 0, temp, remainder, count = 0;
 
      Scanner scan = new Scanner(System.in);
      System.out.println("Input a number to check if it is an Armstrong number");      
      in = scan.nextInt();
 
      temp = in;
 
      // Count number of digits
 
      while (temp != 0) {
         count++;
         temp = temp/10;
      }
	
      temp = in;
	
      while (temp != 0) {
         remainder = temp%10;
         sum = sum + power(remainder, count);
         temp = temp/10;
      }
 
      if (in == sum){
	  System.out.println(in + " is an Armstrong number.");}
      else{
	  System.out.println(in + " isn't an Armstrong number.");  }       
   }
 
   static int power(int in, int r) {
      int c, p = 1;
 
      for (c = 1; c <= r; c++) 
         p = p*in;
 
      return p;   
   }
}