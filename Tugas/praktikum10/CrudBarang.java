package Latihan10.Praktikum10.interfece;

public class CrudBarang implements Crud
{
@Override
public void simpan()
{
System.out.println("method simpan dalam class crudbarang");
}
@Override
public void hapus()
{
System.out.println("method hapus dalam class crudbarang");
}
}