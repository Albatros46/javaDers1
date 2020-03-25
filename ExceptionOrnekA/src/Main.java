
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Kahramanmaras Havaliman�na Ho�geldiniz....");
        
        String sartlar = "Yurtd��� ��k�� Kurallar�...\n"
                         +"Herhangi bir siyasi yasa��n�z�n bulunmamas� gerekiyor...\n"
                         +"15 Tl har� bedelinizi tam olarak yat�rman�z gerekiyor...\n"
                         +"Gidece�iniz �lkeye vizenizin bulunmas� gerekiyor...";
        String message = "Yurtd��� �artlar�ndan hepsini sa�laman�z gerekiyor";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Har� Bedeli Kontrol Ediliyor...");
            
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
            
            System.out.println("��lemleriniz Tamam ! Yurtd���na ��kabilirsiniz...");
            break;
            
            
        }
        
        
    }
}
