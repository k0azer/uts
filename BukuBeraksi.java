public class BukuBeraksi{
    public static void main(String[] args) {
        
        Buku buku_1 = new Buku(
            "Teach Yourself Java 6 in 21 Days",
            "Rogers Cadenhead & Laura Lenay",
            "Sans Publishing",
            "2007"
        );

        Buku buku_2 = new Buku(
            "Java How to Program 7th Edition",
            "Deitel & Deitel",
            "Prentice Hall",
            "2007"
        );

        System.out.print("\n");
        buku_1.cetakBuku();
        buku_2.cetakBuku();

    }
}