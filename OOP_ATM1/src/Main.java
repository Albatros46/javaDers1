public class Main {
    public static void main(String[] args) {
	/* Loogin class : Giriş kontrolleri için kulllanılacak
           Hesap class  : Hesaptan para çekme ve hesaba para yatırmak için kullanılacak
           ATM class    : ATM nin çalışması için kullanılacaktır.
        */	
        ATM atm=new ATM();
        Hesap hesap1=new Hesap("Servet","12345",2500.0);
        atm.Calis(hesap1);
        System.out.println("Programdan Çıkılıyor...");
	}
}
