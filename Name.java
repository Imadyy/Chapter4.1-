import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullname = "Imad Merveil";
		//System.out.println(fullname.length());
		System.out.printf("Hello Mr." + fullname.substring(fullname.lastIndexOf(' ') +1),fullname.length());
		
 }
}