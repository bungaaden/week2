public class Sepeda
{
    //tempat untuk atribut
    int gear=5;

    //tempat untuk method
    void ngerem()
    {
        System.out.println("Sepeda direm");
    }

    Sepeda (int jumlahRoda, String jenis, String merk)
    {
        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }
}