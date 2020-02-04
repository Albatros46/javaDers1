
import java.util.Scanner;


public class Vec {
    private int j;
    private int k;
    private int i;
    private String isim;
    
    public Vec(String isim){
        this.isim=isim;
        Scanner scanner=new Scanner(System.in);
        System.out.println(isim+" i-j-k degerini giriniz :");
        System.out.println("i degeri :");
        this.i=scanner.nextInt(); scanner.nextLine();
        System.out.println("j degeri :");
        this.j=scanner.nextInt(); scanner.nextLine();
        System.out.println("k degeri :");
        this.k=scanner.nextInt(); scanner.nextLine();
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
