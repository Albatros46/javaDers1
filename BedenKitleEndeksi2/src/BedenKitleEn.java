
import java.util.Scanner;


public class BedenKitleEn {
    public static void main(String[] args){
    /* BKİ = Kilo / Boy * Boy
       BKİ <= 18.50 Zayıf
       BKİ >= 25 Norrmal
       BKİ =< 30 Fazla Kilolu
       BKİ >= 30 OBEZZZ
    */
    Scanner scanner=new Scanner(System.in);
    System.out.print("Adınız Soyadınız :");
    String AdSoyad=scanner.nextLine();
    System.out.print("Kilonuz :");
    float kilo=scanner.nextFloat();
    System.out.print("Boyunuz (ör:1,76) :");
    float boy=scanner.nextFloat();
    double bki=kilo/(boy*boy);
        if (bki<=18.50) {
            System.out.print("Sayın "+AdSoyad+" BKİ ="+bki+" ZAYIF");
        }else if (bki<=25) {
            System.out.print("Sayın "+AdSoyad+" BKİ ="+bki+" NORMAL");
        }else if (bki<=30) {
            System.out.print("Sayın "+AdSoyad+" BKİ ="+bki+" KİLOLU");
        }else if (bki<=30) {
            System.out.print("Sayın "+AdSoyad+" BKİ ="+bki+" OBEZZZZ");
        }else{
            System.out.print("Sayın "+AdSoyad+" BKİ ="+bki+" SAĞLIKSIZ HASTA OLABİLİR");
        }
    }
}
