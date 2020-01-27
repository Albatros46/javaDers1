
import java.util.Scanner;


public class Main {
    public void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("____---|Hoşgeldiniz|---____");
        String islemler="İşlemler\n"
                        +"1-Yazılımcı İşlemleri\n"
                        +"2-Yönetici İşlemleri\n"
                        +"Çıkış için (q) basınız.\n";
        System.out.println("***____---|Hoşgeldiniz|---____***");
        System.out.println(islemler);
        System.out.println("*********************************");
        while (true) {            
            System.out.println("İşlem Seçinic :");
            String islem=scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdam Çıkılıyor...");
                break;
            }else if (islem.equals("1")) {
                Yazilimci yazilmci=new Yazilimci("Servet","Akcadag",1,"Java,C#,Python");
                String yazilimci_islemler="İşlemler\n"
                        +"1-Format At\n"
                        +"2-Bilgileri Göster\n"
                        +"Çıkış için (q) basın\n";
                System.out.println(yazilimci_islemler);
                while(true){
                    System.out.println("İşlem Seçiniz :");
                    String y_islem=scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }else if (y_islem.equals("1")) {
                        System.out.println("İşletim sistemi :");
                        String isletim_sistemi=scanner.nextLine();
                        yazilmci.FormatAt(isletim_sistemi);
                    }else if (y_islem.equals("2")) {
                        yazilmci.BilgileriGoster();
                    }else{
                        System.out.println("Geçersiz İşlem...");
                    }
                }
            }else if (islem.equals("2")) {
                Yonetici yonetici=new Yonetici("Bekir","Akcadag",10,20);
                String yonetici_islemleri="İşlemler\n"
                        +"1-Zam Yap\n"
                        +"2-Bilgileri Göster\n"
                        +"Çıkış için (q) basın\n";
                System.out.println(yonetici_islemleri);
                
                while(true){
                System.out.println("İşlem Seçiniz :");
                String yon_isl=scanner.nextLine();
                    if (yon_isl.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }else if (yon_isl.equals("1")) {
                        System.out.println("Ne kadar zam yapacaksınız :");
                        int zamMik=scanner.nextInt();
                        yonetici.ZamYap(zamMik);
                    }else if (yon_isl.equals("2")) {
                        yonetici.BilgileriGoster();
                    }else{
                        System.out.println("Geçersiz İşlem...");
                        break;
                    }
                }
            }else{
                System.out.println("Seçim Yapmadınız");
                break;
            }
            
        }
    }
}
