

package Latihan1.sesi1.bin;
import java.util.Random;

public class DemoLooping2
{
	static boolean selesai = false;
	public static void main(String[] Xx)
	{
		int faktor =7;
		System.out.println("Mencari kelipatan" +faktor + "dengan while");
		while(!selesai)
		{
			cariKelipatan(faktor);
		}	
		System.out.println("SELESAI MENCARI KELIPATAN DENGAN WHILE");
		System.out.println();
		System.out.println();
		System.out.println("Mencari kelipatan" +faktor + "dengan for");
		for(selesai=false; !selesai;)
		{
			cariKelipatan(faktor);
		}
		System.out.println("Mencari kelipatan" +faktor + "dengan for");	
	}
public static void cariKelipatan(int faktor)
{
		int Random = new Random().nextInt();
		System.out.println("Bilangan Random : " +Random);
		
		if(Random % faktor ==0)
		{
			System.out.println("Kelipatan " +faktor + "ditemukan yaitu : " +Random);
			selesai = true;
		}
	}	
}		
		
		