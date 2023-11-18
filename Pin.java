import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Pin {
	public static void main(String[] naufal){
	out.println("Silahkan masukkan pin anda: ");
	Scanner key = new Scanner(System.in);
	int pin = 1105;
	int kesempatan = 2;
	int input = key.nextInt();
	
	if (pin == input){
		out.println("Pin anda benar! ");
	} while (pin != input) {
		out.println("Pin yang anda masukkan salah. ");
		out.println("Kesempatan anda tersisa: " +kesempatan);
		kesempatan--;
		
	input = key.nextInt();
	if (kesempatan == 0){
		out.println("Kesempatan anda telah habis. ");
		break;
		}
	}
}
}