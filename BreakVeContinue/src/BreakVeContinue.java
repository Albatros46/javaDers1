
import java.util.Scanner;


public class BreakVeContinue {
    public static void main(String[] args){
//       int i=0;
//		while(i<20) { //i 20den küçük olduğu sürecek ekrana degeri yazdır
//			if(i==10) { //eğer i 10 a eşit olursa döngü dursun
//				break;
//			}
//			System.out.println("i="+i); //i 20 den küçük olduğu sürece ekrana degeri yazdır
//			i++;
//		} 
// Break döngü nerede kesilmesini istiyorsak orada kullanıyoruz 
// continue döngü içerisinde contunue yazıldığı yerden sonraki satıra geçmeden döngü başa dönüp çalışacaktır.
// contunue bazen kısır döngüye girme durumlarından kaçınmalıyız.
    Scanner scanner=new Scanner(System.in);
         while(true){
             System.out.println("Bir Tam Sayı Giriniz :");
             int islem=scanner.nextInt();
             
             if (islem==-1) {
                 System.out.println("Döngüden Çıkılıyor...");
                 break;
             }
             System.out.println("İşlem ="+islem);
        }
        for (int j = 0; j < 10; j++) {
            if (j==3 || j==5) { //Eğer j değeri 3 veya 5 e eşit olursa başa dön
                continue;
            }
            System.out.println("j = "+j);
        }
    }
}
