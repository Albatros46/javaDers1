/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritance4hastane;

/**
 *
 * @author KCDG
 */
public class Kisi {
    private int id;
    private String AdSoyad;
    private String CepTlf;
    
    public void BilgiGoster(){
        System.out.println("------Kişi Bilgileri------");
        System.out.println("Kişi Id    :"+id);
        System.out.println("Adı Soyadı :"+AdSoyad);
        System.out.println("Cep Tlf    :"+CepTlf);
    }

    public Kisi(int id, String AdSoyad, String CepTlf) {
        this.id = id;
        this.AdSoyad = AdSoyad;
        this.CepTlf = CepTlf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    public String getCepTlf() {
        return CepTlf;
    }

    public void setCepTlf(String CepTlf) {
        this.CepTlf = CepTlf;
    }
}
