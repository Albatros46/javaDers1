
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.mysql.jdbc.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
----> Database Transaction <----
    Cogu zaman programlarimizda bir cok veritabani islemini ardarda yapariz.
Ornegin eilimizde birbiriyle baglantili 3 tablo guncelleme islemimiz var (delete, update).
bu islemleri ve sorgulari ard arda calistirdigimizda ;
    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2); bu kisimda herhangi bir hata olursa program sona erecektir.
    statement.executeUpdate(sorgu3);

    bu durumda sorgu2 de herhangi bir hata oluyor. 
    Fakat sorgu1 hata olmadigi icin sorgu da veritabani guncellenmis olacak
    Bu gibi durumlarda her uc sorgu da calissin istiyorsak Database Transaction kullanacagiz
ornek: bankalarda atm lerde çok nadir olan bir hata kartı taktik atm ye şifremizi girdik o sorgu1 doğru ise girdik
    menulerden para çek yaptik cekemek istedigimiz tutari girdik bakiye miz sorgulandi sorgu2 yeterli ise bakiye var diyeli 
bu sefer de atm kasasinda cekilmek istenen tutar kadar para varmi sorgu3 para sayildi verecek fakat hata olustu.
Ama bakiyemizden para dustu elimize almadik paramizi. 
boyle durumlarda para vermediyse bakiye dusmasin--->commit ve rollback iste bu durumlarda kullanilir.

Commit bütün sorgulari calistiri.
Rollback ise eger bir sorgu da hata olursa butun sorgulari calismasini durduracak
Not: setAutoCommit(false) yazsak bile veritabanini guncellemeyen bir sorgumuz varsa herhangi bir 
guvenlik sikinti olmayacagindan calistirilir.
*/



public class CommitVeRollback {
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
   
    private String kullaniciAdi="root"; 
    //Kullanici adi direkt burada tanimladik ve kurulum esnasindaki kullanici adini yazdik
    
    private String parola="";
    //Parolamiz kurulum esnasinda boş olarak geçmiştik
    
    private String dataBase="demo"; 
    // phpmyadmin de olsuturdugumuz ornek veri tabani veri tabani olusturuken turkce karakterlerde sikinti cikmasin diye
    //utf 8 turkhis ci sectik 
    
    private String host="localhost"; 
    //yerel sunucu(localhost) oldugu icin direkt yazdik uzak sunucu olsaydi uzak sunucu yolunu belirtmeliydik.
    
    private int port=3306; 
    // burada mysql nin calistigi portu belirtiyoruz benimkinin portu 3306
    
    private Connection con=null; 
    //baglantiyi olusturmak icin Connection class dan bir objeo olusturacagiz.
  
     public void baglanti() {
         String url="jdbc:mysql://"+host+":"+port+"/"+dataBase+"?useUnicode=true&characterEncoding=utf8";
        
        try {
            //veri tabanina baglanmak icin kullandigimiz MySqlConnector.jar i burada baslatacagiz yoksa sikinti cikar

            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        try {
            con=(Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Bağlantı Başarılı...");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
       
    }
     
     public static void main(String[] args){
        
     }
}
