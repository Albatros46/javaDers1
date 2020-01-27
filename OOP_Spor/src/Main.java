
import java.util.Scanner;


public class Main {
    public static void main(String [] args){
    Scanner scanner=new Scanner(System.in);
        System.out.println("Spor Salnumuza Hoşgeldiniz...");
        String sporlar="Geçerli Hareketler\n"
                +"Mekik\n"
                +"Şınav\n"
                +"Barfiks\n";
        System.out.println(sporlar);
        System.out.println("Bir Spor Oluşturun...");
        System.out.println("Şınav Sayısı :");
        int sinavv=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mekik Sayısı :");
        int meikk=scanner.nextInt();
         scanner.nextLine();
        System.out.println("Barfiks Sayısı :");
        int barikss=scanner.nextInt();
         scanner.nextLine();
         Spor spor=new Spor(sinavv,meikk,barikss);
        System.out.println("Spor Başlasın....");
        while(spor.SporBittiMi()==false){
            System.out.println("Hareket Türü : Şınav, Mekik, Barfiks :");
            String tur=scanner.nextLine();
            System.out.println("Kaç Tekrar Yapacaksınız :");
            int tekrar=scanner.nextInt();
            scanner.nextLine();
            spor.hareketYap(tur, tekrar);//Kullanıcıdan istenilen hareket turu ve sayısı Spor.java daki hareketYap metoduna gönderiliyor
        }
    }  
}
