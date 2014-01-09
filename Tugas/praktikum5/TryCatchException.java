package Latihan05.Praktikum05.bin;
import java.io.*;
public class TryCatchException   {
   static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
   public static void main(String[] args)   {
   try          {
      System.out.println("Choose one of the option (1-3) : " + "\n\t1.) Steak" + "\n\t2.) Lobster" + "\n\t3.) CheeseBurger");
	  System.out.println();
	  System.out.println("Masukkin Pilihan Anda : ");
	  String choose = input.readLine();
	  if(choose.equals("1"))    {
	     System.out.println("Anda Memilih Steak :-)");
	  }
	  else
	  if(choose.equals("2"))    {
	     System.out.println("Anda Memilih Lobster :-D");
	  }
	  else
	  if(choose.equals("3"))    {
	     System.out.println("Anda Memilih CheeseBurger :-)");
      }
	  else                      {
	     throw new Exception("Pilihan Anda Tidak Tersedia !!!");
	  }
	}
	catch(Exception e)          {
	   System.out.println(e.getMessage());
	   }
	}
}
	  