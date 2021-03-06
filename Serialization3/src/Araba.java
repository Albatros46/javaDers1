
import java.io.Serializable;
/*
Dosya boyutumuz bazen artabilir. Oyle durumlarda bazi ozellikleri serilestiemek istemeyebiliriz.
Ornegin renk ozelligini gosterip bos yere dosya boyutunu artirmak istemiyorsak
private transient String  renk; �eklinde kullanim ile yapabiliriz.
Integer degerde transient kullanilirsa karsimiza 0 yazili olarak cikar
String degerde ise null deger yazdiracaktir.
*/

public class Araba implements Serializable {
    private String marka;
    private String model;
    private transient String  renk;
    private double fiyat;
    private static int araba_sayisi=0;
    /*static alanimiz objeye ozgu oldugu icin dosyaya yazmayacaktir.
    bu sekilde kullanim ile de Serializable etmeden kullanmis oluyoruz
     */
    public static int getAraba_sayisi() {
		return araba_sayisi;
	}

	public static void setAraba_sayisi(int araba_sayisi) {
		Araba.araba_sayisi = araba_sayisi;
	}

	public Araba(String marka, String model, String renk, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        String ruhsat="Markasi: "+marka
                      +"\nModel : "+model
                      +"\nRenk  : "+renk
                      +"\nFiyat :"+fiyat;
        return ruhsat;                    
        //return "Araba{" + "marka=" + marka + ", model=" + model + ", renk=" + renk + ", fiyat=" + fiyat + '}';
    }
    
}
