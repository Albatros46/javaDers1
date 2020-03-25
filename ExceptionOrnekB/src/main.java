
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Ýki sayý da çok büyük. Lütfen daha küçük sayýlar girin....");

    }
    
    
}

public class main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 iþlem yapan bir hesap makinesi tasarlamaya çalýþýn.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama Ýþlemi\n"
                          +"2. Çýkarma Ýþlemi\n"
                          +"3. Çarpma Ýþlemi\n"
                          +"4. Bölme Ýþlemi";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("Ýþlemi Seçiniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        try {
        switch(islem){
            case "1":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                System.out.println("Girilen Deðerlerin Toplamlarý : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                System.out.println("Girilen Deðerlerin Farklarý : " + (a-b));
                break;
            case "3":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                if (a > 10000 && b > 10000) {
                //eger a ve b sayilari 10000 den buyuk ise CarpmaException hatasi olusacagindan
                    throw new CarpmaException();
                    
                }
                System.out.println("Girilen Deðerlerin Çarpýmlarý : " + (a * b));
                break;
            case "4":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                System.out.println("Girilen Deðerlerin Bölümü : " + (a / b));
                break;
            default:
                System.out.println("Geçersiz Ýþlem");
        }
        }
        catch (ArithmeticException e) {
        	//Bir sayi sifira bolunmek istenirse ArithmeticException hatasi olusacak
            System.out.println("Bir sayý 0'a bölünemez...");
        }
        catch(InputMismatchException e) {
        	//Eger sayisal deger disinda metinsel deger girilirse InputMismatchException hatasi olussun
            System.out.println("Lütfen Inputlarý Doðru Formatta Girin...");
        } catch (CarpmaException ex) {
            ex.printStackTrace();
            
        }
    }
}
