import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FindVacancy{

	public static void main(String[] Naufal)
	throws IOException {
	int guests[] = new int[10];
	int roomNum;
	
	Scanner diskScanner =
		new Scanner(new File("GuestsList.txt"));
	for (roomNum = 0; roomNum < 10; roomNum++){
		guests[roomNum] = diskScanner.nextInt();
	}
	diskScanner.close();
	
	roomNum = 0;
	while (roomNum < 10 && guests[roomNum] != 0){
		roomNum++;
	}
	if(roomNum == 10){
		out.println("Sorry, gaada kamar kosong cuy ");
	} else {
		out.print("Berapa orang ");
		out.print(roomNum);
		out.print("? ");
		
		Scanner keyboard = new Scanner(System.in);
		guests[roomNum] = keyboard.nextInt();
		keyboard.close();
		
		PrintStream listout =
			new PrintStream("GuestList.txt");
		for (roomNum = 0; roomNum < 10; roomNum++){
			listout.print(guests[roomNum]);
			listout.print(" ");
		}
		listout.close();
	}
}
}	