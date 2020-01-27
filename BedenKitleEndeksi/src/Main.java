
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
   /*Beden Kitle Endeksi = Kilo/ Boy * Boy*/
	Scanner scanner =new Scanner(System.in);
	System.out.print("Kilonuzu giriniz  :");
	double kilo=scanner.nextDouble();
	System.out.print("Boyunuzu Giriniz(örnek:1,75) :");
	double boy=scanner.nextDouble();
	double bki=kilo/(boy*boy);
	System.out.println("Beden Kitle Endeksiniz :"+bki); 
    }
}
