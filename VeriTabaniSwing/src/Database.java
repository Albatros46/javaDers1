

//Programda kullancagimiz uygulama sabitlerin burada yaziyoruz.
//CalisanaIslemler.java--> veritabanina ekleme, silme, güncelleme ve listeleme için kullanilacak
//DataBase.java --> veri tabani ile baglanti islemlerinde kullanilacak

public class Database {
    // static final kullaniyorum cunku hic bir yerden degistirilmesin sabit kalsin
    public static final String kullaniciAdi="root"; 
    //Kullanici adi direkt burada tanimladik ve kurulum esnasindaki kullanici adini yazdik
    
    public static final String parola="";
    //Parolamiz kurulum esnasinda boş olarak geçmiştik
    
    public static final String dataBase="demo";  
    // phpmyadmin de olsuturdugumuz ornek veri tabani veri tabani olusturuken turkce karakterlerde sikinti cikmasin diye
    //utf 8 turkhis ci sectik 
    
    public static final String host="localhost"; 
    //yerel sunucu(localhost) oldugu icin direkt yazdik uzak sunucu olsaydi uzak sunucu yolunu belirtmeliydik.
    
    public static final int port=3306; 
    // burada mysql nin calistigi portu belirtiyoruz benimkinin portu 3306
    
    
    
}
