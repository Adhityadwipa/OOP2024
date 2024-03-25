
package pertemuan2;
import java.util.Scanner;

/**
 *
 * @author Adhitya 25 Maret 2024
 */
//Menggunakan Snanner
public class scan {
    public static void main(String[] ergs) {
        Scanner dtain = new Scanner(System.in);
        //Deklarasi Variabel
        Double pi, luas;
        int r = 0;
        String nilai="";
        //Deskripsi
        pi = 3.14;
        
        System.out.println("MENGGUNAKAN SNANNER");
        System.out.println("MENGHITUNG LUAS LINGKARAN");
        System.out.println("Input Nilai Jari-Jari ; ");
        nilai = dtain.nextLine();
        r = Integer.parseInt(nilai);
        //proses
        luas = pi * r * r;
        
        //output
        System.out.println("Luas Lingkaran adalah : "+Math.round(luas));
    }
}
