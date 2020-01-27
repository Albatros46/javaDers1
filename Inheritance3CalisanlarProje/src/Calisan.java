
public class Calisan {
    //Üst - Ana class= Yazılımcı ve Yönetici class ları burdan veri çekecekler
    private String Ad;
    private String Soyad;
    private int Id;

    public Calisan(String Ad, String Soyad, int Id) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Id = Id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    public void BilgileriGoster(){
        System.out.println("----Çalışan Bilgileri----");
        System.out.println("Adı        :"+Ad);
        System.out.println("Soyadı     :"+Soyad);
        System.out.println("Çalışan Id :"+Id);
    }
}
