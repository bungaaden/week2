public class AksiSepeda 
{
    public static void main(String[] args)
    {
        //membuat objek
        Sepeda sepedaLipat = new Sepeda (2,"lipat","polygon");

        //mengakses atribut dan method
        int gearSepeda = sepedaLipat.gear;
        System.out.println("Jumlah gear "+gearSepeda);
        sepedaLipat.ngerem();
    }    
}
