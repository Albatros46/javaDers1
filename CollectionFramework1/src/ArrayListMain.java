
import java.util.ArrayList;
import java.util.List;


public class ArrayListMain {
    public static void main(String[] args){
        ArrayList<String> array1=new ArrayList<String>();
        List<String> liste=new ArrayList<String>();
        liste.add("C++"); liste.add("Python"); liste.add("Java"); liste.add("C#");
        liste.add("Go"); liste.add("Pascal"); liste.add("Visual Basic"); liste.add("Ruby");
        System.out.println("Programlama dili :"+" "+liste.get(0));
        System.out.println("Programlama dili :"+" "+liste.get(2));
        System.out.println("***********************");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println("Programlama dili -->"+" "+liste.get(i));
        }
        System.out.println("***********************");
        for (String s:liste) { //Bu sekilde daha kolay ekrana bastirabiliriz.
            System.out.println("Programlama dili -->"+" "+s);
        }
    }
}
