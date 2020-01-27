
import java.util.Scanner;


public class ATM {
    public void Calis(Hesap hesap){
        Giris giris1=new Giris();
        Scanner scanner=new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("-----------Kullanıcı Girişi-------------");
        int sayac=3; //Kullanıcı 3 defa yanlış girerse program sonlansın
        while(true){
            if (giris1.Giris(hesap)) {
                System.out.println("Giriş Başarılı...");
                break;
            }else{
                System.out.println("Giriş Başarısız...");
                sayac-=1;
                System.out.println("Giriş Hakkınız :"+sayac);
            }
            if (sayac==0) {
                System.out.println("Giriş Hakkınız Bitmiştir.");
                return; // metod sonlanması için kullanıyoruz.
            }
        }
        System.out.println("----------------İŞLEMLER------------------");
        String islemler="1-Bakiye Sorgula\n"
                + "2-Para Yatırma \n"
                + "3-Para Çekme\n"
                + "4-Çıkış için (q) basınız\n";
        System.out.println(islemler);
        System.out.println("-------------------------------------------");
        while(true){
            System.out.println("İşlem Seçiniz :");
            String islem=scanner.nextLine();
            if (islem.equals("q")) {
                break;
            }else if (islem.equals("1")) {
                System.out.println("Bakiyeniz :"+hesap.getBakiye());
            }else if (islem.equals("2")) {
                System.out.println("Yatıracağız Tutar :");
                double yatan=scanner.nextDouble();//nextInt, float ve double den sonra hata vermemesi için nextline kullandık
                scanner.nextLine();//hata vermesin diye kullandık
                hesap.ParaYatir(yatan);
                
            }else if (islem.equals("3")) {
                System.out.println("Çekmek İstediğiniz Tutar :");
                double cekilen=scanner.nextDouble();
                scanner.nextLine();
                hesap.ParaCek(cekilen);
            }else{
                System.out.println("Geçersiz İşlem!");
            }
        }
    }
}
