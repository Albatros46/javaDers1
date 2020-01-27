
public class Calisan {//Superclass veya Baseclass(Temel-Ana sınıf) çalışanların ortan bilgileri burdan yönetici.java ya miras olarak gönderilecek
    private String isim;
    private String departman;
    private double maas;

    public Calisan(String isim, String departman, double maas) {//calisan parametreli constructor
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }
    
    public void Calis(){
        System.out.println("Personel Çalışıyor...");
    }
    public void BilgiGetir(){
        System.out.println("İsim      :"+this.isim);//bu şekilde de kullanılır
        System.out.println("Departman :"+departman);//bu şekilde de kullanılır
        System.out.println("Maaş      :"+maas);
    }
    public void Departman(String yeniDepartman){
        System.out.println("Departman Değiştiriliyor...");
        this.departman=yeniDepartman;
        System.out.println("Yeni Departman   :"+this.departman);
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }

    /**
     * @return the maas
     */
    public double getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(double maas) {
        this.maas = maas;
    }
}
