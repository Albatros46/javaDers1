
public class Marka extends Araba{
    private String MarkaAdi;
    
    public Marka(String renk, String model, int kapi, double fiyat,String yakitturu,String MarkaAdi){
        super(renk,model,kapi,fiyat,yakitturu);
        this.MarkaAdi=MarkaAdi;
    }
    public void BilgiGetir(){
        System.out.println("Renk :"+this.getRenk());
        System.out.println("Model :"+this.getModel());
        System.out.println("Kapı :"+this.getKapi());
        System.out.println("Fiyat :"+this.getFiyat());
        System.out.println("Yakıt :"+this.getYakitturu());
        super.BilgiGetir(MarkaAdi, MarkaAdi, 0, 0, MarkaAdi);
        System.out.println("Marka Adi :"+this.MarkaAdi);
        
    }
    public void Hızı(int hız){
        System.out.println("km hızla gidiyor..");
        super.MaxHiz(hız);
    }
    /**
     * @return the MarkaAdi
     */
    public String getMarkaAdi() {
        return MarkaAdi;
    }

    /**
     * @param MarkaAdi the MarkaAdi to set
     */
    public void setMarkaAdi(String MarkaAdi) {
        this.MarkaAdi = MarkaAdi;
    }
}
