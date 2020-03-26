
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        // Idman Oluþturma Programý
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programýna Hoþgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler...\n"
                          + "Burpee\n"
                          +"Pushup(Þýnav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluþturun...");
        
        System.out.print("Burpee Sayýsý : ") ;
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayýsý : ") ;
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayýsý : ") ;
        int situp = scanner.nextInt();
        System.out.print("Squat Sayýsý : ") ;
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
    
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("Ýdmanýnýz Baþlýyor.....");
        
        int i =  1;
        
        try(FileWriter writer = new FileWriter("log.txt")) {
            writer.write("Idman Programý...\n");
            writer.write("Burpee Sayýsý : " + idman.getBurpee_sayisi() + " \n");
            writer.write("Pushup Sayýsý : " + idman.getPushup_sayisi()+ " \n");
            writer.write("Situp Sayýsý : " + idman.getSitup_sayisi()+ " \n");
            writer.write("Squat Sayýsý : " + idman.getSquat_sayisi()+ " \n");
           
          
        while (idman.idmanBittiMi() == false){
            
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksýnýz ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            
            writer.write(i + ".Ýþlem ---------->  Hareket : " + tur + " Sayý : " + sayi + "\n");
            i++;
            
            
        }
        
        System.out.println("Idmanýný baþarýyla bitirdin....");
    
    
    }   catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
