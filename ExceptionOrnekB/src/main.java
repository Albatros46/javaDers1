
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("�ki say� da �ok b�y�k. L�tfen daha k���k say�lar girin....");

    }
    
    
}

public class main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 i�lem yapan bir hesap makinesi tasarlamaya �al���n.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama ��lemi\n"
                          +"2. ��karma ��lemi\n"
                          +"3. �arpma ��lemi\n"
                          +"4. B�lme ��lemi";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("��lemi Se�iniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        try {
        switch(islem){
            case "1":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                System.out.println("Girilen De�erlerin Toplamlar� : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                System.out.println("Girilen De�erlerin Farklar� : " + (a-b));
                break;
            case "3":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                if (a > 10000 && b > 10000) {
                //eger a ve b sayilari 10000 den buyuk ise CarpmaException hatasi olusacagindan
                    throw new CarpmaException();
                    
                }
                System.out.println("Girilen De�erlerin �arp�mlar� : " + (a * b));
                break;
            case "4":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                System.out.println("Girilen De�erlerin B�l�m� : " + (a / b));
                break;
            default:
                System.out.println("Ge�ersiz ��lem");
        }
        }
        catch (ArithmeticException e) {
        	//Bir sayi sifira bolunmek istenirse ArithmeticException hatasi olusacak
            System.out.println("Bir say� 0'a b�l�nemez...");
        }
        catch(InputMismatchException e) {
        	//Eger sayisal deger disinda metinsel deger girilirse InputMismatchException hatasi olussun
            System.out.println("L�tfen Inputlar� Do�ru Formatta Girin...");
        } catch (CarpmaException ex) {
            ex.printStackTrace();
            
        }
    }
}
