
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ObjeOku {
    public static void main(String[] args) throws IOException {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
            //readobject bastan sona kadar okudugu icin
             Ogrenci[] ogrenci_array=(Ogrenci[])in.readObject();
             ArrayList<Ogrenci> ogrenci_list=(ArrayList<Ogrenci>)in.readObject();
             
             System.out.println("****************Array*********************");
             for (Ogrenci o:ogrenci_array) {
                 System.out.println(o);
                 System.out.println("----------------------------------------");
                 
            }System.out.println("***************ArrayList*******************");
            for (Ogrenci o:ogrenci_list) {
                 System.out.println(o);
                 System.out.println("_________________________________________");
                 
            }System.out.println("******************************************");
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadý...");
        }  catch (ClassNotFoundException ex) {
            System.out.println("Sýnýf Bulunamadý...");
        }
        
    }
    
}
