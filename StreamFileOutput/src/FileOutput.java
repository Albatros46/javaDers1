
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileOutput {
    public static void main(String[] args) throws IOException{
        OutputStream fos=null;
        File file=new File("dosya.txt");//dosya olusturma islemi
       
        //veya asagidaki gibi de dosya olusturabiliriz
        try {
            
            fos=new FileOutputStream("deneme.txt",true);
             //"deneme.txt",true seklinde kullanim yaparsak var olan dosyaya ekleme yaparak kullanabiliriz 
             //aksi halde program her calistiginde dosyayi temizler ve yeni eklene veriyi yazar
            fos.write(65);//65 ASCI koduna karsilik gelen degeri dosyaya yazacaktir.
            fos.write(75); fos.write(95); fos.write(63); fos.write(105);
            
            //veya array olarak da dosya ya yazabiliriz
            
            byte[] karakterDizi={66,68,69,71,78,95,85};
            fos.write(karakterDizi);//diziyi dosya ya yazdirdik
            
            /*String ifadeyi dosyaya yazdirma islemi
            Eger bir String dosyaya yazdirilmek isteniyorsa yazdirilmadan once
            byte[] array a donusturulmeli. donusturme islemi gerceklestikten sonra 
            dosyay yazdirilir.
            */
            String s="Sehit P.Asb.Kd.Çvþ. Akif AKCADAG";//String ifademiz
            byte[] s_array=s.getBytes();//byte arraya donusturduk
            fos.write(s_array);//doyaya yazdirdik
            
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException olustu....");
            Logger.getLogger(FileOutput.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //Acmis oldugumuz dosyasi kapatacagiz, IOException aldigimiz icin yine try-catch icinde yaziyoruz
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(FileOutput.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Dosya Kapatilirken bir hata olustu...");
            }
        }
    }
}
