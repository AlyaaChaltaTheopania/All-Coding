import java.util.Scanner;
	class Negara{
	public static void main(String[] naufal){
		System.out.println("1. ES");
		System.out.println("2. TN");
		System.out.println("3. ID");
		System.out.println("4. MM");
		System.out.println("5. IN");
		Scanner sc = new Scanner(System.in);
		int kode = sc.nextInt();
		
		switch(kode){
			case 1:
			System.out.println("Spain");
			break;
			case 2:
			System.out.println("Tunisia");
			break;
			case 3:
			System.out.println("Indonesia");
			break;
			case 4:
			System.out.println("Myanmar");
			break;
			case 5:
			System.out.println("India");
			break;
			default:
			System.out.println("Maaf,kode negara TIDAK DIKETAHUI.");
		}
	}
}