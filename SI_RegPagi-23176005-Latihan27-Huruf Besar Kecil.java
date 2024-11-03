/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 26 - Huruf Besar Kecil
 * Deskripsi Program    : Meminta pengguna untuk memasukkan sebuah kalimat, 
                          lalu mencetak kalimat tersebut dalam huruf besar dan huruf kecil.
 * @author
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kalimat dari pengguna
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        // Menampilkan hasil formatting
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());

        scanner.close();
    }
}

