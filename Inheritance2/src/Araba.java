
public class Araba {
   
    private String renk;
    private String model;
    private int kapi;
    private double fiyat;
    private String yakitturu;
    
    public Araba( String renk, String model, int kapi, double fiyat,String yakitturu) {
       
        this.renk = renk;
        this.model = model;
        this.kapi = kapi;
        this.fiyat = fiyat;
        this.yakitturu = yakitturu;
    }
    /**
     * @return the renk
     */
    public void BilgiGetir(String renk, String model, int kapi, double fiyat,String yakitturu){
        System.out.println("Renk :"+this.renk);
        System.out.println("Model :"+this.model);
        System.out.println("Kapı :"+this.kapi);
        System.out.println("Fiyat :"+this.fiyat);
        System.out.println("Yakıt :"+this.yakitturu);
        
    }
    public void ArabaYıka(){
        System.out.println("Arabanın iç ve dış temizliği/bakımı yapıldı.");
    }
    public void MaxHiz(int hiz){
        System.out.println("Araba maksimum "+ hiz +" km hıza çıkabilmektedir. ");
    }
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the kapi
     */
    public int getKapi() {
        return kapi;
    }

    /**
     * @param kapi the kapi to set
     */
    public void setKapi(int kapi) {
        this.kapi = kapi;
    }

    /**
     * @return the fiyat
     */
    public double getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    /**
     * @return the yakitturu
     */
    public String getYakitturu() {
        return yakitturu;
    }

    /**
     * @param yakitturu the yakitturu to set
     */
    public void setYakitturu(String yakitturu) {
        this.yakitturu = yakitturu;
    }
}
