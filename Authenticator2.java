import static java.lang.System.out;
import java.util.Scanner;

public class Authenticator2 {

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Username: ");
		String username = keyboard.next();
		
		if (username.equals("Aya")) {
			out.print ("Password: ");
			String password = keyboard.next();
			
			if (password.equals("Naufal")) {
				out.println("You're in.");
			} else {
				out.println("Incorrect password");
			}
		} else {
			out.println("Unknown user");
		}
		
		keyboard.close();
	}
}