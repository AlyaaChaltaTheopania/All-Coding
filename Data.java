import java.util.Scanner;
class Data{
	public static void main(String [] Naufal){
	Scanner sc = new Scanner(System.in);
	System.out.print("Jumlah Data: ");
	
	int input = sc.nextInt();
	int array[] = new int [input];
	System.out.println("Inputan Data: ");
	
	for(int a = 0; a < input; a++){
		System.out.print("Data ke-" + a);
		System.out.print(" = ");
		array[a] = sc.nextInt();
		}
		
	for(int b = 0; b < input;b++){
	if(array[b]%2 == 0){
		System.out.println(array[b]+ " adalah bilangan genap. ");
		} else {
		System.out.println(array[b]+ " adalah bilangan ganjil. ");
		}
	}
	
	int angka = 0;
	for (int c = 0; c < input; c++){
	angka = angka + array[c];
	}
	
	System.out.println("Jumlah data berikut adalah " + angka);
	double rata = angka/input;
	System.out.println("Rata-rata data berikut adalah " + rata);
	}
}
		
		