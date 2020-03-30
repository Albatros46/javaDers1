import java.io.Serializable;

public class Ogrenci implements Serializable {
    private static final long serialVersionUID = 2000;
    /*Eger buyuk projelerde calisiyorsak ayný isimde farklý server lerde class bulunuyor ve biz
     * bu class lari kullanmak istiyorsak ileride sikinti cikmamasi icin
     * class imiza serialVersionUID ile seri numara veririz. 
     * */
    private String isim;
    private int id;
    private String bolum;
    private String dersler;
    

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        
        String bilgiler =  "Öðrenci Ýsmi :" + isim +
                           "\nÖðrenci Numarasý : " + id +
                           "\nÖðrenci Bölüm : " + bolum;
        
        return bilgiler;
        
    }
    
    
    
}
