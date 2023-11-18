class GG {
	public static void main(String [] Naufal){
	
	int angka [] = {1, 2, 3, 4, 5, 6, 7};
	for (int x = 0; x < angka.length; x++){
	if (angka[x]%2 != 0){
		System.out.println("Bilangan ganjil: "+angka[x]);
		}
	}
	for (int x = 0; x < angka.length; x++){
	if (angka[x]%2 == 0){
		System.out.println("Bilangan genap: "+angka[x]);
		}
	}
}
}	