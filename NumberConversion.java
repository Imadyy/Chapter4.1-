import java.util.Scanner;
public class NumberConversion {
	public static void main(String [] args) {
		System.out.println("Enter a number or character");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();
		
		if(input.charAt(0) >=65 && input.charAt(0) <=90 || (input.charAt(0) >=97 && input.charAt(0)<=122)) { 
			System.out.println("The letter " + input.charAt(0) +  " in binary is "  + Integer.toBinaryString((int) input.charAt(0)));
			
			System.out.println("The letter" + input.charAt(0) + "in binary is" + Integer.toHexString((int) input.charAt(0)));
			
		} else { 
			System.out.println("The number " + input + " in binary is " + Integer.toBinaryString(Integer.parseInt(input))); 
			
			System.out.println("The Number " + input + "in hexidecimal is " + Integer.toHexString(Integer.parseInt(input))); 	
		}	 
	}
}
