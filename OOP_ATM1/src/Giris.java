
import java.util.Scanner;


public class Giris {
    public boolean Giris(Hesap hesap){
        //giriş başarılı ise true değilse false değer return edeceği için boolean metod kullanıyoruz.
        Scanner scanner =new Scanner(System.in);
        String KullaniciAdi;
        String Parola;
        System.out.println("Kullanıcı Adı :");
        KullaniciAdi=scanner.nextLine();
        System.out.println("Parola        :");
        Parola=scanner.nextLine();
            if (hesap.getKullaniciAdi().equals(KullaniciAdi) && (hesap.getParola().equals(Parola))) {
                return true; //equals == anlamında
            }else{
                return false;
            }
    }
}
