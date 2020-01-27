
public class Account {
    private String hesapNu;
    private String isim;
    private String eposta;
    private String CepTlf;
    private double bakiye;

    /**
     * @return the hesapNu
     */
    public Account (){
       // System.out.println("Normal Constructor");
       //test.java dan parametre gönderilmeden(boş olarak) çağıdıldğında varsayılan değer olarak bu blok çalışacak
//        this.hesapNu="Bilgi Yok";
//        this.isim="Bilgi Yok";
//        this.eposta="Bilgi Yok"; // bu yöntem dışında ise
//        this.CepTlf="Bilgi Yok";
//        this.bakiye=0.0;
          // yukarıdaki yöntem dışıda daha kullanım olan alt satırdaki yöntem ile parametreli account constructor unu kullanabiliriz.
          this("Bilgi Yok","Bilgi Yok","Bilgi Yok","Bilgi Yok",0.0);
    }
    
    public Account(String hesapNu, String isim, String eposta,String CepTlf, double bakiye){
        //Parametreli constructor umuz. Yukarıda tanımladığımız degerler ile parametreleri eşledik.
        this.hesapNu=hesapNu;
        this.isim=isim;
        this.eposta=eposta;
        this.CepTlf=CepTlf;
        this.bakiye=bakiye;
    }
    public void BilgileriGoster(){
        System.out.println("Hesap Nu. :"+this.hesapNu);
        System.out.println("İsim      :"+this.isim);
        System.out.println("E-Posta   :"+this.eposta);
        System.out.println("Cep Tlf   :"+this.CepTlf);
        System.out.println("Bakiye    :"+this.bakiye);
    }
    
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
}
