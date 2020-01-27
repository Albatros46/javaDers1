
public class Hesap {
   private String KullaniciAdi;
   private String Parola;
   private double Bakiye;

    public Hesap(String KullaniciAdi, String Parola, double Bakiye) {
        this.KullaniciAdi = KullaniciAdi;
        this.Parola = Parola;
        this.Bakiye = Bakiye;
    }

    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }

    public double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }
    
    public void ParaYatir(double tutar){
        this.Bakiye+=tutar;
       // Bakiye+=tutar; // bu yöntem de kullanılabilir
        System.out.println("Yeni Bakiyeniz :"+Bakiye);
    }
    
    public void ParaCek(double cekilen){
        if (Bakiye-cekilen<0) {
            System.out.println("Yetersiz Bakiye..."+Bakiye);
        }else{
            Bakiye-=cekilen;
            System.out.println("Yeni Bakiyeniz :"+Bakiye);
        }
    }
}
