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
public class Hemsire extends Kisi{
    private String alan;
    public Hemsire(int id, String AdSoyad, String CepTlf,String alan) {
        super(id, AdSoyad, CepTlf);
        this.alan=alan;
    }
    public void BilgileriGoster(){
        super.BilgiGoster();
        System.out.println("Hemsirenin Alanı :"+alan);
    }
    public void IgneYap(){
        System.out.println(this.getAdSoyad()+" tarafından iğne yapıldı.");
    }
}
