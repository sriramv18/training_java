import java.util.Scanner;
public class Byte{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Byte value");
		byte in = scan.nextByte();
		if(in <=127){
		System.out.println("Byte value of :"+in);
		}else{
			System.out.println("Not a Byte value");
		}
	}
}