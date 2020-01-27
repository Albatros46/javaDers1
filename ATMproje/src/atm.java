
import java.util.Scanner;


public class atm {
    public static void main(String [] args){
     	/*  işlemler
	 * 1-Bakiye Sorgulama
	 * 2-Para Çekme
	 * 3-Para Yatırma
	* Çıkış: q
	 *  While döngüsü kullanarak yapacağız
	 * */
	Scanner scanner=new Scanner(System.in);
	int bakiye=1000;
	String islemler="1.İşlem : Bakiye Sorgulama \n"+
			 "2.İşlem : Para Çekme \n"+
			 "3.İşlem : Para Yatırma\n"+
			 "Çıkış işlemi için q ya basınız.";
	System.out.println("-----------------------------------------");
	System.out.println(islemler);
	System.out.println("-----------------------------------------");   
        while(true)
        {
           System.out.println("İşleminizi Seçiniz :");
			String islem=scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Çıkış Yapılıyor...");
				break;
			}else if(islem.equals("1")) {
				System.out.println("Bakiyeniz :"+bakiye);
			}
			else if(islem.equals("2")) {
				System.out.print("Çekmek İstediğiniz Tutar :");
				int cekilen=scanner.nextInt();
				scanner.nextLine();
				if(bakiye-cekilen<0) {
					System.out.println("Bakiyeniz Yetersiz.."+bakiye);
				}else {
					bakiye-=cekilen;
					System.out.println("Yeni Bakiyeniz :"+bakiye);
				}
			}
			else if(islem.equals("3")) {
				System.out.println("Yatırmak istediğiniz Tutar :");
				int yatan=scanner.nextInt();
				scanner.nextLine();
				bakiye+=yatan;
				System.out.println("Yeni Bakiyeniz :"+bakiye);
			}else {
				System.out.println("Geçersiz İşlem...");
        }
    }
}
}
