
package pertemuan2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Adhitya 25 Maret 2024
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String nama = "Adhitya";
        String nim = "2201010366";
        int no1 = 2;
        int no2 = 3;
        int hasil = no1 + no2;
        
        System.out.println("Nama saya "+ nama);
        System.out.println("Dengan NIM : "+ nim);
        System.out.println(no1*5); */
        
        
        
        //Menggunakan BufferedReader
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in) );
        //Deklarasi Variabel
        Double pi, luas;
        int r = 0;
        String nilai="";
        String nama ="";
        
        //Deskripsi
        pi = 3.14;
        
        System.out.print("Input Nama : ");
        try{
            nama = dtain.readLine();
        }catch(IOException e){
            System.out.println("Error: ");
        }
        
        System.out.println("MENGGUNAKAN BUFFEREDREADER");
        System.out.println("\nHITUNG LUAS LINGKARAN");
        System.out.print("Input Nilai Jari-Jari(cm) : ");
        try{
            nilai = dtain.readLine();
        }catch(IOException e){
            System.out.println("Error: ");
        }
        r = Integer.parseInt(nilai); //mengubah tipe data sting ke integer
        //proses
        luas = pi*r*r;
        
        //output
        System.out.println("===================================");
        System.out.println("Nama : "+nama);
        System.out.println("Luas Lingkaran dengan\n r = "+r);
        System.out.println("adalah : "+Math.round(luas)+" cm");
        

    }
    
}
