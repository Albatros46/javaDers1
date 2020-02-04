
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Matematik ve Fizik Programina Hosgeldiniz...");
    String islemler="Islemler\n"
		 + "1-Dairenin Alanini Hesapla\n"
		 + "2-Karenin Alanini Hesapla\n"
		 + "3-Dikdortgenin Alanini Hesapla\n"
		 + "4-Ucgenin Cevresini Hesapla\n"
                 + "5-Iki vektorun Ic Carpim Hesapla\n"
		 + "Cikis icin ( q ) basiniz";
        
        while(true){
        System.out.println(islemler);
        String islem = scanner.nextLine();
        System.out.println("Islem Seciniz :");
            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor...");
                break;
            }else if(islem.equals("1")){
                System.out.println("Dairenin Yaricapi :");
                int yaricapi=scanner.nextInt();
                scanner.nextLine();
                Program.Matematik.daire_alan(yaricapi);
            }else if(islem.equals("2")){
                System.out.println("Karenin Kenari :");
                int kenar=scanner.nextInt();
                scanner.nextLine();
                Program.Matematik.karenin_alani(kenar);
            }else if(islem.equals("3")){
                System.out.println("Dikdortgenin Alani :");
                int uzun=scanner.nextInt(); 
                scanner.nextLine();
                int kisa=scanner.nextInt();
                scanner.nextLine();
                Program.Matematik.dikdortgenin_alani(uzun, kisa);
            }else if(islem.equals("4")){
                System.out.println("Ucgenin Cevresi :");
                int a=scanner.nextInt(); int b=scanner.nextInt(); int c=scanner.nextInt();
                scanner.nextLine();
                Program.Matematik.ucgen_cevresi(a, b, c);
            }else if(islem.equals("5")){
                Vec vec1=new Vec("Vektor 1 ");
                Vec vec2=new Vec("Vektor 2 ");
                Program.Fizik.icCarpim(vec1, vec2);
            }else{
                System.out.println("Secim Yapmadiniz.");
            }
        }     
    }
    
}
