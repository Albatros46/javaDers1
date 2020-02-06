package com.srvtkcdg.paket2;

public class Araba {
    public String Marka="Toyota";
    public String Renk="Kar Beyazi";
    public String Model="2020 Toyota Avalon";
    
class Akaryakit{//Default tanimlanmis bir class sadece ayni clas ve ayni pakettekiler erisir.
    public int YakitId=1;
    protected String YakitAdi="Benzin";
    private double AlisFiyati=1.80;//Alan sadece kendi class icinde kullanilir.
    
    void fiyat(){
        System.out.println(AlisFiyati);
    }
    
    
}
    public static void main(String[] args) {
		
        
    }

}
