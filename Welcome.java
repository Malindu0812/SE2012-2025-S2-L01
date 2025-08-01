import java.util.Scanner;

 public class Welcome {
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your first name: ");
	String fname = scanner.nextLine();
	
	System.out.print("Enter your last name: ");
	String lname = scanner.nextLine();

	System.out.print("Welcome to the second year" +" " + fname + " " + lname);

	scanner.close();
}
}