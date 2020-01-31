
import java.util.Scanner;


public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir() {
        
        System.out.println("\t 0-Islemleri Goruntule");
        System.out.println("\t 1-Sarkicilari Goruntule");
        System.out.println("\t 2-Sarkici Ekle");
        System.out.println("\t 3-Sarkici Guncelle");
        System.out.println("\t 4-Sarkici Sil");
        System.out.println("\t 5-Sarkici Ara");
        System.out.println("\t 6-Uygulamadan Cik");
        
    }
    public static void sarkici_goruntule() {
        sarkicilar.sarkicilari_bastir();
        
    }
    public static void sarkici_ekle(){
        
        System.out.println("Eklemek istediginiz sarkicinin ismi :");
        
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
        
    }
    public static void sarkici_guncelle() {
        
        System.out.println("Guncellemek istediginiz pozisyon(1,2,3...)");
        
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_isim = scanner.nextLine();
        
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon - 1);
        
    }
    public static void sil() {
        
        System.out.println("Silmek istediginiz pozisyon (1,2,3....)");
        
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkici_sil(pozisyon-1);
        
        
    }
    public static void ara() {
        
        System.out.println("Aramak istediginiz sarkici :");
        
        String isim = scanner.nextLine();
        
        sarkicilar.sarkici_ara(isim);
        
        
    }
    public static void main(String[] args) {
        
        System.out.println("\t Sarkici Uygulmasina Hosgeldiniz...");
        
        islemleri_bastir();
        
        boolean cikis = false;
        
        int islem;
        
        while(!cikis) {
            System.out.println("Bir islem seciniz :");
            
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor...");
                    break;
           
                
                
            }
            
            
        }
        
        
    }
    
}
