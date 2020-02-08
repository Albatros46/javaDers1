import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class HashMapMain {
    /*
    HashMap Sinifi
    1.Degerleri Key(anahtar) ve Value(deger) olarak depolar. Her key'e karsilik gelen bir tane deger bulunur.
    2.Bir anahtar sadece bir kez varolabilir.Ancak birden fazla deger birden fazla olabilir.
    3.Elemanlari tipki HashSet gibi ekleme sirasina gore depolamaz. (HashSet gibi)
    
    */
    public static void main(String[] args) {
	HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        HashMap<Integer,String> sehirler=new HashMap<Integer,String>();
        
        hashMap.put(10,"Java");hashMap.put(30,"Python");hashMap.put(50,"Php");
        hashMap.put(20,"Php");hashMap.put(50, "Javascript");hashMap.put(20, "Php");
           
        sehirler.put(1,"Adana");sehirler.put(2,"Adiyaman");sehirler.put(3,"Afyon");sehirler.put(4,"Agri");
        sehirler.put(5,"Amasya");sehirler.put(6,"Ankara");sehirler.put(7,"Antalya");sehirler.put(8,"Artvin");
        sehirler.put(9,"Aydin");sehirler.put(10,"Balikesir");sehirler.put(11,"Bilecik");sehirler.put(12,"Bingol");
        sehirler.put(46,"Kahramanmaras");sehirler.put(35,"Izmir");sehirler.put(34,"Istanbul");sehirler.put(27,"Gaziantep");
        System.out.println(sehirler);
         for (Map.Entry<Integer,String> entry : sehirler.entrySet()) {
            
            System.out.println("Plaka : " + entry.getKey() + " ------> Sehir: " + entry.getValue());
        }
        //  System.out.println(list);
        /*System.out.println(hashMap);
        
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(100));*/
        System.out.println("***********************************");
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
            
            System.out.println("Anahtar : " + entry.getKey() + " ------> Deðer: " + entry.getValue());
        }
       
    }
}
