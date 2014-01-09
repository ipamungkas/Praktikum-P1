package Latihan10.Praktikum10.Operator;

public class LatihanOperator
{
public static void main(String[] Xx)
{
int contoh1 = 10;
int contoh2 = 20;

int nilai = 80;
int angka = 1;

String a = "Pancasila";
Operasi op = new Operasi();

System.out.println("Fungsi a++ : "+op.opTambah(contoh1));
System.out.println("Fungsi ++a : "+op.opTambah2(contoh1));
System.out.println("Fungsi a-- : "+op.opKurang(contoh1));
System.out.println("Fungsi --a : "+op.opKurang2(contoh1));

System.out.println("Fungsi apakah lebih besar nilai a dibanding b? : "+op.apakahLebihBesar(contoh1, contoh2));
System.out.println("Fungsi apakah lebih kecil nilai a dibanding b? : "+op.apakahLebihKecil(contoh1, contoh2));
System.out.println("Fungsi apakah sama antara nilai a dibanding b? : "+op.apakahSamaDengan(contoh1, contoh2));

System.out.println("Membandingkan String tidak bisa menggunakan ==");
System.out.println("Apakah nilai a sama dengan Pancasila? : "+ a.equals("Pancasila"));

System.out.println("");
System.out.println("==Mengenal fungsi operator sebagai masukan dalam statement flow control==");

if (nilai<40)
{
System.out.println("Grade nilai : D");
}
else if (nilai>=40 && nilai < 60)
{
System.out.println("Grade nilai : C");
}
else if (nilai>=60 && nilai < 80)
{
System.out.println("Grade nilai : B");
}
else if (nilai>=80 && nilai < 90)
{
System.out.println("Grade nilai : A");
}
else if (nilai>=90 && nilai <= 100)
{
System.out.println("Grade nilai : A+");
}
else
{
System.out.println("Grade nilai : tidak ada grade jika nilai diatas 100");
}

System.out.println("");
System.out.println("==Mengenal fungsi operator sebagai masukan dalam statement perulangan==");

for(int i=1; i<=5; i++)
{
System.out.println("Iterasi ke-"+i);
}
}
}