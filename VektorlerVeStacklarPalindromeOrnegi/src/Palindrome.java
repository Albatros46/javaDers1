
import java.util.Scanner;
import java.util.Stack;


public class Palindrome {
    public static void main(String[] args){
    /*Stack kullanilarak bir cumlenin Palindrome olup olmadigini kontrol edecegiz.
        Palindrome : Bir cumlenin bastan ve sondan okunusu ayni olan cumle/kelime
        Ornegin : KASAYLABALYASAK-KASAYLA BALYASAK
    */
    Scanner scanner=new Scanner(System.in);//Disaridan cumle girilmesini istiyoruz.
        System.out.println("Cumle Giriniz : ");
    String cumle=scanner.nextLine();
    Stack<Character> karakter=new Stack<Character>();//KAraktr tipinde Stack tanimladik
        for (int i = 0; i < cumle.length()/2; i++){
            karakter.push(cumle.charAt(i));
     //Disaridan girilen cumlenin karakter sayisini dondurduk ve karakterin yarisina kadari stack a aktardik.
     
        }
        if (isPalindrome(cumle, karakter)) {
            System.out.println("Bu cumle PALINDROME dur..."); 
        }
        else{
            System.out.println("Bu cumle Palindrome DEGILDIR!...");
        }
    }
    
    public static boolean isPalindrome(String cumle, Stack<Character> karakter){
        /*Palindrome olup olmadigini kontrol edecegimiz metod
         * Cumlenin karakter sayisini ikiye bolup 1 fazlasini almamizin sebebi
         * 0 inci indeks den basladigi icin yapiyoruz 
         * Eger cumlenin karakteri stack de tanimlanan en son giren karatere esit degise FALSE
         * esit ise TRUE dege donecektir.
    	*/
       for(int i=(cumle.length()/2)+1;i<cumle.length();i++){
           if (cumle.charAt(i)!=karakter.pop()) {
               return false;
           }
       }
       return true;    
    }
}
