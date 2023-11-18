import static java.lang.System.out;

public class Jackpot{

	public static void main(String[] Naufal){
		String reward[] = {"Gucci", "Chanel", "Louis Vuitton", "Dior", "Tom Ford", "Prada", "Burberry", "Ralph Lauren", "Hermes"};
		
		out.println("No.\tReward");
		
		for(int roomNum = 0; roomNum < 9; roomNum++){
			out.print(roomNum);
			out.print("\t");
			out.println(reward[roomNum]);
		}
	}
}