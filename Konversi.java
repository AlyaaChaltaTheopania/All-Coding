import java.util.Scanner;
public class Konversi{
	public static void main(String[] naufal){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan huruf = ");
		char huruf = sc.next().charAt(0);
		if (huruf == 'A'){
			System.out.println("4.0");
		}else if (huruf == 'B'){
			System.out.println("3.0");
		}else if (huruf == 'C'){
			System.out.println("2.0");
		}else if (huruf == 'D'){
			System.out.println("1.0");
		}else if (huruf == 'E'){
			System.out.println("0");
		}else{
			System.out.println("Maaf, konversi nilai tidak diketahui");
		}
	}
}	