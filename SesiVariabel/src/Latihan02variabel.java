//Latihan Variabel

package Latihan02.variabel.bin;

public class Latihan02variabel {
	public static void main(String[] qq){
		int x=10;
		System.out.println("Nilai x adalah  " +x);
		
		char z='o';
		System.out.println("Nilai z adalah  " +z);
		
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai y adalah  " +y);
		
		//tidak bisa compile (error)
		//char w=x;
		//System.out.println("Nilai w adalah  " +x);
		
		//Type casting
		int v= 31;
		System.out.println("Nilai v adalah  " +v);
		System.out.println("Baris Selanjutnya");
	
	fungsi();
	
	System.out.println("setelah menjalankan fungsi");
	}
	static int v=77;
	
	public static void fungsi(){
	int v=50;
	System.out.println("Nilai v adalah  " +v);
	
	short d=15;
	System.out.println("D adalah  " +d);
	}
}	