
public class Main {
    public static void main(String[] args) {
	//Polimorphisim = bir nesnenin birden fazla nesne gibi davranmasıdir.
        //bir java dosyasının içine birden fazla class yazılabilir.
        //public ile yazacak olursak başta yazdığımız class ile aynı isim olalıdır.
        //Ogrenci adında ana class oluştrruldu diğer 3 class ogrenci class dan bilgileri miras aldı 
        //ogrenci class daki not metodunu diğer classlar kendi içinde override ettik
        // Ogrenci objesi birden fazla obje yerine kullanıldı. bu yöntem polimorphism olarak adlandırılır
        
        Ogrenci ogrenci1=new YazilimOgrencisi("Ahmet"," Akcadag");
        System.out.println(ogrenci1.Not());
        Ogrenci ogrenci2=new ZiraatOgrenci("Cuma"," Akcadag");
        System.out.println(ogrenci2.Not());
        Ogrenci ogrenci3=new KimyaOgrenci("HAsan"," Kamalak");
        System.out.println(ogrenci3.Not());
    }
   
}
 class Ogrenci{ //ogrenci.java dosyası oluşturmak yerine burada class oluşturduk
        private String ad;
        private String soyad;

        public Ogrenci(String ad, String soyad) {
            this.ad = ad;
            this.soyad = soyad;
        }

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getSoyad() {
            return soyad;
        }

        public void setSoyad(String soyad) {
            this.soyad = soyad;
        }
        public String Not(){
            return "Not Durumu Fena değil...";
        }
    }
class YazilimOgrencisi extends Ogrenci{
    //normal java dosyasında yaptığımız gibi YAzilimogrenci class ı Ogrenci class dan  bilgileri miras aldı
    public YazilimOgrencisi(String ad, String soyad) {
        super(ad, soyad);
    }

    @Override
    public String Not() {
        return this.getAd()+" "+this.getSoyad()+" notları çok iyi"; //ogrenci class daki not class ı overrride edilerek burada kullanılacak.
    }
    
}
class ZiraatOgrenci extends Ogrenci{

    public ZiraatOgrenci(String ad, String soyad) {
        super(ad, soyad);
    }

    @Override
    public String Not() {
        return this.getAd()+" "+this.getSoyad()+" Bitkileri Kurttu"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class KimyaOgrenci extends Ogrenci{

    public KimyaOgrenci(String ad, String soyad) {
        super(ad, soyad);
    }

    @Override
    public String Not() {
        return this.getAd()+" "+this.getSoyad()+" Temizlikte Bir Numara"; //To change body of generated methods, choose Tools | Templates.
    }
    
}