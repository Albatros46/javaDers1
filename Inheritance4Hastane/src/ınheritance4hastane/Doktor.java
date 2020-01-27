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
public class Doktor extends Kisi{
    private String alan;

    public Doktor(int id, String AdSoyad, String CepTlf,String alan) {
        super(id, AdSoyad, CepTlf);
        this.alan=alan;
    }
    
    public void BilgiGoster(){
        super.BilgiGoster();
        System.out.println("Uzmanlık Alanı :"+alan);
    }
    public void AmeliyatEt(){
        System.out.println(this.getAdSoyad()+"Ameliyat Başarılı geçti.");
    }
}
