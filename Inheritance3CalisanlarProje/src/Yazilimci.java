
public class Yazilimci extends Calisan {
    private String diller;
    //Yazilimci class, calisan class dan bazı özellikleri miras aldı.
    //Genellikle ortak özellikler üst sınıf olarak tanımlanır ve alt sınıflara Inheritance edilir.
    
    public Yazilimci(String Ad, String Soyad, int Id,String diller) {
        super(Ad, Soyad, Id);
        this.diller=diller;
    }
    public void FormatAt(String isletimSistemi){
        System.out.println(getAd()+" "+isletimSistemi+" yüklüyor ");
    }

    @Override
    public void BilgileriGoster() { //calisan class daki metod override yapıldı.
        super.BilgileriGoster(); 
        System.out.println("Yazılımcının Bildiği Diller"+diller);
    }
}
