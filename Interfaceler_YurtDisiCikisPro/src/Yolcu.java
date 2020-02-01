
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{
    
    private int YurtDisiHarciKontrolu;
    private boolean siyasiYasakKontrolu;
    private boolean vizeDurumuKontrolu;

    public Yolcu() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yurt Disi Harc Bedeli :");
        this.YurtDisiHarciKontrolu = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Herhangi bir siyasi yasaginiz var mi?(e/h) :");
        String cevap=scanner.nextLine();
        if (cevap.equals("e")) {
            this.siyasiYasakKontrolu=true;
        }else if (cevap.equals("h")) {
            this.siyasiYasakKontrolu=false;
        }else
        {
            System.out.println("Cevap Vermediniz. e/h ");
        }
        
        System.out.println("Vizenin bulunuyor mu? e/h :");
        String cevap2=scanner.nextLine();
        
        if (cevap2.equals("e")) {
            this.vizeDurumuKontrolu=true;
        }else if (cevap2.equals("h")) {
            this.vizeDurumuKontrolu=false;
        }else{
            System.out.println("Cevap Vermediniz. e/h ");
        }
    }

    @Override
    public boolean YurDisiHarci() {
        if (YurtDisiHarciKontrolu<50) {
            System.out.println("Lutfen Yurtdisi Harc Bedelini Tam Yatiriniz! ");
            return false;
        } else{
            System.out.println("Yurtdisi Harc Bedeli Odendi. :");
            return true;
        }
                
    }

    @Override
    public boolean SiyasiYasak() {
        if (this.siyasiYasakKontrolu==true) {
            System.out.println("Siyasi yasak VAR. Yurtdisine Cikamazsiniz.");
            return false;
        }else{
            System.out.println("Siyasi yasak YOK.");
            return true;
        }
    }

    @Override
    public boolean VizeDurumu() {
        if (this.vizeDurumuKontrolu==true) {
            System.out.println("Vize islemleri TAMAM");
            return true;
        }else{
            System.out.println("Gideceginiz Ulkeye Vizenin Bulunmuyor");
            return false;
        }
        
    }
    
    
}
