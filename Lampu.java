public class Lampu implements InterfaceLampu{
    int statusLampu;

    public void hidupkan(){
        if (this.statusLampu == KeadaanMati){
            this.statusLampu = KeadaanHidup;
            System.out.println("Hidupkan Lampu! --> Lampu Hidup");
        }else{
            System.out.println("Hidupkan Lampu! --> Lampu Sudah Hidup Kok");
        }
    }

    public void matikan(){
        if (this.statusLampu == KeadaanHidup){
            this.statusLampu = KeadaanMati;
            System.out.println("Matikan Lampu --> Lampu Mati");
        }else{
            System.out.println("Matikan Lampu --> Lampu Sudah Mati Kok");
        }
    }
}