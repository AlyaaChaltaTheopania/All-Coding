import static java.lang.System.out;

public class Pengunjung{

	public static void main(String[] Naufal){
		int guests[] = {28, 5, 6, 5, 11, 4, 2, 19, 17, 29};
		
		out.println("Room\tGuests");
		
		for(int roomNum = 0; roomNum < 10; roomNum++){
			out.print(roomNum);
			out.print("\t");
			out.println(guests[roomNum]);
		}
	}
}