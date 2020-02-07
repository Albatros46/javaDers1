
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
/* Set Interface --> HashSet, LinkedHashSet ve TreeSet
    Set Interface ile List Interface Arasindaki farki
    List Interface'i implemente eden class lar bir implementten birden fazla depolayabilirken,
    Set Interface'i implemente eden class lar bir implementten sadece bir tane depolayabilir.
    
    HashSet Sinifi
    HashSet extends AbstractSet  Set interface  extends Collection extends iterable
    1.HashSet elemanlari "hashing" yani hash table mekanizmasina uygun bir bicimde depolarlar
    (Her eleman  belli bir key'e gore depolanir.)
    
    2.HashSet  bir elemani sadece bir defa depolar.(Set Interface)
    
    3.Elemanlarin ekleme sirasina gore depolamaz.
    ________________________________________________________________
    LinkedHashSet Sinifi
    LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
    1.LinkedHashSet hem HashTable hemde Set Interface'in LinkedList implementasyonu gibi davraniyor.
    
    2.HashSet te oldugu gibi bir elemani sadece bir defa depolar.(Set Interface)
    
    3.Elemanlari ekleme sirasina gore depolar.
    ________________________________________________________________
    TreeSet Sinifi
    TreeSet sinifi NavigableSet Interface'ini imlemente eder ve AbstractSet sinifindan alir.
    
    1.Elemanlari depolamak icin Tree-Agac yapisini kullanir.
    
    2.Elemanlari alfabetik olarak siralar.
    ________________________________________________________________
    HashSet vs LinkedHashSet vs  TreeSet
    HashSet, Hash Table mekanizmasini uyguladigi icin elemanlari sirali degildir. Ekleme, cikarma ve arama
    metodlari sabit zamanda (time complexity : 0(1) ) calisir.
    
    TreeSet, elemanlari tree yapisina-agac yapisina  uygun depolar. Ekleme, cikarma ve arama metodlari
    o (log(n) ) complexity si ile calisir.
    
    LinkeHashSet sinifi HashTable  ile (Linked list yapisini kullanarak elemalari depolar. Bu yuzden,
    elemanlar ekleme sirasina gore depolanir. Ekleme, Cikarma  ve Arama metodlari sabir zamanda
    (time complexity : 0(1) ) calisir.
    
    
*/
    public static void main(String[] args) {
		
	Set<String> set1=new HashSet<String>();	
        Set<String> set2=new LinkedHashSet<String>();
        Set<String> set3=new TreeSet<String>();	
        //HashSet 
        set1.add("C++"); set1.add("Java"); set1.add("Python"); set1.add("Go"); set1.add("Ruby"); set1.add("C#");set1.add("Php");
        //LinkedHashSet
        set2.add("C++"); set2.add("Java"); set2.add("Python"); set2.add("Go"); set2.add("Ruby"); set2.add("C#");set2.add("Php");
        //TreeSet
        set3.add("C++"); set3.add("Java"); set3.add("Python"); set3.add("Go"); set3.add("Ruby"); set3.add("C#");set3.add("Php");
        // eklenmis olan elemani tekrar eklemek istersem eklmeyecektir cunku bir defa eklenir.
        System.out.println("*************HashSet**************");
        for(String s: set1){
            System.out.println(s);
        }
        System.out.println("*********LinkedHashSet************");
        for(String s: set2){
            System.out.println(s);
        }
        System.out.println("*************TreeSet**************");
        for(String s: set3){
            System.out.println(s);
        }
        System.out.println(" ________________________________");
        System.out.println(set1.contains("Java")); //Java eleamnlar icinde var mi--> true/false doner
        System.out.println(set2.isEmpty());//set2 nin ici bos mu-->true/false doner
        System.out.println(" ________________________________");
        set3.remove("Go");//set3 Go elemanini sil
        for(String s: set3){ //go elemani bu listede cikmaz cunku silindi yukaridaki islemde
            System.out.println(s);
        }
    }

}
