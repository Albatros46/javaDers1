
import java.util.Scanner;


public class main {
    public static void main(String[] args){
       // Kendi exception class yazmak icin classi mizi bir tane ust sinif exceptiondan uretmek zorundayiz.
       // O yuzden InvalidAgeException adinda bir class olusturduk
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen Yasinizi Giriniz : ");
        int yas=scanner.nextInt();
        try{
            yasKontrol(yas);
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }
        
    }
    
    public static void yasKontrol(int yas){
         if (yas<18) {
            throw new InvalidAgeException("18 yasindan kucukler icin sakincali!");
        }else{
             System.out.println("Mekana Hosgeldiniz");
         }
  
    }
}
