/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika
 * NIM      : 23215046
 * Deskripsi Program : Huruf Besar Kecil 
 */ 

package Pertemuan6; 
import java.util.Scanner; 

public class Latihan27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine(); //Penjelasan (1)
        
        System.out.println("\n======Hasil Formatting======");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase()); //Penjelasan (2)

        System.out.println("Huruf Kecil : " + kalimat.toLowerCase()); //Penjelasan (3)
    }
}

/* PENJELASAN 
   (1) Input dari user disimpan dalam variabel 'kalimat' menggunakan 
       input.nextLine() agar seluruh teks dalam satu baris dapat diambil.
   (2) Setelah mendapatkan input, saya menggunakan metode toUpperCase() pada string 'kalimat' untuk 
       mengonversi seluruh huruf dalam kalimat tersebut menjadi huruf besar. Hasilnya ditampilkan 
       dengan System.out.println() disertai keterangan "Huruf Besar".
   (3) Kemudian, untuk menampilkan kalimat dalam huruf kecil, saya menggunakan metode toLowerCase() 
       pada string 'kalimat'. Hasilnya ditampilkan disertai keterangan "Huruf Kecil".  
*/

