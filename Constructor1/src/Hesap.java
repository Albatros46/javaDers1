
public class Hesap {
    private String hesapNu;
    private String isim;
    private String eposta;
    private String CepTlf;
    private double bakiye;
    
    public void ParaYatır(double yatanMiktar){
        this.bakiye+=yatanMiktar; //bakiye+=yatanMiktar; // bu şekilde de kullalabilir
        System.out.println("Yeni Bakiyeniz :"+bakiye);
    }
    public Hesap(){//Contructor oluşturulurken kesinlikle class ismi ile aynı olmalıdır
        System.out.println("Kendi yazdığımız Constructor...");
    }
    
    public Hesap(String hesapNu, String isim, String eposta,String CepTlf, double bakiye){
    //Parametreli constructor umuz. Yukarıda tanımladığımız degerler ile parametreleri eşledik.
        this.hesapNu=hesapNu;
        this.isim=isim;
        this.eposta=eposta;
        this.CepTlf=CepTlf;
        this.bakiye=bakiye;
    }
    public void ParaÇekme(double cekilenMiktar){
        if (cekilenMiktar>=1500) {
            System.out.println("Bir günde 1500 TL den fazla para çekemezsiniz!");
        }
        if (bakiye-cekilenMiktar<0) {
            System.out.println("Yetersiz Bakiye...Güncel Bakiyeniz :"+bakiye);
        } else{
            bakiye-=cekilenMiktar;
            System.out.println("Yeni Bakiye :"+bakiye +"\n "+"Çekilen Miktar :"+ cekilenMiktar);
        }
    }
    /**
     * @return the hesapNu
     */
    public String getHesapNu() {
        return hesapNu;
    }

    /**
     * @param hesapNu the hesapNu to set
     */
    public void setHesapNu(String hesapNu) {
        this.hesapNu = hesapNu;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
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
     * @return the eposta
     */
    public String getEposta() {
        return eposta;
    }

    /**
     * @param eposta the eposta to set
     */
    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    /**
     * @return the CepTlf
     */
    public String getCepTlf() {
        return CepTlf;
    }

    /**
     * @param CepTlf the CepTlf to set
     */
    public void setCepTlf(String CepTlf) {
        this.CepTlf = CepTlf;
    }
}
