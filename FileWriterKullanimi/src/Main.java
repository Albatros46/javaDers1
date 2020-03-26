
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
        //file writer sayesinde dosyayi byte den donusturmeden yazma ve okuma islemi yapabiliriz.
        FileWriter yazici=null;
        try {
            yazici=new FileWriter("deneme.txt");
            // yazici=new FileWriter("deneme.txt",true); // bu sekilde de kullanabiliriz.
            yazici.write("Sehit P.Asb.Kd.Cvs. Akif AKCADAG\n");//dogrudan string ifade yazdiriyoruz. \n ile alt satira geciyor
            yazici.write("Suriye'nin Idlip sehrinde 28.02.2020 tarihinde\n");
            yazici.write("Rusya ve Rejim Gucleri'nin hava saldirisi esnasinda Sehit oldu.\n");
            yazici.write("Benim En degerli Kardesim.\n");
        } catch (IOException ex) {
            System.out.println("Dosya Acilirken IOException olustu!");
        }finally{
            if (yazici!=null) {
                try {
                    yazici.close();
                } catch (IOException ex) {
                    System.out.println("Dosya Kapatilirken Hata olustu...");
                }
            }
        }
    }
}
