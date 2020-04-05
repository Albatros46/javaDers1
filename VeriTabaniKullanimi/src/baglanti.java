
import com.mysql.jdbc.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
    Bilgisayar a Xamp i kurduktan sonra Apache (locallhost) calistirdik ve MySql yi de calistirdiktan sonra
Xamp ana control panel sayfasinda localhost ve mysql portu bulunmaktadir. 
    onlari kullanarak veri tabanimiza baglanacagiz. 
    kurulum esnasinda kullanici adi ve parola girmediysak varsayilan olarak kullanici adi root parola boş 
    https://www.w3schools.com/sql/default.asp    veri tabani ogrenmek ve ornek kodlar icin
    https://dev.mysql.com/downloads/connector/j/5.1.html adresinden mysqlconnector jar indirip projeye dahil etmeliyiz.
*/
public class baglanti {
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
    
    private Statement statement=null; //veri tabani üzerinde SQL sorgularini calistirmamizi saglayacak 
    private PreparedStatement preparedStatement=null; 
    
    public baglanti(){ //Veritabanina erisim sagliyoruz
        //veri tabanina baglanmak icin bir url belirtmemiz lazim
        // url="jbcd uzerinden : mysql kullancagiz :// host adresimiz (yukarida tanimladik): baglanacagimiz port / ve baglancagimiz veritabani
        // olsan String ifade --> jbdc:myql://localhost:3306/demo
        //"?useUnicode=true&characterEncoding=utf8" kullanmamizin sebebi java tarafindan turkce karakter eklendiginde sikinti cikmasin
        
        String url="jdbc:mysql://"+host+":"+port+"/"+dataBase+"?useUnicode=true&characterEncoding=utf8";
        
        //veri tabanina baglanmak icin kullandigimiz MySqlConnector.jar i burada baslatacagiz yoksa sikinti cikar
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con=(Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
            //con = (Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace(); //baglanti basarisiz olursa sebebini goremek icin hata kodunu cagirmistim burada
        }
    }
    
    public static void main(String[] args){
        //Olusturdugumuz baglantiyi cagiriyoruz 
        baglanti baglanti = new baglanti();
        System.out.println("Personel Listesi--> Eklenmeden Once");
        baglanti.CalisanlariGetir();
        System.out.println("____________________________________________________");
        System.out.println("Personel Listesi Guncel Hali");
        baglanti.calisanEkle();
        baglanti.CalisanlariGetir();
        System.out.println("guncellendikteson sonra...............");
        baglanti.calisanGuncelle();
        baglanti.CalisanlariGetir();
        System.out.println("silindikten sonra");
        baglanti.calisanSil();
        baglanti.CalisanlariGetir();
        System.out.println("____-------------_____________---------------");
        System.out.println("id si 3 den buyuk ve adi A harfi ile baslayanlar");
        baglanti.preparedCalisanlar(3);
        
        baglanti.CommitVeRollback();
       
    }
    
    public void CalisanlariGetir(){ //Veritabanini listeleme islemi
        //veritabaninda veri cekmek icin kullancagimiz metod
        //tanimladigimiz statement i kullanarak SQL sorgusu ile veri cekecegiz.
        String sorgu="Select * From calisanlar"; //calisanlar veri tabanindaki tum veriyi al
        try {
            statement=con.createStatement();//statement baslangicta bos idi burada sql sorgumusu girecegiz
            ResultSet rs= statement.executeQuery(sorgu); //eger veri tabaninda guncelleme yapmayacaksak bu executeQuery kullanacagiz
            while(rs.next()){
            //iterator mantıgı ile veri icinde gezinecegiz
            int id=rs.getInt("id"); // executeQuery resultset return ettigi cin rs ye aktarilan veri icinde cekmek istegimiz alanin adini yaziyoruz.
            String ad=rs.getString("ad");
            String soyad=rs.getString("soyad");
            String email=rs.getString("email");
            
                System.out.println("Id : "+id+" Adı : "+ad+" Soyad : "+soyad+" E-Posta : "+email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanEkle(){
        //Veritabanina; veri ekleme islemi 
        try {
            statement=con.createStatement();
            String ad="Gazi"; String soyad="Akcadag";  String email="gazikcdg@gmail.com"; 
            // INSERT into calisanlar(ad,soyad,email)VALUES("Cemal","Kozak","kozakcemal@hotmail.com")
            String sorgu="INSERT into calisanlar(ad,soyad,email)VALUES("+"'"+ad+"',"+"'"+soyad+"',"+"'"+email+"')";
            
            //veride yapilan her islem update niteligindedir(silmek, eklemek, güncellemek gibi)
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanGuncelle(){
        //veritabaninda guncelleme yapma islemi
        try {
            statement=con.createStatement();
            String sorgu="Update calisanlar Set email='alcatraz220@windowslive.com' Where id='1'";
            
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanSil(){
        //Veritabanindan silmek islemi yapma
        try {
            statement=con.createStatement();
            String sorgu="DELETE FROM `calisanlar` WHERE `calisanlar`.`id` > 10 ";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void preparedCalisanlar(int id){
        
        String sorgu="Select*From calisanlar Where id>? and ad like ?"; //? yerien hangi deger gelecekse preparedStatement kullanarak belirtmiş olacagiz
        try {
            preparedStatement=con.prepareStatement(sorgu); 
            preparedStatement.setInt(1, id);//1. ? işaretin yerine id verdik
            preparedStatement.setString(2, "A%"); //2. ? şaretin yerine ise adi A harfi ile baslayanlari istedik
            //tanimladigimiz da deger kac girildi ise id si o degerden buyuk ve adi A harfi ile baslayanlari listeleyecek
            ResultSet rs= preparedStatement.executeQuery();
            while(rs.next()){
                String ad=rs.getString("ad");  
                String soyad=rs.getString("soyad"); 
                String email=rs.getString("email");
                
                System.out.println("Ad-> "+ ad+ " Soyad -> "+soyad+" E-Posta-> "+email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
        
        
        
        
        
//        try {
//            statement=con.createStatement();
//            String sorgu="Select*From calisanlar Where as like 'A%'"; 
//            //calisanlar tablosunda adi A ile baslayanlari cektik
//            
//            ResultSet rs= statement.executeQuery(sorgu);
//            //sorgumuz select islemi gercekelstirdigi icin ResultSet kullancagiz
//            while(rs.next()){
//                System.out.println("Id : "+rs.getString("id")+ " Ad : "+rs.getString("ad"));
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
//            
//        }
    }
    
    public void CommitVeRollback(){
        Scanner scanner=new Scanner(System.in);
        try {
            con.setAutoCommit(false); //false yapmamizin sebebi biz kendimiz hatayi oncelmek istedik
            String sorgu="Delete From calisanlar Where id=3";
            String sorgu2="Update From calisanlar Set email='marasliMarasli46@eko.com' Where id=5 ";
            
            System.out.println("____Guncellenmeden Once____");
            CalisanlariGetir();
            
            Statement statement=con.createStatement();
            statement.executeUpdate(sorgu);
            statement.executeUpdate(sorgu2);
            System.out.println("İşlemleriniz Kayıt Edilsin mi? E/H");
            String cevap=scanner.nextLine();
            if (cevap.equals("E")) {
                //Burda commit edecegiz.
                con.commit();
                CalisanlariGetir();
                System.out.println("Veritabani Guncellendi...");
            }else{
            //Burada rollback yapacagiz
                con.rollback(); // sorgudaki hic bir islem yapilmayacak 
                System.out.println("Veritabaninda degesiklik yapilmadi....");
                CalisanlariGetir();
            }
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
