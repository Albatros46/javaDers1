
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TryWithResource {
    public static void main(String[] args){
        //Java 7 ile gelen TryWithResource ozelligini ogrenecegiz.
        
        try(FileWriter yazici=new FileWriter("deneme.txt");//burda birden cok dosya ekleyebiliriz.
            FileWriter yazici1=new FileWriter("deneme2.txt");
            FileWriter dil=new FileWriter("diller.txt"))
        {
        //FileWriter->OutputStreamWriter->writer den extends edildigi icin Writer de 
        //bulunan Closeable metodu ile kapatmasi saglanacak    
        //islemlerimizi art�k buraya yazabiliriz.
            yazici.write("Sehit P.Asb.Kd.Cvs. Akif AKCADAG-Kahramanmaras");
            yazici1.write("Servet AKCADAG");
            String diller;
            Scanner scanner=new Scanner(System.in);
            while(true){
                System.out.print("Bir Programlama Dili Giriniz : ");
                diller=scanner.nextLine();
                
                if(diller.equals("-1")){
                    System.out.println("Programdan Cikiliyor...");
                    System.out.println("Dosyayi Kontrol Edin.");
                    break;
                }
                dil.write(diller+"\n");
            }
            
        } catch (IOException ex) {
            System.out.println("Dosya olusturulurken IOException olustu!");
        }
        
    }
}
