import java.util.Scanner;
class Harga{
	public static void main(String[]Naufal){
	Scanner sc = new Scanner(System.in);
	System.out.println("Inputan barang: ");
	
	int array[] = {2500, 3000, 4000, 5000, 6000};
	int [] item = new int [array.length];
	for (int a = 0; a < array.length; a++){
		System.out.print("Jumlah barang ke-" + a + " Rp " + array[a] + ": ");
		item[a] = sc.nextInt();
		}
		System.out.println("Daftar belanja dan harga: ");
	for (int a = 0; a < array.length; a++){
	int uang = array[a]*item[a];
		System.out.println("Harga barang ke-" + a + " Rp " + array[a] + "," + item[a] + "item: " + "Rp" + uang);
		}
	int total = 0;
	for (int a = 0; a < array.length; a++){
		total = total + item[a];
		}
	int harga = 0;
	for (int a = 0; a < array.length; a++){
		harga = harga + array[a]*item[a];
		}
	System.out.println("Total belanja anda: " + total);
	System.out.println("Jumlah harga: " + harga);
	}
}