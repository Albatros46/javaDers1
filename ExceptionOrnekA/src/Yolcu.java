
import java.util.Scanner;

class SiyasiException extends Exception {// SiyasiException olusturuldu

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Yasaðýnýz Bulunuyor...");

    }
  
}

class VizeException extends Exception { // VizeException olusturldu

    @Override
    public void printStackTrace() {
        System.out.println("Gideceðiniz Vizeniz Bulunmamaktadýr...");
    }
    
}

class HarcException extends Exception { //HarcException olusturuldu

    @Override
    public void printStackTrace() {

        System.out.println("Lütfen yurtdýþý harcýný tam yatýrýn...");
    }
  
}

public class Yolcu{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatýrdýðýnýz Harç Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasaðýnýz bulunuyor mu(evet ya da hayýr) ? ");
        
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayýr)");
        
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet") ){
            this.vizeDurumu = true;
            
        }
        else {
            this.vizeDurumu = false;
        }
       
    }

    
    public void yurtdisiHarciKontrol() throws HarcException {
        if (this.harc < 15) {
            
           throw new HarcException();//Olusturdugumuz HarcException'u burada kullandik
           
        }
        else {
            System.out.println("Yurtdýþý harcý iþlemi tamam!");
          
        }
    }

    
    public void siyasiYasakKontrol() throws SiyasiException {
        
        if (this.siyasiYasak == true) {
            throw new SiyasiException();//Olusturdugumuz SiyasiException'u burada kullandik
            
           
        }
        else {
            System.out.println("Siyasi yasaðýnýz bulunmuyor...");
           
        }
    }

    
    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu == true) {
            System.out.println("Vize iþlemleri tamam!");
            
        }
        else {
            throw new VizeException();//Olusturdugumuz VizeException'u burada kullandik
                        
        }

    }
    
    
}
