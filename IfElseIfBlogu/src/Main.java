
import java.util.Scanner;


public class Main {
    	public static void main(String[] args) {
	double a,b; int islem;
	Scanner scanner=new Scanner(System.in);
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
	if(islem=='1') { 
                scanner.nextLine();     
		double toplam=a+b;
                 
		System.out.print("Sonuç :"+toplam);
	}else if(islem=='2') {
                scanner.nextLine();
		double cikarma=a-b;
                
		System.out.print("Sonuç :"+cikarma);
	}else if(islem=='3') {
                scanner.nextLine();
		double carpma=a*b;
                
		System.out.print("Sonuç :"+carpma);
	}else if(islem=='4') { 
            scanner.nextLine();
		double bolme=a*b;
               
		System.out.print("Sonuç :"+bolme);
	}else {
		System.out.print("Seçim yapmadınız...");
	}
	
}
}
