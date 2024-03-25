
package pertemuan2;
import javax.swing.JOptionPane;
/**
 *
 * @author Adhitya 25 Maret 2024
 */
//MENGGUNAKAN JOptionPane


public class msgbox {
    public static void main(String[] args){
        String nama ="";
        
        System.out.println("MENGGUNAKAN JOPTIONPANE");
        nama = JOptionPane.showInputDialog("Input Nama : ");
        
        System.out.println("Nama : "+nama);
    }
}
