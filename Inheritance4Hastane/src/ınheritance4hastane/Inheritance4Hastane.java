/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritance4hastane;

import java.util.Scanner;

/**
 *
 * @author KCDG
 */
public class Inheritance4Hastane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        String islemler="İşlem Seçiniz..\n"
                +"1-Doktor\n"
                +"2-Hemşire\n"
                +"3-Hasta\n"
                +"4-Çıkış için( q ) basınız.";
        System.out.println("-------HOŞGELDİNİZ-------");
        System.out.println(islemler);
        System.out.println("-------------------------");
        while(true){
            System.out.println("İşlem Seçinic :");
            String islem=scanner.nextLine();
            if (islem.equals("q")) {
                break;
            }else if (islem.equals("1")) {
                Doktor doktor=new Doktor(1," Servet "," 536957461 "," Nöroloji");
                String dr_islemler="İşlemler\n"
                        +"1-Ameliyat Et\n"
                        +"2-Bilgileri Göster\n"
                        +"Çıkış için (q) basın\n";
                System.out.println(dr_islemler);
                
                while(true){
                    String drislemler=scanner.nextLine();
                    if (drislemler.equals("q")) {
                        break;
                    }else if(drislemler.equals("1")){
                        System.out.println("Hasta Ameliyat Ediliyor..");
                        doktor.AmeliyatEt();
                    }else if(drislemler.equals("2")){
                        doktor.BilgiGoster();
                    }else{
                        System.out.println("Geçersiz İşlem...");
                        break;
                    }
                }
            }
            if (islem.equals("q")) {
                break;
            }else if (islem.equals("2")) {
                Hemsire hemsire=new Hemsire(10," Rukiye "," 57461 "," Anestezi");
                String hemsire_islemler="İşlemler\n"
                        +"1-İğne Yapt\n"
                        +"2-Bilgileri Göster\n"
                        +"Çıkış için (q) basın\n";
                System.out.println(hemsire_islemler);
                while(true){
                    String hemIslemler=scanner.nextLine();
                    if (hemIslemler.equals("q")) {
                        break;
                    }else if(hemIslemler.equals("1")){
                        System.out.println("Hasta iğne yapıldı");
                        hemsire.IgneYap();
                    }else if(hemIslemler.equals("2")){
                        hemsire.BilgiGoster();
                    }else{
                        System.out.println("Geçersiz İşlem...");
                        break;
                    }
                }
            }
             if (islem.equals("q")) {
                break;
            }else if (islem.equals("3")) {
                Hasta hasta=new Hasta(1010," Cuma Ali "," 965457461 "," Göğüs Hastalıkları");
                String Hasta_islemler="İşlemler\n"
                        +"1-İlaç Al\n"
                        +"2-Bilgileri Göster\n"
                        +"Çıkış için (q) basın\n";
                System.out.println(Hasta_islemler);
                while(true){
                    String Has_Islemler=scanner.nextLine();
                    if (hasta.equals("q")) {
                        break;
                    }else if(Has_Islemler.equals("1")){
                        System.out.println("Hasta ilacını aldı");
                        hasta.ilacVer();
                    }else if(Has_Islemler.equals("2")){
                        hasta.BilgiGoster();
                    }else{
                        System.out.println("Geçersiz İşlem...");
                        break;
                    }
                }
            }
        }
    }
    
}
