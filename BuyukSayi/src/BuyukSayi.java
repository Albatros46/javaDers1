
import java.util.Scanner;


public class BuyukSayi {
    public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		System.out.print("1.Sayı :"+a);
		int b=scanner.nextInt();
		System.out.print("2.Sayı :"+b);
		int c=scanner.nextInt();
		System.out.print("1.Sayı :"+c);
		if(a>=b && a>=c) {
			System.out.println("Büyük Sayı :"+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("Büyük Sayı :"+b);
		}
		else if(c>=a && c>=a)
		{
			System.out.println("Büyük Sayı :"+c);
		}
		else if(c==a || b==a || a==b)
		{
			System.out.println("SAYILAR EŞİT");
		}
	}
}
