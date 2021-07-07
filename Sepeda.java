public class Sepeda{
    int kecepatan, gir;

    // method dengan parameter
    void ubahGir(int pertambahanGir){
        gir = gir + pertambahanGir;
       System.out.println("Gir: " + gir);
    }

    void tambahKecepatan (int pertambahanKecepatan){ 
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan: " + kecepatan);
     }
}