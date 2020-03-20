
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class main {
    /*
    ListIterator ve Iterator 
    ListIterator= Sadece List Interface'i implemente eden class larda kullanilir.
    next() ve previous() metodu vardir. Vektor Stack LinkedList ve ArrayList lerde kullanilir
    add() metodu ile de ekleme yapilabilir.
    
    Iterator= Set, Queue ve List Interface'i implemente eden class larda kullanilir.
    previous() metodu yoktur. for each dongusu ile direkt yazdirilabilir.
    */
    public static void main (String[] args){
        Set<String> set= new HashSet<String>();
        set.add("Java"); set.add("Python"); set.add("C++"); set.add("Flutter"); set.add("C#"); 
        
        List<String> list=new ArrayList<String>();
        list.add("Java"); list.add("Python"); list.add("C++"); list.add("Flutter"); list.add("C#"); 
        
        ListIterator<String> iterator=list.listIterator();
        Iterator<String> iterator1=set.iterator();
        Iterator<String> iterator2=list.iterator();
        while(iterator.hasNext()){ //ileri gidecek
            System.out.println("ListIterator--> "+iterator.next());
        }
        System.out.println("*************************");
//        while(iterator.hasPrevious()){
//            System.out.println("ListIterator previous(): "+iterator.hasPrevious());
//        }
        System.out.println("*************");
        while(iterator.hasNext()){
            String value=iterator.next();//uzerinde bulundugumuz karakteri goster
            if (value.equals("C++")) {//eger value C++ esit ise sil onu
                iterator.remove();
            }
        }
        for(String s:list){ // C++ silindigi icin listede gorulmeyecek
            System.out.println("Yeni Liste :"+s);
        }
        System.out.println("***********");
        while(iterator1.hasNext()){
            System.out.println("Set--> "+iterator1.next());
        }
        System.out.println("**********");
         while(iterator2.hasNext()){
            System.out.println("List--> "+iterator2.next());
        }
    }
}
