
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayListVSLinkedList {

    public static void main(String[] args) {
	LinkedList<String> sehirler=new LinkedList<String>();//Veriler referans ile erisim sagliyor
        ArrayList<String> ilceler=new ArrayList<String>();//Bellekte veriler sirali olarak erisim sagliyor.
        
        LinkedList<Integer> s1=new LinkedList<Integer>();
        ArrayList<Integer> s2=new ArrayList<Integer>();
        
        zamanHesapla("LinkedList :", s1);
        zamanHesapla("ArrayList :", s2);
    }

    public static void zamanHesapla(String veriTipi, List<Integer> list){
        //ArrayList ve LinkedList performans kiyaslamasini yapacagiz
        //Yukarida integer tanimli ArrayList ve LinkedList den veriler cekilecek
        //List sonuna deger ekleyecegi. i degerinin sonuna int turunde 1000000 tane deger gondercegiz
        
        long baslangic;
        long bitis;
        baslangic=System.currentTimeMillis(); //for dongusu baslamadan once Baslagici milisaniye cinsinden alacagiz.
        
        for (int i = 0; i < 100000; i++) {
            list.add(0,i); //ilk indexe deger atama islemi linklist hizli olmasinin sebebi dogrudan referans olan yere veri giriyor.
            // list.add(i); // arraylist ise gonderilen indexe kadar sondan baslayarak veri girdigi icin yavas olacaktir.
        }
        bitis=System.currentTimeMillis();// bitis degerimizi milisaniye cinsinden alacagiz.
        System.out.println(veriTipi+" ekleme suresi "+(bitis-baslangic)+" ms");
    }
}
