
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
    //try with resource metodu ile yaziyoruz.
        try(Scanner scanner=new Scanner(new FileReader("ogrenci.txt"));
                FileWriter yazici=new FileWriter("harfNotlari.txt")){
            
            while(scanner.hasNextLine()){ //dosya okurken bosluk bulana kadar devam et.
                String ogrBilgileri=scanner.nextLine();
                //ogrenci.txt dosyamizda bulunan listede Ad Soyad,Vize1,Vize2,Final notlarý bulunmakta
                //olusturdugumuz dizi de , ile ayrýlan yerden itibaren 
                //AdSoyad 0.index, Vize1 1.index, Vize2. 2.index, FinalNotu 3.index
                String[] ogrArray=ogrBilgileri.split(",");
                int vize1=Integer.valueOf(ogrArray[1]);
                int vize2=Integer.valueOf(ogrArray[2]);
                int finalNotu=Integer.valueOf(ogrArray[3]);
                
                String cikti= harfNotu(ogrArray[0], vize1, vize2, finalNotu);
                yazici.write(cikti+"\n");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String harfNotu(String isim,int v1,int v2, int finalnot){
        String cikti="";
        double toplamNot=(v1*3/10.0)+(v2*3/10.0)+(finalnot*4/10.0);
        if (toplamNot>=90) {
            cikti=isim+" dersten AA aldi. BASARILI";
        }else if(toplamNot>=80){
            cikti=isim+" dersten BA aldi. BASARILI";
        }else if(toplamNot>=70){
            cikti=isim+" dersten BB aldi. IYI DERECE";
        }else if(toplamNot>=60){
            cikti=isim+" dersten CB aldi. ORTA DERECE";
        }else if(toplamNot>=50){
            cikti=isim+" dersten CC aldi. ORTA DERECE";
        }else if(toplamNot>=40){
            cikti=isim+" dersten DC aldi. Kosullu Gecer.";
        }else if(toplamNot>=30){
            cikti=isim+" dersten DD aldi. Kosullu Gecer";
        }else if(toplamNot<=29){
            cikti=isim+" dersten FD aldi. KALDI";
        }else if(toplamNot<=20){
            cikti=isim+" dersten FF aldi. KALDI";
        }else{
            System.out.println("Not Hesaplanamadi!");
        }
         return cikti;
        
    }
}
