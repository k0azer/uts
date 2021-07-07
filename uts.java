import java.util.Scanner;
public class uts{
    public static void main(String[] args) {

        
        System.out.println("\nSUGENG GUNANTIO\n191011400393\nPEMROGRAMAN 1 - UTS\n");
        System.out.println("=========================================");
        
        while(true){
        System.out.println("\n== Materi UTS ==");
        System.out.println("a. Pertemuan 1-4 (Tentang Java)");
        System.out.println("b. Pertemuan 5-6 (Install & Running Java)");
        System.out.println("c. Pertemuan 7-10 (Perulangan)");
        System.out.println("d. Pertemuan 11-12 (Class, Object dan Parameter)");
        System.out.println("e. Keluar Program");

        Scanner sv = new Scanner(System.in);
        String pilih;
        int sel;
        
        System.out.print("\nMasukkan pilihan [a-d] : ");
        pilih = sv.next(); //use sv.next().charAt(0); if using Char

        if (pilih.equals("a")){     //use == 'a' if using Char
            System.out.println("\n1. Pengenalan Java");
            System.out.println("2. Dasar Pemograman");
            System.out.println("3. Input & Output");
            System.out.println("4. Struktur Kontrol");

            System.out.print("\nPilih [1-4] : ");
            sel = sv.nextInt();

            if(sel == 1){
                System.out.println("\n== PENGENALAN JAVA ==");
                System.out.println("\nPada tahun 1998 - 1999 lahirlah teknologi java berbasis enterprise yang disebut J2EE (Java 2 Enterprise Edition) yang diawali dengan servlet dan EJB kemudian diikuti JSP. Java juga menjadi lebih cepat populer di lingkungan server side dikarenakan kelebihanya di lingkungan network dan terdistribusi serta kemampuan multithreading. Selain itu java juga mengembangkan J2ME (Java 2 Micro Edition) yang dapat menghasilkan aplikasi mobile baik games maupun software yang dapat dijalankan di peralatan mobile seperti ponsel. ");
                System.out.println("\n-Sistem Kerja Java-\nJava merupakan bahasa pemrograman yang terdiri dari compiler dan interpreter, compiler menerjemahkan kode sumber program java menjadi bytecode. Java interpreter dapat dijalankan langsung dari command prompt; atau applet viewer atau web browser (untuk applet). Kelemahan adalah kecepatan eksekusi program akan lebih lambat dari program biasa karena program bytecode harus diterjemahkan terlebih dahulu oleh interpreter, kemudian dijalankan pada hardware. dalam membuat sebuah program berbasis Java adalah menuliskan kode program pada text editor. Contoh text editor yang dapat digunakan antara lain : notepad, vi, emacs dan lain sebagainya. Kode program yang dibuat kemudian disimpan dalam sebuah berkas berekstensi java. Berkas yang mengandung bytecode tersebut kemudian akan dikonversikan oleh Java Interpreter menjadi bahasa mesin sesuai dengan jenis dan platform yang digunakan.");
                System.out.println("\n-Teknologi Java-\nTeknologi java merupakan sebuah bahasa pemrograman dan platform. Platform adalah lingkungan perangkat keras atau lunak dimana program berjalan. Kita sudah mengenal beberapa platform yang paling populer seperti Microsoft Windows, Linux, Solaris OS, dan Mac OS.Platform Java berbeda dari platform lainnya, karena hanya merupakan platform perangkat lunak yang berjalan di atas platform hardware lainnya. Java platform terdiri dari dua komponen, yaitu Java Virtual Machine (JVM) dan Aplication Programming Interface (API).");
            }
            else if(sel == 2){
                System.out.println("\n== DASAR PEMOGRAMAN ==\n");
                System.out.println("-Java Identifier-\nJava identifier adalah suatu tanda yang mewakili nama-nama variabel, metode, kelas, paket, dan interface.\nContoh dari identifier adalah : Hello, main, System, out.");
                System.out.println("\n-Java Literal-\nPenulisan besaran untuk variable adalah penting, literal di java terdiri dari : \na. Angka \nb. Karakter \nc. String");
                System.out.println("\n-Variabel-\nUntuk deklarasi variabel adalah sebagai berikut : \n\t<data tipe> <name> [=initial value];");
                System.out.println("\nUntuk mengeluarkan nilai dari variabel yang diinginkan, kita dapat menggunakan perintah berikut ini : \n\tSystem.out.println()\n\tSystem.out.print()");
                System.out.println("\n-Operator-\n\t+ = Operator Tambah\n\t- = Operator Pengurangan\n\t* = Operator Perkalian\n\t/ = Operator Pembagian\n\t< = Operator lebih kecil\n\t> = Operator Lebih Besar\n\t% = Operator Sisa Pembagian");
            }
            else if(sel == 3){
                System.out.println("\n== Input & Output ==");
                System.out.println("\n-Menggunakan Scanner-");
                System.out.println("import paket scanner pada awal code , berikut kodenya: \n");
                System.out.println("\timport java.util.scanner;\n");
                System.out.println("Kemudian panggil scanner tersebut dengan cara : ");
                System.out.println("\n\tScanner save = new Scanner(System.in);");
                System.out.println("\n\nBuat variabel yang akan digunakan untuk fungsi input, contoh :");
                System.out.println("\n\tnama = sv.nextLine();");
                System.out.println("\n\nCatatan :\nnextLine digunakan untuk tipedata string \nnextInt digunakan tipedata interger\nnextFloat digunakan untuk tipe data float\n\n");
            }
            else if(sel == 4){
                System.out.println("\n== Struktur Kontrol ==");
                System.out.println("\n-Percabangan IF-");
                System.out.println("Bentuk Percabangan IF : ");
                System.out.println("\tif(boolean_expression) statement;\n");
                System.out.println("atau\n\tif (boolean_expression){\n\tstatement1; statement2;\n\t}");
                System.out.println("\n-Percabangan Switch");
                System.out.println("\n\tswitch (switch_expression){\n\tcase case_selector1: \n\tstatement1; // \n\tstatement2; //blok pernyataan ke-1 \n\t. . . //\n\tbreak;\n\tcase case_selector2:\n\tstatement1; //\n\tstatement2; //blok pernyataan ke-2\n\t. . . //\n\tbreak;\n\t. . . \n\tdefault:\n\tstatement1; //\n\tstatement2; //block n . . . //\n\tbreak;\n ");
            }
            
        }

        else if (pilih.equals("b")){     //use == 'a' if using Char
        System.out.println("\n1. Install Java SDK");
        System.out.println("2. Compile dan Run Java");
        System.out.println("3. Program Menghitung nilai mahasiswa dengan java");

        System.out.print("\nPilih [1-3] : ");
        sel = sv.nextInt();

        if(sel == 1){
            System.out.println("\n== Install Java SDK ==");
            System.out.println("-Yang pertama harus dilakukan adalah download software JDK nya terlebih dahulu di website resmi oracle atau website yang sudah terpercaya, ");
            System.out.println("-http://www.google.com/url?q=http%3A%2F%2Fwww.oracle.com%2Ftechnetwork%2Fjava%2Fjavase%2Fdownloads%2Fjdk8-downloads-2133151.html&sa=D&sntz=1&usg=AFQjCNF9OdixZIQRO7jwOBfAUYUH8e3jCA");
            System.out.println("-Buka program yang telah di download dengan cara double klik dan kilik Next.");
            System.out.println("-Kliki Next hingga masuk ke proses instalasi. Tunggu hingga proses instalasi selesai.");
            System.out.println("-Setelah selesai, klik Close untuk menutup proses instalasi.");
            System.out.println("-Setelah selesai instalasi, selanjutnya mari setting path JDK. Salin lokasi folder instalasi JDK.");
            System.out.println("-Selanjutnya klik kanan pada This PC > pilih Properties.");
            System.out.println("-Setelah itu akan muncul Window baru (System) dan pilih Advanced System Settings.");
            System.out.println("-Selanjutnya pilih Environment Variables.");
            System.out.println("-Pada bagian System Variables cari Path kemudian klik Edit.");
            System.out.println("-Maka akan terbuka window baru yaitu Edit System Variable. Arahkan kursor pada box bagian Variable Value dan arahkan kursor kebagian paling kanan.\nTambahkan titik koma (;) dan Paste alamat lokasi folder JDK yang telah kita Copy sebelumnya dan klik OK.");
            System.out.println("-Setelah itu akan kembali ke Window Environment Variables dan klik OK, setelah itu akan kembali ke windows System Properties dan klik OK kembali.");
        }
        else if(sel == 2){
            System.out.println("\n== Compile dan Run Java ==");
            System.out.println("1. Pertama tama siapkan software Text Editor (Notepad++, Sublime , dll) terlebih dahulu , disini saya menggunakan Visual Studio Code");
            System.out.println("Buatlah kode sederhana terlebih dahulu , contohnya saya ingin membuat program dengan output \"Hello World\". ");
            System.out.println("Source Code : \n\tclass HelloWorld\n\t{\n\tpublic static void main(String args[])\n\t{\n\tSystem.out.println(\"SUGENG GUNANTIO \\n 191011400393\");\n\tSystem.out.println(\"Hello, World\");\t\n}\n\t}");
            System.out.println("\n-Save dan beri ekstensi .java pada akhir nama file tersebut . Pada java , nama file harus sesuai dengan nama class pada kode program tersebut ,\nkarna saya membuat class nya dengan HelloWorld maka saya akan beri nama file tersebut HelloWorld juga (Perhatikan Besar Kecil Hurufnya)");
            System.out.println("-Buka folder dimana file tersebut disimpan , lalu copy path nya.");
            System.out.println("-Buka CMD (Pada bar pencarian Windows , ketik CMD lalu tekan Enter), Kemudian ketik perintah \"cd pathfileyangdicopy\"\n\n\tcontoh : cd C:\\Users\\Administrator\\Documents\\kuliah\\pemograman\\vicon . Lalu tekan Enter.");
            System.out.println("\n-Ketik javac HelloWorld.java lalu tekan Enter \nJika tidak error , lanjut ketik java HelloWorld (tanpa .java) lalu tekan Enter");
            System.out.println("-Jika berhasil maka akan tampil output hasil kode pemograman tadi , Selesai.");

        }
        else if(sel == 3){
            sv.nextLine();
            System.out.println("\n== Program Menghitung nilai mahasiswa dengan java ==");
            System.out.println("\nSugeng Gunantio");
            System.out.println("191011400393");
            System.out.println("Studi Kasus 3 : Menghitung Nilai Mahasiswa");
            System.out.println("Pemrograman 1 - Universitas Pamulang");
            System.out.println("==============================================");
            
            String nama;
            float kh, khTotal, tugas, tugasTotal, uts, utsTotal, uas, uasTotal, total;
            int real = 18;
            System.out.print("Masukkan Nama Mahasiswa: ");
            nama = sv.nextLine();
            System.out.print("Masukkan Nilai Kehadiran: ");
            kh = sv.nextFloat();
            khTotal = kh/real*10;
            // System.out.println(khTotal);
            System.out.print("Masukkan Nilai Tugas: ");
            tugas = sv.nextFloat();
            tugasTotal = (tugas*20)/100;
            // System.out.println(tugasTotal);
            System.out.print("Masukkan Nilai UTS: ");
            uts = sv.nextFloat();
            utsTotal = (uts*30)/100;
            // System.out.println(utsTotal);
            System.out.print("Masukkan Nilai UAS: ");
            uas = sv.nextFloat();
            uasTotal = (uas*40)/100;
            // System.out.println(uasTotal);
    
            total = khTotal+tugasTotal+utsTotal+uasTotal;
            System.out.println("\nTotal: "+total);
            // System.out.println(nama);
            System.out.print("Keterangan: ");
            if (total >= 80){
                System.out.print(nama+" dinyatakan lulus dengan grade A\n");
            }
            else if(total >= 70){
                 System.out.print(nama+" dinyatakan lulus dengan grade B\n");
            }
            else if(total >= 60){
                 System.out.print(nama+" dinyatakan lulus dengan grade C\n");
            }
            else if(total >= 55){
                 System.out.print(nama+" dinyatakan tidak lulus dengan grade D, tetap semangat !\n");
            }
            else{
                 System.out.print(nama+" dinyatakan tidak lulus dengan grade E, tetap semangat\n");
            }
         }
        }      
         
        else if (pilih.equals("c")){     //use == 'a' if using Char
            System.out.println("\n1. Perulangan While");
            System.out.println("2. Perulangan For");
            System.out.println("3. Perulangan Do While");
            System.out.println("4. Program Input Mahasiswa dengan Perulangan");

            
            System.out.print("\nPilih [1-4] : ");
            sel = sv.nextInt();

            if(sel == 1){
            System.out.println("\n== Perulangan While ==");
            System.out.println("\nSource Code WhileLoop:\n\n");
            System.out.println("\tpublic class WhileLoop{\n                \tpublic static void main(String args[]){\n                    \tint i = 0;\n\n                    \twhile ( i <= 10 ){\n                        \t// blok kode yang akan diulang\n                        \tSystem.out.println(\"Perulangan ke-\" + i);\n                        // increment nilai i                        \n\ti++;                    \n\t}                \n}            \n}");
            System.out.println("\n\nHasil Output: \n");
            int i = 0;

            while ( i <= 10 ){
            // blok kode yang akan diulang
            System.out.println("Perulangan ke-" + i);
        
            // increment nilai i
            i++;
                }

            }
            else if(sel == 2){
            System.out.println("\n== Perulangan For ==");
            System.out.println("Perulangan for adalah: ");
            System.out.println("\nSource Code:\n");
            System.out.println("\tString Loop;");
            System.out.println("\tScanner simpan = new Scanner(System.in);");
            System.out.println("\n\tfor(Loop=\"Y\"; Loop.equals(\"y\") || Loop.equals(\"Y\");){");
            System.out.println("\tSystem.out.println(\"Star\");");
            System.out.println("\tSystem.out.print(\"apakah anda ingin mengulang (y/t : )\");");
            System.out.println("\tLoop = simpan.next();");
            System.out.println("\t        }");
            System.out.println("        System.out.print(\"Finish\");");
            System.out.println("    }");
            System.out.println("}");
            System.out.println("\nHasil Output:\n");

            String Loop;
            Scanner simpan = new Scanner(System.in);
    
            for(Loop="Y"; Loop.equals("y") || Loop.equals("Y");){
                System.out.println("Star");
                System.out.print("apakah anda ingin mengulang (y/t : )");
                Loop = simpan.next();
            }
            System.out.print("Finish\n\n");
            }

            else if(sel == 3){
                System.out.println("\n== Perulangan Do While ==");
                System.out.println("\nSource Code :\n");
                System.out.println("\tpublic class DoWhile {");
                System.out.println("    \tpublic static void main(String[] args) {");
                System.out.println("\n        \t// membuat variabel");
                System.out.println("        \tint i = 0;");
                System.out.println("\n        \tdo {");
                System.out.println("            \tSystem.out.println(\"perulangan ke-\" + i);");
                System.out.println("            \ti++;");
                System.out.println("        \t} while ( i <= 10);");
                System.out.println("    \t}");
                System.out.println("}");

                System.out.println("Hasil Output: \n");

                // membuat variabel
                int i = 0;

                do {
                System.out.println("perulangan ke-" + i);
                i++;
                } while ( i <= 10);

                
            }
            else if(sel == 4){
            System.out.println("\n== Program Input Mahasiswa dengan Perulangan ==");
            String Loop;
            int pilihan;
            int real;
            float kh=0, khTotal, tugas, tugasTotal, uts, utsTotal, uas, uasTotal, total=0;
            String nama = "Nama belum di isi!";
            String grade = "Grade belum ada";
            int minat=0;
            System.out.println("\nSUGENG GUNANTIO\n191011400393");
            System.out.println("===================================");
            
            for(Loop="T"; Loop.equals("t") || Loop.equals("T");){
                System.out.println("\n1. Input nama mahasiswa");
                System.out.println("2. Input nilai mahasiswa");
                System.out.println("3. Input peminatan mahasiswa");
    
                System.out.print("\nMasukkan Pilihan [1-3] : ");
                pilihan = sv.nextInt();
    
                if(pilihan == 1){
                    sv.nextLine();
                    System.out.print("\nMasukkan Nama : ");
                    nama = sv.nextLine();
                    System.out.print("\nApakah ingin cetak? [y/t] : ");
                    Loop = sv.nextLine();
                }
                else if (pilihan == 2){
                    System.out.print("\nMasukkan Nilai Kehadiran: ");
                    kh = sv.nextFloat();
                    System.out.print("Masukkan Nilai Realisasi: ");
                    real = sv.nextInt();
                    khTotal = kh/real*10;
                    // System.out.println(khTotal);
                    System.out.print("Masukkan Nilai Tugas: ");
                    tugas = sv.nextFloat();
                    tugasTotal = (tugas*20)/100;
                    // System.out.println(tugasTotal);
                    System.out.print("Masukkan Nilai UTS: ");
                    uts = sv.nextFloat();
                    utsTotal = (uts*30)/100;
                    // System.out.println(utsTotal);
                    System.out.print("Masukkan Nilai UAS: ");
                    uas = sv.nextFloat();
                    uasTotal = (uas*40)/100;
                    // System.out.println(uasTotal);
            
                    total = khTotal+tugasTotal+utsTotal+uasTotal;
                    // System.out.println("\nTotal: "+total);
                    // System.out.println(nama);
                    if (total >= 80){
                        grade = "Grade : A";
                    }
                    else if(total >= 70){
                        grade = "Grade : B";
                    }
                    else if(total >= 60){
                        grade = "Grade : C";
                    }
                    else if(total >= 55){
                        grade = "Grade : D";
                    }
                    else{
                        grade = "Grade : E";
                    }
                    System.out.print("\nApakah ingin cetak? [y/t] : ");
                    Loop = sv.next();
                }
                else if(pilihan == 3){
                    System.out.println("\n1.Pemrograman");
                    System.out.println("2.Sistem Informasi\n");
    
                    System.out.print("Masukkan Peminatan yang ingin dipilih [1-2] : ");
                    minat = sv.nextInt();
                        if(minat == 1){
                            minat = 1;
                        }else if(minat == 2){
                            minat = 2;
                        }
                        System.out.print("\nApakah ingin cetak? [y/t] : ");
                        Loop = sv.next();
                }
            }
            System.out.print("===================================\n");
            System.out.print("KESIMPULAN\n\n"); 
            System.out.println("NAMA: "+nama);
            System.out.println("Kehadiran "+ nama + " Sebanyak : "+kh);
            System.out.println("Total Nilai "+ nama + " adalah "+total);
            System.out.println(grade);
            System.out.print("Peminatan yang diambil: ");
            if(minat == 1){
                System.out.println("Anda Memilih Pemograman");
            }else if(minat == 2){
                System.out.println("Anda Memilih Sistem Informasi");
            }else{
                System.out.println("Anda Belum memilih Peminatan");
            }
            System.out.println("===================================");
            
             }
        }   
        else if(pilih.equals("d")){
            System.out.println("\n== Mengenal Class, Object dan Parameter ==");
            System.out.println("1. Program Sepeda");
            System.out.println("2. Program Matematika");
            System.out.println("3. Program Lampu");
            System.out.println("4. Program AC");

            System.out.print("\nPilih [1-4] : ");
            sel = sv.nextInt();

            if (sel == 1){
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
            else if (sel == 2){

                matematika hitung = new matematika();
    
                System.out.print("\n");
                hitung.pertambahan(20, 20);
                hitung.pengurangan(10,5);
                hitung.perkalian(10,20);
                hitung.pembagian(21,2);
            }
    
            else if(sel == 3){
                Lampu lampuKamar = new Lampu();
    
                System.out.print("\n");
                System.out.println("Status Lampu Saat Ini: Mati");
        
                lampuKamar.hidupkan(); //Hidupkan Lampu
                lampuKamar.matikan(); //Matikan Lampu
                lampuKamar.matikan(); //Matikan Lampu
                lampuKamar.hidupkan(); //Hidupkan Lampu
                lampuKamar.hidupkan(); //Hidupkan Lampu
            }
    
            else if(sel == 4){
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

       

        else if(pilih.equals("e")){
            System.out.println("\nTerimakasih . Program Exited..");
            break;
            }
        else{
            System.out.println("\n[!] Menu Tidak Ada");
        }
        }
        }
}
