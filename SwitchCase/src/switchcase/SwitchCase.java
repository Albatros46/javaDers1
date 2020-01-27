
package switchcase;

import java.util.Scanner;


public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           /*
         *  switch (şart){
         *  	case durum1:
         *  	işlemler
         *  	break;
         *  	case durum2:
         *  	işlemler
         *  	break;
         *  	case durum3:
         *  	işlemler
         *  	break;
         *  	default:
         *  	işlemler
         *  	break;
         *  }
         * */
        Scanner scanner=new Scanner(System.in);
		double a,b; int islem;
		
		System.out.print("Bir sayı giriniz :");
			a=scanner.nextDouble();
	        scanner.nextLine();
		System.out.print("Bir sayı giriniz :");
			b=scanner.nextDouble();
	        scanner.nextLine();
		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("İşlem seçiniz :");
		islem=scanner.nextInt();
		switch(islem) {
		case 1://islem degiskeni 1 degerini alırsa aşağıdaki kod çalışsın
			double toplam=a+b;
			System.out.print("Sayıların Toplamı :"+toplam);
			break;
		case 2://islem degiskeni 2 degerini alırsa aşağıdaki kod çalışsın
			double cikarma=a-b;
			System.out.print("Sayıların Toplamı :"+cikarma);
			break;//break kullanılmaz ise break bulunan case e kadar işlem devam eder.
		case 3://islem degiskeni 3 degerini alırsa aşağıdaki kod çalışsın
			double carpma=a*b;
			System.out.print("Sayıların Toplamı :"+carpma);
			break;
		case 4://islem degiskeni 4 degerini alırsa aşağıdaki kod çalışsın
			double bolme=a/b;
			System.out.print("Sayıların Toplamı :"+bolme);
			break;
		default://islem degiskeni yukarıdakiler dışında deger alırsa aşağıdaki kod çalışsın
			System.out.println("Seçim Yapmadınız...");
			break;
		}
    }
    
}
