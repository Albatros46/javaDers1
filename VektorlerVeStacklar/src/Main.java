
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class Main {
    public static void main(String[] args){
        /*
        Vector: ArrayList ten farklý olarak public synchronized  kullanmaktadir.
        Farklý Trade ler bir arraylist üzerinde çalýþýyorsa synchronized olmadýðý icin birden fazla 
        erisim olmasýna sebep oluyor. Bunun onune gecmek icin ArrayList den daha guvenli olan Vector kullanimi tercih edilir.
        sadece synchronized olan erisim saglar, guvenligi artirmaktadir.
        Vector, ArrayList e gore biraz yavas performans gostermektedir. Trade ler le islem yapiyorsak vector kesinlikle daha guvenli olacaktir.
        
        */
        Vector<String> vektor=new Vector<String>();
        vektor.add("Java"); vektor.add("Python"); vektor.add("C#"); 
        vektor.add("Php"); vektor.add("Go"); vektor.add("Flutter"); 
        System.out.println("-------for dongusu-------");
        for(String s: vektor){
            System.out.println(s);
        }
        
        System.out.println("-------iterator-------");
        ListIterator<String> iterator=vektor.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("-------Enumeration-------");
        Enumeration<String> enumaration=vektor.elements();
        while(enumaration.hasMoreElements()){
            System.out.println(enumaration.nextElement());
        }
        System.out.println("Ilk Eleman = "+vektor.firstElement());
        System.out.println("Son Eleman = "+vektor.lastElement());
        
        /* Stackler vektorden türerler LIFO(Last In First Out) son giren ilk çýkar.
        */
        
        System.out.println("-----Stack ler-------------");
       /* The {@code Stack} class represents a last-in-first-out
        * (LIFO) stack of objects. It extends class {@code Vector} with five
        * operations that allow a vector to be treated as a stack. The usual
        * {@code push} and {@code pop} operations are provided, as well as a
        * method to {@code peek} at the top item on the stack, a method to test
        * for whether the stack is {@code empty}, and a method to {@code search}
        * the stack for an item and discover how far it is from the top.*/
        Stack<String> stack=new Stack<String>();
        stack.push("Istanbul"); // push de add gibi veri ekleyebiliriz
        stack.add("Kahramanmaras");
        stack.push("Ankara"); stack.push("Adana");
        for (String s:stack){
            System.out.println(s);
        }
        System.out.println("---Stack ý enumerations ile gezinme----");
        System.out.println(stack.pop());//Son elemani cikar.Son eleman stack tan cikarildi ve yeni listeyi return etti.
        Enumeration<String> enuma=stack.elements();
        while(enuma.hasMoreElements()){
            System.out.println(enuma.nextElement());
        }
        
        System.out.println("son giren eleman : "+stack.peek());//Stack a giren son elemaný al ve yazdir
        System.out.println(stack.empty()); //Stack bos ise false deger doner dolu ise true deger doner
        
        while(!stack.empty())//Stack bos olmadigi surece 
            {
                System.out.println("Eleman Cikariliyor..."+stack.pop());
             }
        ArrayList<String> list=new ArrayList<String>();
    }
}
