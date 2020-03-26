
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class ObjeYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci(12 ,"Servet AKCADAG","Bilgisayar Muhendisligi");
        Ogrenci ogrenci2=new Ogrenci(22 ,"Akif AKCADAG","Sehit Astsubay");
        Ogrenci ogrenci3=new Ogrenci(33 ,"Tamer KURTCU","Bilgisayar Muhendisligi");
        Ogrenci ogrenci4=new Ogrenci(44 ,"Turgut TON","Elektrik-Elektronik Muhendisligi");
        Ogrenci ogrenci5=new Ogrenci(55 ,"Ali KUSMUS","Bilgisayar Muhendisligi");
        Ogrenci ogrenci6=new Ogrenci(66 ,"Oguz KARADAG","Iktisat");
        
        Ogrenci[] ogrenci_array={ogrenci1,ogrenci2,ogrenci3,ogrenci4,ogrenci5,ogrenci6};
        ArrayList<Ogrenci> ogrenci_list= new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
            
            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);   
        
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadý...");
        } catch (IOException ex) {
            System.out.println("Dosya açýlýrken IOException Oluþtu...");
        }
    }
    
}
