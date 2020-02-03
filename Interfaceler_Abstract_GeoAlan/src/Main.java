
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        String islemler="Islemler\n"
                + "1-Kare Alan Hesapla\n"
                + "2-Ucgen Alan Hesapla\n"
                + "3-Daire Alan Hesapla\n"
                + "4-Dikdortgen Alan Hesapla\n"
                + "Cikis icin ( q )";
        while(true){
            System.out.println(islemler);
            System.out.println("Hangi Sekli Alanini Hesaplamak Ýstersiniz.");
            String SekilTuru=scanner.nextLine();
            Sekil sekil=null;
            if (SekilTuru.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            }else if(SekilTuru.equals("1")){
                System.out.println("Karenin Kenari :");
                int kenar=scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare 1 :",kenar); //sekil objesini kare ye atadigimiz icin sekil kare gibi 
                sekil.alanHesapla(); //davranacak ve alan hesabini kare icin kullanacak
            }else if(SekilTuru.equals("2")){
                System.out.println("Ucgenin Cevreleri :");
                int a1=scanner.nextInt();
                int a2=scanner.nextInt();
                int a3=scanner.nextInt();
                scanner.nextLine();
                sekil=new Ucgen("Ucgenin Cevresi :", a1, a2, a3);
                sekil.alanHesapla();;
            }else if(SekilTuru.equals("3")){
                System.out.println("Dairenin Yaricapi :");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                sekil=new Daire("Dairenin Yaricapi :", yaricap);
                sekil.alanHesapla();
            }else if(SekilTuru.equals("4")){
                System.out.println("Diktorgenin Kenarlari :");
                int uzunK=scanner.nextInt();
                int kisaK=scanner.nextInt();
                scanner.nextLine();
                sekil=new Dikdortgen("Diktortgenin cevresi :",uzunK,kisaK);
                sekil.alanHesapla();
            }else{
                System.out.println("Secin yapmadiniz veya yanlis secim yaptiniz.");
            }
        }
    }
}
