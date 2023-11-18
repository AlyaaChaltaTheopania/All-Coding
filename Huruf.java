import java.util.Scanner;
	class Huruf{
	public static void main(String[] naufal){
		Scanner sc = new Scanner(System.in);
		System.out.println("Silahkan masukkan huruf yang ingin dikonversikan: ");
		char huruf = sc.next().charAt(0);
		
		switch (huruf){
			case 'A':
			System.out.println("Nilai anda : 4.0");
			break;
			case 'B':
			System.out.println("Nilai anda : 3.0");
			break;
			case 'C':
			System.out.println("Nilai anda : 2.0");
			break;
			case 'D':
			System.out.println("Nilai anda : 1.0");
			break;
			case 'E':
			System.out.println("Nilai anda : 0");
			break;
			default:
			System.out.println("Maaf, konversi nilai tidak diketahui.");
		}
	}
}