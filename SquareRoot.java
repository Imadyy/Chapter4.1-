import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number you would like to find the square root of:");
		double Num=input.nextDouble();
		
	if (Num>=0) {
		double SQ = Math.sqrt(Num);
		
		System.out.println(" The Square root is " + SQ);	
	}
	else if (Num<0) {
		System.out.println("Number must be positive");
	}
 }
}
