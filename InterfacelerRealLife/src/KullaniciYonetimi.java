
public class KullaniciYonetimi {
    private IKullaniciKontrol iKullaniciKontrol;

    public KullaniciYonetimi(IKullaniciKontrol iKullaniciKontrol) {
        this.iKullaniciKontrol = iKullaniciKontrol;
    }
    
    public void Giris(Kullanici kullanici){
        if (iKullaniciKontrol.Kullanici(kullanici)) {
            System.out.println("Kullanici Kayit Oldu : "+kullanici.getKullaniciAdi());
        }else{
            System.out.println("Kullanici Kayit Olamadi..."); 
        }
          
        
    }
}
