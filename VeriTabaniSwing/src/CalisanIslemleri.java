

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Kod yazmaya baslamadan once jdbc connector driveri projenizin kutuphanseine(Library) eklemeyi unutmayin
// https://dev.mysql.com/downloads/connector/j/5.1.html  jdbc connector buradan indirebilirsiniz.

public class CalisanIslemleri {
    private Connection con=null; 
    //baglantiyi olusturmak icin Connection class dan bir objeo olusturacagiz.
    
    private Statement statement=null; //veri tabani üzerinde SQL sorgularini calistirmamizi saglayacak 
    private PreparedStatement preparedStatement=null;
    
    public CalisanIslemleri(){
        //veri tabanina baglanmak icin bir url belirtmemiz lazim
        // url="jbcd uzerinden : mysql kullancagiz :// host adresimiz (yukarida tanimladik): baglanacagimiz port / ve baglancagimiz veritabani
        // olsan String ifade --> jbdc:myql://localhost:3306/demo
        //"?useUnicode=true&characterEncoding=utf8" kullanmamizin sebebi java tarafindan turkce karakter eklendiginde sikinti cikmasin
        
        String url="jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.dataBase+"?useUnicode=true&characterEncoding=utf8";
        
        //veri tabanina baglanmak icin kullandigimiz MySqlConnector.jar i burada baslatacagiz yoksa sikinti cikar
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con=(Connection) DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
            //con = (Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace(); //baglanti basarisiz olursa sebebini goremek icin hata kodunu cagirmistim burada
        }
    }
    
    public boolean girisYap(String kullanici_Adi, String parola){
        //Giris yapma islemi
        String sorgu="Select*From adminler Where username=? and password=? ";
        //sorguda adminler tablosundan kullanici adi ve parola kontrol edilecek
        try {
            preparedStatement=con.prepareStatement(sorgu);//SQL sorgumuzu calistirmasi icin kullaniyoruz.
            
            preparedStatement.setString(1,kullanici_Adi); //sorgudaki soru işaretlerine tanimladigimiz degerleri gonderdik
            preparedStatement.setString(2,parola);
            //sorgumuzu calistiralim
            ResultSet rs= preparedStatement.executeQuery();
            return rs.next();  // asagidaki if bloguna gerek kalmadan tek satirda ayni islemi yapiyoruz.
//            if (rs.next()==false) {
//                //eger rs bos deger donuyorsa false deger donecek 
//                return false;
//            }else{
//                return true;
//            }
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
           //eger rs.next(); deger donmez ise burda hata vermsin o yuzden return false yaptik.
        return false;
        }
        
    }
    
    public void calisanEkle(String ad,String soyad,String departman,String maas){
        //Kayit ekleme islemi
             String sorgu = "Insert Into calisanlar (ad,soyad,departman,maas) VALUES(?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, departman);
            preparedStatement.setString(4, maas);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        calisanlariGetir();
    }
    
    public ArrayList<Calisan> calisanlariGetir(){
        //TAbloda calisanalri ArrayList e aktarip tabloda goruntuleyecegiz
        ArrayList<Calisan> cikti=new ArrayList<Calisan>();
        try {
            //SQL sorgu ile veri cekecegimiz icin statement olusturduk.
            Statement statement =  con.createStatement();
            String sorgu="Select*From calisanlar";
            ResultSet rs= statement.executeQuery(sorgu);
            while(rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept  = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Calisan(id, ad, soyad, dept, maas));
                
                
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
        
    }   
    
    public void calisanGuncelle(int id,String yeni_ad,String yeni_soyad,String yeni_departman,String yeni_maas) {
           //Guncelleme islemi
            //calisan tablosunu id ye gore değiştir
        String sorgu =  "Update calisanlar where id = ? set ad = ? , soyad = ? , departman = ? , maas = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            //sorguyu calistirmak icin preparedStatement kullaniyoruz.
            
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,yeni_ad);
            
            preparedStatement.setString(3,yeni_soyad);
            preparedStatement.setString(4,yeni_departman);
            
            preparedStatement.setString(5, yeni_maas);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        
    }
    
        public void calisanSil(int id) { 
        //silme islemi
        
        String sorgu = "Delete from calisanlar where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
//    // balantimizi test etmek icin kullandik
    
//    public static void main(String[] args) {
//        CalisanIslemleri calisanIslemleri=new CalisanIslemleri();
//    }
}
