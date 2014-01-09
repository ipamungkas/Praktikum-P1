package Latihan10.Praktikum10.bin;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LatihanNilai
{
protected int NILAI;

public void setNilai(int Nilai)
{
NILAI = Nilai;
}
public void Tulis()
{
System.out.println("Nilai Anda : " +Nilai);
}
protected static int inputDataInteger()
{
BufferedReader BFR = new BufferedReader(new InputStreamReader (System.in));
String angkaInput = null;
try
{
angkaInput = BFR.readLine();
}
catch (final IOException e)
{
e.printStackTrace();
}
int Data = Integer.valueOf(angkaInput).intValue();
return Data;
}
protected static String inputDataString()
{
final BufferedReader BFR = new BufferedReader(new InputStreamReader (System.in));
String Input = null;
try
{
Input = BFR.readLine();
}
catch(final IOException e)
{
e.printStackTrace();
}
final String Data = String.valueOf(Input);
return Data;
}
}