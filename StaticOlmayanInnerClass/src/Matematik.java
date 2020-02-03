
import java.util.Scanner;


public class Matematik {
    private double pi=Math.PI;
    
    public class Faktoriyel{//Inner Class
        public void faktoriyel(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Bir Sayi Giriniz :");
            int sayi=scanner.nextInt();
            int fakt=1;
            for (int i = 0; i <= sayi; i++) {
                fakt*=i;
            }
            System.out.println("Faktoriyel :"+fakt);
        }
    }
    
    public class Asal{//Inner Class
        public boolean asalMi(int sayi){
            int i=2;
            while(i<sayi){
                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    
    public class Alan{//Inner Class
        public void daire_alan(int yaricap){
            System.out.println("Dairenin Alani :"+(yaricap*yaricap*pi));
        }
    }
}
