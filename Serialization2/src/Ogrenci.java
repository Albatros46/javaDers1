import java.io.Serializable;

public class Ogrenci implements Serializable {
    //private static final long serialVersionUID = 2000;
    
    private String isim;
    private int id;
    private String bolum;
   
    

    public Ogrenci(int id, String isim, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        
        String bilgiler =  "Ogrenci Nu   :" + id +
                           "\nAdi Soyadi : " + isim +
                           "\nBölüm      : " + bolum;
        
        return bilgiler;
        
    }
    
    
    
}
