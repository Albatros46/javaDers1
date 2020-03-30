
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeYaz {
    public static void main(String[] args) {
        
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){

            Ogrenci ogrenci1 = new Ogrenci("Servet AKCADAG",1234, "Bilgisayar Mühendisliði");
            Ogrenci ogrenci2 = new Ogrenci("Akif AKCADAG",678, "Finansal Matematik");
            
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadý...");
        } catch (IOException ex) {
            System.out.println("Dosya açýlýrken IOException Oluþtu...");
        }
    }
    
}
