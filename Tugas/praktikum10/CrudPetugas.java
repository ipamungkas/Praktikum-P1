package Latihan10.Praktikum10.interfece;

public class CrudPetugas implements Crud
{
@Override
public void simpan()
{
System.out.println("method simpan dalam class CrudPetugas");
}

@Override
public void hapus()
{
System.out.println("method hapus dalam class CrudPetugas");
}
}