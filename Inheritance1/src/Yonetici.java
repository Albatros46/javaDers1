
public class Yonetici extends Calisan { //Subclass (alt sınıf) yönetici de bir çalışan olduğu için ortak bilgiler calisan.java dan miras alınacak
    //calisan class dan miras çekmek için extends yaptık
    //fakat kendi içinde metod oluşturmadan verilere erişim olmayacaktır.
    //calisan class da veri private tanımlandığından burda erişim sağlamak için
    //super kullanılarak calisan metodu üzerinden erişim sağlıyoruz.
    private int sorumlu_kisi;
    public  Yonetici(String isim, String departman, double maas,int sorumlu_kisi){
        
        super(isim, departman, maas);
        this.sorumlu_kisi=sorumlu_kisi;
        
    }
    public void zam_yap(double zam_mik){
        System.out.println("Çalışanlara "+zam_mik+"TL yapıldı...");
    }
    public void BilgiGetir(){
    //calisan class da BilgiGetir metodu bulunduğu için burada yaazarak override yaptık
    //ve miras alınan class dan o metod iptal edilmiş oldu
        System.out.println("İsim      :"+this.getIsim());//miras alınan class dan bilgi çekmek için getter ve setter kullanılır
        System.out.println("Departman :"+this.getDepartman());
        System.out.println("Maaş      :"+this.getMaas());
        
        System.out.println("Sorumlu Sayısı :"+this.sorumlu_kisi);
        
        super.BilgiGetir();
    }
}
