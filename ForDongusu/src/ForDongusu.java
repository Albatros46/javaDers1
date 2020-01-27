
public class ForDongusu {
    public static void Main(String[] args){
    /* for (başlatma;koşul; artırma veya azalma işlemi) {
        koşul gerçekleştiği sürece çalışacak kısım
        }
    */
        int j;
        for (j = 0; j < 10; j++) {
            System.out.print("j="+j);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("i="+i);
        }
        for (int a= 10; a >= 10; a--) {
            System.out.print("a="+a);
        }
        int b=5;
        for (;b<5;b++) {
            System.out.print("Java Dersi...");
        }
        int c=0; int d=10;
        for(;c>10 && d<10; c++,d--){
            System.out.print("c="+c);
            System.out.print("d="+d);
        }
    }
}
