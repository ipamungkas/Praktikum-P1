package Latihan08.Praktikum08.bin;

class Perkutut extends Hewan 
{
public Perkutut(){
   super("Perkutut",2,true);
   }
   public void bersuara() {
      System.out.println("\ncuit, cuit, cuit");
   }
   public static void main(String[] args) {
   Perkutut p = new Perkutut();
   p.isHewan();
   p.bersuara();
   }
}
