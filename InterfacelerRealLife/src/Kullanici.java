
public class Kullanici {
    private int Id;
    private String KullaniciAdi;
    private int Yasi;

    public Kullanici(int Id, String KullaniciAdi, int Yasi) {
        this.Id = Id;
        this.KullaniciAdi = KullaniciAdi;
        this.Yasi = Yasi;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public int getYasi() {
        return Yasi;
    }

    public void setYasi(int Yasi) {
        this.Yasi = Yasi;
    }
}
