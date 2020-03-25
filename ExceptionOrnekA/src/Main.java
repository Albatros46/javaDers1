
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Kahramanmaras Havalimanýna Hoþgeldiniz....");
        
        String sartlar = "Yurtdýþý Çýkýþ Kurallarý...\n"
                         +"Herhangi bir siyasi yasaðýnýzýn bulunmamasý gerekiyor...\n"
                         +"15 Tl harç bedelinizi tam olarak yatýrmanýz gerekiyor...\n"
                         +"Gideceðiniz ülkeye vizenizin bulunmasý gerekiyor...";
        String message = "Yurtdýþý þartlarýndan hepsini saðlamanýz gerekiyor";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            
            Thread.sleep(3000);// Program calisirken her islem arasinda 3 sn bekleyecek
            
            try { //Burada HarcException yakalandik
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
                
                
            }
            
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);// Program calisirken her islem arasinda 3 sn bekleyecek
            
            try {//Burada SiyasiException yakalandik
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
                
            }
            
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000); // Program calisirken her islem arasinda 3 sn bekleyecek
            
            try {//Burada VizeException yakalandik
                yolcu.vizeDurumuKontrol();
            } catch (VizeException ex) {
               ex.printStackTrace();
               continue;
            }
            
            System.out.println("Ýþlemleriniz Tamam ! Yurtdýþýna çýkabilirsiniz...");
            break;
            
            
        }
        
        
    }
}
