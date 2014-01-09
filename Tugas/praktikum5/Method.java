package Latihan05.Praktikum05.bin;
import java.util.Scanner;

public class Method {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   Person personObject = new Person();
   
   System.out.println("Enter your name here : ");
   String name = input.nextLine();
   
   personObject.simpleMessage(name);
   }
}
   