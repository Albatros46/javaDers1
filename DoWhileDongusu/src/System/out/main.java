
package System.out;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
	/* do{
		 * 	yapılan işlemler
		 * }while(şart);
		 * 
		 * */
		int s=0;
		do {
			System.out.println("s ="+s);
			s++;
		}while(s<=10);	
        	//----------------------------------------------
		//Kullanıcıdan istenen sayının rakamları toplamı hesaplamak
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayi Giriniz :");
		int sayi=scanner.nextInt();
		int toplam=0;
		do {
			toplam+=sayi % 10;//toplam değişkeni dışarıdan girilen sayıyı 10 bölümünden kalan alıyor
			sayi/=10; //oluşan yeni sayı ile döngü devam ediyor
		}while(sayi>0);
		System.out.println("Rakamlar Toplamı :"+toplam);
		//123 sayısında 10 bölümünden kalan 3 alıyor yeni oluşan sayı 12 ...
	}
}
