/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongsayibulma;

import java.util.Scanner;

/**
 *
 * @author KCDG
 */
public class ArmstrongSayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Armstrongsayi= bir sayının basamak degeri kadar rakamlarının
		// üssü alınarak yine o sayıya eşit olmasıdır.
		//örnek: 1234 , 4 basamaklı sayısı 
		//1234=1^4+2^4+3^4+4^4 eşitlik var ise bu sayı armstrongtur.
		//do - while döngüsü ile yapacağız.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz :");
		int sayi=scanner.nextInt();
		System.out.println("Basamak Değerini Giriniz :");
		int basamak=scanner.nextInt();
		int gecicideger=sayi;
		int toplam=0;
		do{
			int basamakdegeri = gecicideger % 10;
			gecicideger /= 10;
			toplam+= Math.pow(basamakdegeri, basamak);
			
		}while(gecicideger > 0 );
		if(toplam==sayi) {
			System.out.println("Bu bir ARMSTRONG sayıdır...");
		}else {
			System.out.println("Bu bir ARMSTRONG SAYI DEĞİLDİR...");
		}
    }
    
}
