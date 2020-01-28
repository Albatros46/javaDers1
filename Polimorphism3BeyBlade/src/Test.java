
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
    // Polimorphism yöntemi kullanılarak yazılmıştır.
        System.out.println("Hoşgeldiniz....");  
        System.out.println("Çıkış için ( q ) basınız!");
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Hangi BeyBlade yi üretmen istersiniz?");
            String islem=scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }else{
                BeyBladeUretim uretim=new BeyBladeUretim();
                BeyBlade beyblade=uretim.BeyBlade_Uret(islem);
                if (beyblade==null) {
                    System.out.println("Lütfen Geçerli Bir Seçim Yapınız...");
                }else{
                    beyblade.BilgiGetir();
                    beyblade.saldiriGucu();
                    beyblade.KutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
