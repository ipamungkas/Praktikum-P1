//Contoh 2

package Latihan1.sesi1.bin;

public class DemoLooping
{
	public static void main (String[] Xx)
	{
	String[][] daftarnilai = new String[][]
	{
		new String[]{"001", "A"},
		new String[]{"002", "B"},
		new String[]{"003", "C"},
	};
System.out.println ("LOOPING MENGGUNAKAN FOR");

for (int i=0; i<daftarnilai.length; i++)
{
		System.out.println("NPM    : " +daftarnilai[i][0]);
		System.out.println("Nilai  : " +daftarnilai[i][1]);
}
	System.out.println("SELESAI LOOPING FOR");
	System.out.println();
	System.out.println();
	System.out.println("LOOPING MENGGUNAKAN WHILE");
	int ix = 0;

while (ix < daftarnilai.length)
{
	System.out.println("NPM    : " +daftarnilai[ix][0]);
	System.out.println("Nilai  : " +daftarnilai[ix][1]);
	ix++;
}
	System.out.println("SELESAI LOOPING WHILE");
}	
}