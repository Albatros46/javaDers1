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
public class Hasta extends Kisi {
    private String hastalık;
    public Hasta(int id, String AdSoyad, String CepTlf,String Hastalık) {
        super(id, AdSoyad, CepTlf);
        this.hastalık=hastalık;
    }
    public void BilgileriGoster(){
        super.BilgiGoster();
        System.out.println("Hastalık :"+hastalık);
    }
    public void ilacVer(){
        System.out.println(this.getAdSoyad()+" hastanın iaclı verildi.");
    }
}
