
import java.util.Scanner;//JAvada tanımlı kütüphaneden import edildi


public class InputAlma {
    public static void main(String[] args) {
	Scanner Ad=new Scanner(System.in);
        System.out.println("Adınız :");
        String Adi=Ad.nextLine();
        Scanner Soyad=new Scanner(System.in);
        System.out.println("Soyadınız :");
        String Soyadi=Soyad.nextLine();
        Scanner Yas=new Scanner(System.in);
        System.out.println("Yaşınız :");
         int yasi=Yas.nextInt();
        System.out.println(Adi+" "+Soyadi+" Yaşınız :"+yasi);    
        Scanner sayi=new Scanner(System.in);
        if (sayi.hasNextInt()) {
            int say=sayi.nextInt();
            System.out.println("Sayınız :"+say);
        }else {
            System.out.println("Lütfen bir sayı giriniz!");
        }
        Scanner scanner =new Scanner(System.in);
        int j=scanner.nextInt();
        scanner.nextLine();//tam sayı degerden sonra string deger istemeden program sonlanacağı için Dumyy metod kullanıldı
        String isim=scanner.nextLine();    
        System.out.println("Sayınız :"+j);
        System.out.println("İsminiz :"+isim);
        /* java da : nextInt den sonra nextLine kullanıldıığında hata ile karşılaşıldığı için
        genelde nextLine den sonra nextInt kullanmaya özen gösterilir.*/
    }
}
