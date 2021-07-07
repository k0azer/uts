public class ACBeraksi {
    public static void main(String[] args) {
        
        int suhuSekarang = 25;
        AC ACKamar = new AC();

        System.out.print("\n");
        System.out.println("Status AC Saat Ini: Mati");
        System.out.println("Temperature AC Saat Ini: " + suhuSekarang + "C");
        System.out.print("\n");

        ACKamar.hidupkanAC(); //hidupkanAC AC
        ACKamar.matikanAC(); //matikanAC AC
        ACKamar.matikanAC(); //matikanAC AC
        ACKamar.hidupkanAC(); //hidupkanAC AC
        ACKamar.hidupkanAC(); //hidupkanAC AC
        System.out.print("\n");

        ACKamar.dinginkanAC(2); //dinginkan AC
        ACKamar.panaskanAC(4); //panaskan AC
        ACKamar.dinginkanAC(7); //dinginkan AC
        ACKamar.panaskanAC(1); //panaskan AC
    }
}