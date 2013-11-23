//Method Exception

package Latihan1.Sesi01.bin;
import java.io.*;

public class Metode1 {
	static BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	public static void main (String[] Xx) {
		try {
			System.out.println("Pilih (1/2/3 : " + "\n\t1. Udang" + "\n\t2. Kepiting" + "\n\t3. Kerang");
			System.out.println();
			System.out.println("Masukkan Pilihan Anda : ");
			String choose = input.readLine();
			if(choose.equals("1")) {
				System.out.println("Anda memilih Udang");
			}
			else
			if(choose.equals("2")) {
				System.out.println("Anda memilih Kepiting");
			}
			else
			if(choose.equals("3")) {
				System.out.println("Anda memilih Kerang");	
			}
			else             {
					throw new Exception ("Pilihan Anda tidak tersedia");
			}
		}
		catch (Exception e)  {
			System.out.println(e.getMessage());
		}
	}
}	