
public class Yonetici extends Calisan{
    private int sorumlu_sayisi;

    public Yonetici(String Ad, String Soyad, int Id,int sorumlu_sayisi) {
        super(Ad, Soyad, Id);
        this.sorumlu_sayisi=sorumlu_sayisi;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster(); 
        System.out.println("Yöneticinin Sorumlu Olduğu "+sorumlu_sayisi+" kişidir.");
    }
    public void ZamYap(int zam){
        System.out.println(getAd()+" çalışanlara "+zam+" kadar Zam yaptı.");
    }
}
