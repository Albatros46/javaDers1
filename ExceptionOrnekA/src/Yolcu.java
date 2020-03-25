
import java.util.Scanner;

class SiyasiException extends Exception {// SiyasiException olusturuldu

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Yasa��n�z Bulunuyor...");

    }
  
}

class VizeException extends Exception { // VizeException olusturldu

    @Override
    public void printStackTrace() {
        System.out.println("Gidece�iniz Vizeniz Bulunmamaktad�r...");
    }
    
}

class HarcException extends Exception { //HarcException olusturuldu

    @Override
    public void printStackTrace() {

        System.out.println("L�tfen yurtd��� harc�n� tam yat�r�n...");
    }
  
}

public class Yolcu{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yat�rd���n�z Har� Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasa��n�z bulunuyor mu(evet ya da hay�r) ? ");
        
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hay�r)");
        
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
            System.out.println("Yurtd��� harc� i�lemi tamam!");
          
        }
    }

    
    public void siyasiYasakKontrol() throws SiyasiException {
        
        if (this.siyasiYasak == true) {
            throw new SiyasiException();//Olusturdugumuz SiyasiException'u burada kullandik
            
           
        }
        else {
            System.out.println("Siyasi yasa��n�z bulunmuyor...");
           
        }
    }

    
    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu == true) {
            System.out.println("Vize i�lemleri tamam!");
            
        }
        else {
            throw new VizeException();//Olusturdugumuz VizeException'u burada kullandik
                        
        }

    }
    
    
}
