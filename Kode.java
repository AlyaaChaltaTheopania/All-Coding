import java.util.Scanner;
	class Kode{
	public static void main (String[] naufal){
		System.out.println("Silahkan pilih kode negara: ");
		System.out.println("1. ES");
		System.out.println("2. TN");
		System.out.println("3. ID");
		System.out.println("4. MM");
		System.out.println("5. IN");
		
		Scanner sc = new Scanner(System.in);
		int kode = sc.nextInt();
		if (kode == 1){
		System.out.println("Spain");
		} else if (kode == 2){
		System.out.println("Tunisia");
		} else if (kode == 3){
		System.out.println("Indonesia");
		} else if (kode == 4){
		System.out.println("Myanmar");
		} else if (kode == 5){
		System.out.println("India");
		} else {
		System.out.println("Maaf, kode negara TIDAK DIKETAHUI.");
		}
	}
}