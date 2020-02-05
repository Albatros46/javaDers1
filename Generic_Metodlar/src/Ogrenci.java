
public class Ogrenci {
    private String isim;
    private int numarasi;

    public Ogrenci(String isim, int numarasi) {
        this.isim = isim;
        this.numarasi = numarasi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }

    @Override
    public String toString() {
        return "Isim :"+isim+" Numarasi :"+numarasi;
    }
    
}
