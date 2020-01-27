
public class Spor {
    private int Mekik;
    private int Sinav;
    private int Barfiks;

    public Spor(int Mekik, int Sinav, int Barfiks) {
        this.Mekik = Mekik;
        this.Sinav = Sinav;
        this.Barfiks = Barfiks;
    }

    /**
     * @return the Mekik
     */
    public int getMekik() {
        return Mekik;
    }

    /**
     * @param Mekik the Mekik to set
     */
    public void setMekik(int Mekik) {
        this.Mekik = Mekik;
    }

    /**
     * @return the Sinav
     */
    public int getSinav() {
        return Sinav;
    }

    /**
     * @param Sinav the Sinav to set
     */
    public void setSinav(int Sinav) {
        this.Sinav = Sinav;
    }

    /**
     * @return the Barfiks
     */
    public int getBarfiks() {
        return Barfiks;
    }

    /**
     * @param Barfiks the Barfiks to set
     */
    public void setBarfiks(int Barfiks) {
        this.Barfiks = Barfiks;
    }
    
    public void hareketYap(String hareketTuru, int sayisi){
        if (hareketTuru.equals("Şınav")) {
            sinavYap(sayisi);
        }else if (hareketTuru.equals("Mekik")) {
            mekikYap(sayisi);
        }else if (hareketTuru.equals("Barfiks")) {
            barfiksYap(sayisi);
        }else{
            System.out.println("Hareket türü seçmediniz!");
        }
    }
    public void sinavYap(int sayi){
        if (Sinav==0) {
            System.out.println("Yapacak Şınav Kalmadı.");
        }
        if (Sinav-sayi<0) {
            System.out.println("Hdeflediğin Şınav Sayısını Geçsin Tebrikler....");
            Sinav=0;
            System.out.println("Kalan Şınav Sayısı :"+Sinav);
        }else{
            Sinav-=sayi;
            System.out.println("Kalan Şınav Sayısı :"+Sinav);
        }
    }
    public void mekikYap(int sayi){
         if (Mekik==0) {
            System.out.println("Yapacak Mekik Kalmadı.");
        }
        if (Mekik-sayi<0) {
            System.out.println("Hdeflediğin Mekik Sayısını Geçsin Tebrikler....");
            Mekik=0;
            System.out.println("Kalan Mekik Sayısı :"+Mekik);
        }else{
            Mekik-=sayi;
            System.out.println("Kalan Mekik Sayısı :"+Mekik);
        }
    }
    public void barfiksYap(int sayi){
            if (Barfiks==0) {
            System.out.println("Yapacak Barfiks Kalmadı.");
        }
        if (Barfiks-sayi<0) {
            System.out.println("Hdeflediğin Barfiks Sayısını Geçsin Tebrikler....");
            Barfiks=0;
            System.out.println("Kalan Barfiks Sayısı :"+Barfiks);
        }else{
            Barfiks-=sayi;
            System.out.println("Kalan Barfiks Sayısı :"+Barfiks);
        }
    }
    public boolean SporBittiMi(){
     return (Mekik==0) && (Sinav==0) &&(Barfiks==0);// burası sağlanıyorsa true deger dönecek
    }
}
