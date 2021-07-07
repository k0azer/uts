public class SepedaBeraksi{
    public static void main(String[] args){
        // Membuat object
        Sepeda sepedaku = new Sepeda();

        // Memanggil atribut dan memberi nilai 
        sepedaku.kecepatan = 10;
        sepedaku.gir = 2;

        // Memanggil method dan menunjuk nilai parameter
        System.out.print("\n");
        sepedaku.tambahKecepatan(30);
        sepedaku.ubahGir(3);
    }
}