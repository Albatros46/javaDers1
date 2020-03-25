
import java.io.IOException;
import java.util.Scanner;


public class ThrowsAnahtarKelimesi {

    public static void main(String[] args) {
	//throw anahtar kelimesi ile kendi exceptionlarimizi olusturabiliriz.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen Yasinizi Girin : ");
        int yas=scanner.nextInt();
        try{ //Eger yas konstol metodunda hataya yakalanirsa o hatayi yakalasin
        try {
			yasKontrol(yas);
		} catch (IOException e) {
			System.out.println("IOExcepiton olustu...");
			// e.printStackTrace(); //hata kodunu da yazdirmak istersek yorum satiri olmaktan kaldirabiliriz.
		}
        }catch(ArithmeticException e){
            System.out.println("18 Yasindan Kucukler Mekana Giremez...");
        }
               
    }
    //Eger bu dosyayi bir api ye yada Jar dosyasi haline donusturursek IOException u 
    //Api-Jar  kullancak olan kisi kendisi yazmak zorunda
    public static void yasKontrol  (int yas)throws IOException { //Yas kontrolu yapan metodumuzu yazdik
        if(yas<18){
            throw new IOException();//Unchecked Expception oldugu icin hatanin taninmasi icin anahtar kelime istiyor onu onune gecmek icin kullaniyoruz.
        }else{
            System.out.println("Mekana Hosgeldiniz.");
        }
        
    }

}
