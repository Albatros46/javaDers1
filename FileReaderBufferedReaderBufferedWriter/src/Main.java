
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
        /*
            Dosyalarimiz .txt uzantisinda ise FileReader ve BufferedReader kullanmak daha kolay
            BufferedReader, FileReader gore daha hizli performans gostermektedir.
            FileReader, harici diskte bulunan dosyanin hepsini okumak yerine bir tane karakter okuyup gidip gelir.
            BufferedReader, harici diskte kume olusturup \n gorene kadar tum dosyayi okur 
                           dosyada boslugu gordukten sonra kume halinde gelir.
        */
//        try(Scanner scanner=new Scanner(new BufferedReader(new FileReader("Ogrenci.txt")))
//                
//                ){//Scanner icinde bulunan 
//            while(scanner.hasNextLine()){//En son deger okunana kadar taramaya devam edecek
//                System.out.println("Okunan Satir : "+scanner.nextLine());
//                System.out.println("----------------------------");
//                String ogrBilgisi=scanner.nextLine();
//                String[] array=ogrBilgisi.split(",");//String turunde dizin olusturduk dinin elemanlarini , ile ayrildigini belirttik
//               
//                if (array[1].equals("Iktisat")) {
//                    System.out.println("Ogrenci Bilgisi"+ogrBilgisi);
//                }
//                
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Dosya Bulunamadi!");
//        } catch (IOException ex) {
//            System.out.println("Dosya acilirken bir hata olustu...");
//        }
          try(BufferedWriter yazici=new BufferedWriter(new FileWriter("Ogrenci.txt",true))){
              yazici.write("Celal Bingol"+"Ziraat Muhendisi");
          } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
