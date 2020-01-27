
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    /* 5!=1*2*3*4*5=120
    mantık= i sayacımız 1 den başlıyor dışarıdan girilen sayıya eşit olana kadar sayacı artırdık
    dışarıdan girilen sayıya eşit olana kadar artırılan i yi kendisi ile çarpıp faktroiyel değişkenine aktardık.
    */
        System.out.print("Bir Sayi Giriniz :");
        int faktoriyel=1;
        int sayi=scanner.nextInt();
        for (int i = 1; i <= sayi; i++)//dışarıdan istenen sayıya eşit olana kadar sayacı artır
        {
            faktoriyel*=i; // sayacı kendisi ile çarp ve faktoriyel değişkenine aktardık.
            System.out.println("Faktoriyel ="+faktoriyel+" i="+i);
        }
        System.out.println("Sayının Faktoriyeli :"+faktoriyel);
    }
}
