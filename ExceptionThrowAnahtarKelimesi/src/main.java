
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        //throw anahtar kelimesi ile kendi exceptionlarimizi olusturabiliriz.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen Yasinizi Girin : ");
        int yas=scanner.nextInt();
        try{ //Eger yas konstol metodunda hataya yakalanirsa o hatayi yakalasin
        yasKontrol(yas);
        }catch(ArithmeticException e){
            System.out.println("18 Yasindan Kucukler Mekana Giremez...");
        }
               
    }
    
    public static void yasKontrol(int yas){ //Yas kontrolu yapan metodumuzu yazdik
        if(yas<18){
            throw new ArithmeticException();//Kendi hata kodumuzu olusturduk
        }else{
            System.out.println("Mekana Hosgeldiniz.");
        }
        
    }
}
