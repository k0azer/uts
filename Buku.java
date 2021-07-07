public class Buku{
    public String judul, pengarang, penerbit, tahun;

    public Buku(String judul, String pengarang, String penerbit, String tahun){ 
         this.judul = judul;
         this.pengarang = pengarang;
         this.penerbit = penerbit;
         this.tahun = tahun;
     }

     void cetakBuku (){ 
          System.out.println("Judul : " + judul + "\nPengarang : " + pengarang + "\nPenerbit : " + penerbit + "\nTahun: " + tahun + "\n"); 
      }
}