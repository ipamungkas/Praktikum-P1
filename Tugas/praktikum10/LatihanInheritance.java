package Latihan10.Praktikum10.inheritance;

public class LatihanInheritance
{
public static void main(String[] Xx)
{
AirMineral a = new AirMineral();
System.out.println("nama minuman : "+a.getNama());
System.out.println("rasa minuman : "+a.getRasa());
System.out.println("warna minuman : "+a.getWarna());
System.out.println("bersoda ? " +a.isBersoda());

Kopi k = new Kopi();
System.out.println("");
System.out.println("nama minuman : "+k.getNama());
System.out.println("rasa minuman : "+k.getRasa());
System.out.println("warna minuman : "+k.getWarna());
System.out.println("bersoda ? " +k.isBersoda());
System.out.println("berkafein ? "+k.isBerkafein());

Susu s = new Susu();
s.setBerkalsium(true);
s.setBersoda(false);
s.setWarna("putih");
s.setRasa("hambar");
s.setNama("Susu Murni");

System.out.println("");
System.out.println("nama minuman : "+s.getNama());
System.out.println("rasa minuman : "+s.getRasa());
System.out.println("warna minuman : "+s.getWarna());
System.out.println("bersoda ? " +s.isBersoda());
System.out.println("berkalsium ? "+s.isBerkalsium());
}
}