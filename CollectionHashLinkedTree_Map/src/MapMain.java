
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
HashMap -> Key lere gore Degerler sirasiz olarak islem yapiyor.
LinkedHashMap -> Ekleme siralamasina gore islem yapiyor.
TreeMap -> Key lere gore siralama yapiyor.
*/
public class MapMain {
    public static void main(String[] args){
        Map<Integer, String> hashMap=new HashMap<Integer, String>();
        Map<Integer, String> linkedMap=new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap=new TreeMap<Integer, String>();
        System.out.println("**********************");
        System.out.println("_______HashMap________");
        MapYazdir(hashMap);
        System.out.println("----------------------");
        System.out.println("______LinkedMap_______");
        MapYazdir(linkedMap);
        System.out.println("----------------------");
        System.out.println("_______TreeMap________");
        MapYazdir(treeMap);
        System.out.println("**********************");
       
    }
    
    public static void MapYazdir(Map<Integer,String> Map){
        Map.put(1,"Java"); Map.put(5,"C++"); Map.put(6,"C#.NetCore"); Map.put(4,"C#"); 
        Map.put(2,"Ruby"); Map.put(3,"Scala"); Map.put(7,"Php"); Map.put(8,"Go"); 
        for(Map.Entry<Integer,String> entry:Map.entrySet()){
            System.out.println("Key : "+entry.getKey()+"  Deger :"+entry.getValue());
        }
        System.out.println(Map.keySet());
        //Collection  ile degerlerimizi de listeleyebiliriz.
        Collection<String> value=Map.values();
        for (String s: value){
            System.out.println("Deger :"+s);
        }
    }
    
  
}
