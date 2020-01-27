
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
	/*if (şartımız) {
            eğer şartımız sağlanırsa
        } else {
            şartımız sağlanmaz ise
        }*/
       Scanner scanner =new Scanner(System.in);
       System.out.println("Vize Notunuzu giriniz :");//Vize notu girilecek
       double vize=scanner.nextDouble();
       System.out.println("Final Notunuzu giriniz :");//Final notu girilecek
       double fin=scanner.nextDouble();
       System.out.println("Proje Notunuzu giriniz :");//Proje notu girilecek
       double proje=scanner.nextDouble();
       double ort=(vize*20/100)+(fin*30/100)+(proje*50/100);
       //Vize notunun %20, final notu %30, proje notu %50 si alınarak ortalama hesaplanacak
       if (ort<=50){
       System.out.print("Ortalamanız :"+ort+ "olduğu için BAŞARISIZ");
       }else{
       System.out.print("Ortalamanız :"+ort+ "olduğu için BAŞARILI");
       }
    }
}
