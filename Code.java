import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Code {
	public static void main(String[] naufal){
	out.println("Kodenya berapa pak?? ");
	Scanner key = new Scanner(System.in);
	int pin = 505;
	int kesempatan = 2;
	int input = key.nextInt();
	
	if (pin == input){
		out.println("But I crumble completely when you cry..");
		out.println("It seems like once again you've had to greet me with goodbye ");
		out.println("I'm always just about to go and spoil the surprise ");
		out.println("Take my hands off of your eyes too soon ");
		out.println();
		out.println("I'm going back to 505 ");
		out.println("If it's a seven hour flight or a forty-five minute drive ");
		out.println("In my imagination, you're waitin' lyin' on your side ");
		out.println("With your hands between your thighs and a smile ");
		
	} while (pin != input) {
		out.println("Ah elah pake salah ");
		out.println("Kesempatannya sisa : " +kesempatan);
		kesempatan--;
		
	input = key.nextInt();
	if (kesempatan == 0){
		out.println("Skip lah gaasik luwh ");
		break;
		}
	}
}
}