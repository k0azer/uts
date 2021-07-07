public class AC implements InterfaceAC{
    int statusAC;
    int tempAC = suhuACAwal;
    int suhuACAkhir;

    public void hidupkanAC(){
        if (this.statusAC == KeadaanMati){
            this.statusAC = KeadaanHidup;
            System.out.println("Hidupkan AC! --> AC Hidup");
        }else{
            System.out.println("Hidupkan AC! --> AC Sudah Hidup Kok");
        }
    }

    public void matikanAC(){
        if (this.statusAC == KeadaanHidup){
            this.statusAC = KeadaanMati;
            System.out.println("Matikan AC --> AC Mati");
        }else{
            System.out.println("Matikan AC --> AC Sudah Mati Kok");
        }
    }

    public void dinginkanAC(int suhu){
        suhuACAkhir = tempAC - suhu;
        if (this.tempAC < suhuACMin ){
            System.out.println("Suhu tidak boleh kurang dari 16C");
        }else{
            System.out.println("Suhu diturunkan -" + suhu + "C" + "\nSuhu Sekarang : " + suhuACAkhir + "C\n");
            tempAC = suhuACAkhir;
        }
    }

    public void panaskanAC(int suhu){
        suhuACAkhir = tempAC + suhu;
        if (this.tempAC > suhuACMax){
            System.out.println("Suhu tidak boleh lebih dari 32C");
        }else{
            System.out.println("Suhu dinaikkan +" + suhu +"C" + "\nSuhu Sekarang : " + suhuACAkhir + "C\n");
            tempAC = suhuACAkhir;
        }
    } 
}