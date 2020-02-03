
import java.util.Scanner;


public class Main { //STATIC OLMAYAN INNER CLASS lar
    public static void main(String[] args){ 
        /* Inner Class-Dahili Sinif
            1-Static olmayan Inner Class
            2-Static Inner Class
            3-Lokal (Yerel) Inner Class
            4-Anonymous (Anonim) Inner Class
        */
        //Matematik.Faktoriyel faktoriyel=new Faktoriyel(); // bu sekil de faktoriyel caagiramadigimiz icin inner class larda
        Matematik.Faktoriyel faktoriyel=new Matematik().new Faktoriyel();//once matematik olusturuldu sonra matematik icndeki faktoriyel
        Matematik.Asal asal=new Matematik().new Asal();
        Matematik.Alan alan=new Matematik().new Alan();
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi Giriniz :");
        int sayi=scanner.nextInt();
        if (asal.asalMi(sayi)) {
            System.out.println("Bu Sayi ASALDIR");
        }else{
            System.out.println("Bu sayi ASASL DEGILDIR...");
        }
        faktoriyel.faktoriyel();
        alan.daire_alan(sayi);
    }
}
