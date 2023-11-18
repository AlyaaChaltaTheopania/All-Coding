class GanGep{
	public static void main(String[]Naufal){
	
	int A = 2;
	int B = 3;
	int C = 10;
	int D = 9;
	int E = 19;
	int F = 4;
	
	int angka [] = {2, 3, 10, 9, 19, 4};
	int total = A+B+C+D+E+F;
	double mean = total/6;
	
	for(int x = 0; x < angka.length; x++){
	if (angka[x]%2 != 0){
		System.out.println("Bilangan ganjil: "+angka[x]);
		}
	}
	for(int x = 0; x < angka.length; x++){
	if (angka[x]%2 == 0){
		System.out.println("Bilangan genap: "+angka[x]);
		}
	}
	System.out.println("Totalnya adalah: " + total);
	System.out.println("Rata-ratanya adalah: " + mean);
}
}
	