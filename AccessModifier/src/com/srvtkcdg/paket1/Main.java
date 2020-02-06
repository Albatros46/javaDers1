
package com.srvtkcdg.paket1;
import com.srvtkcdg.paket2.*; //Paket2 nin icindeki hersey dahil olsun

/* Access Modifier-Erisim Belirleyiciler
   Erisim belirleyiciler iki duzeyde erisim belirlerler 
        1-Sinif duzeyde erisim belirleyiciler
            public : bir class public tanimlanmis ise paketin icinden veya paketin disindan tum class lar ile 
                    erisim saglar.
            default: default erisim belirleyici kullanmamak anlamina gelir. eger bir class hic bir erisim belirleyici
                    kullanilmadan yazilmis ise bu class'a sadece paketin icindeki (ayni pakettekiler) erisebilir.
                    paketin disindakilar erisim saglayamaz.
            ****protected ve private kesinlikle class icinde kullanilmaz.
    Metod ve Ozellik Duzeyde Erisim Belirleyiciler
        1-public : eger bir metod veya bir ozellik(class member veya alan) olarak tanimlanmis ise bu alana paketin
            icindeki veya disindaki tum class lar erisir.
        2-default :  eger bir metod veya ozellik (class member veya alan) default olarak tanimlanmissa  bu alana sadece
            kendi paketinin icindekiler erisebilir.
        3-protected : eger bir metod veya ozellik (class member veya alan) protected tanimlanmissa bu alana ayni 
            paketin icinde diger classlar tarafindan erisebilir. paketin disindaki classlar ise sadece bu alanin 
            bulundugu classin bir alt class i ise erisebilir.
        4-private : eger bir alan private olarak tanimlanmissa bu alana sadece kendi classi erisebilir.
        
*/
public class Main {
    Araba araba1=new Araba();//Araba.java public yazildigi icin direkt erisim sagliyoruz.
    
    public static void main(String[] args) {
		

    }
}
