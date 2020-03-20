


import java.util.PriorityQueue;
import java.util.Queue;

/*  Queue Interface Ve PriorityQueue Sinifi
    *  PriorityQueue normal Queue mantigi gibi davranmaz. Elemanlar oncelik siralarina
    *  gore yuksek oncelik kazanip
    *  (
    *  Integer lerde en yuksek oncelik en kucuk sayida en dusuk oncelik en buyuk sayidadir.
    *  String lerde en yuksek oncelik alfabetik olarak sozcuklukte en once gelen string te,
    *  en dusuk oncelik ise alfabetik olarak sozlukte son gelen string tedir.
    *  ) kuyrukta onlere gecerler.(Tipki hastanlerdeki acil sevis gibi)
    *  
    *  add(Eleman)-->Elemani kuyruga ekler. Ekleyemez ise hata olusur.
    *  offer(Eleman)-->Elemani kuyruga ekler. Eklerse TRUE ekleyemezse FALSE deger doner.
    *  clear() --> Kuyrugu Temizler
    *  containes(Object o) --> o objesi kuyrugun icindeyse TRUE, degilse FALSE deger doner.
    *  peek() --> Kuyrugun basindaki elemani dondurur. Eger kuyruk bos ise Null deger doner.
    *  poll() --> Kuyrugun basindaki elemani cikartir ve deger olarak doner. Eger kuyruk bossa Null deger doner.
    *  size() --> Kuyruk icindeki eleman sayisini dondurur.
    */
public class QueueInterfaceVePriorityQueue {
  
    public static void main(String[] args) {
        Queue<Integer> plakalar=new PriorityQueue<Integer>();
        plakalar.offer(1);  plakalar.offer(46);  plakalar.offer(21);  plakalar.offer(19); 
        plakalar.offer(34);  plakalar.offer(5);  plakalar.offer(14);  plakalar.offer(71);
        
        System.out.println("Ilk Eleman :"+plakalar.peek());
        System.out.println("Kuyrukta Bulunan Eleman Sayisi :"+plakalar.size());
        System.out.println("Kurukta Elemani kontrol Etme :"+plakalar.contains(34));//Eger 34 elemani kuyrukta varsa True donecek
        
        //For each dongusu ile yazdirmak istersek sirayla yazmayacaktir.
        for(Integer i:plakalar){
            System.out.println(i);
        }
        System.out.println("------------");
        //Cikarma islemi gerceklesirken en yuksek oncelikten baslayacaktir.
        while(!plakalar.isEmpty()){
            System.out.println("Eleman Cikariliyor :"+plakalar.poll());
        }
        System.out.println("Ilk Eleman :"+plakalar.peek());
        System.out.println("Kuyrukta Bulunan Eleman Sayisi :"+plakalar.size());
        System.out.println("Kurukta Elemani kontrol Etme :"+plakalar.contains(34));//Eger 34 elemani kuyrukta varsa True donecek
        System.out.println("---------------------------");
        //ID si kucuk olani daha yuksek onclikli yapmak icin Player adinda class olusturduk
        //class icinde kullandigimiz metodu inceleyelim;
        Queue<Player> oyuncular=new PriorityQueue<Player>();
        oyuncular.offer(new Player("Servet",18));
        oyuncular.offer(new Player("Ahmet",22));
        oyuncular.offer(new Player("Akif",3));
        oyuncular.offer(new Player("Oguz",46));
        oyuncular.offer(new Player("Rukiye",100));
        while(!oyuncular.isEmpty()){
            System.out.println("Eleman Cikariliyor :"+oyuncular.poll());
        }
    }
    
}

class Player implements Comparable<Player>{//comparable implement edildi
    String isim;
    int Id;

    public Player(String isim, int Id) {//constructor olustuldu
        this.isim = isim;
        this.Id = Id;
    }

    @Override
    public String toString() { //main class icinde oyuncular.poll() calismasi icin Player class veri gonderilmesini sagladik
        return "Player{" + "isim=" + isim + ", Id=" + Id + '}';
    }

    @Override
    public int compareTo(Player player) {//compareTo metodu kullanilarak id ler karsilastirildi
        if (this.Id<player.Id) { 
            return -1; //id ler kiyaslanirken kucuk olan id -1 degerini alarak en son kiyaslam bitene kadar devam edecek
        }else if(this.Id>player.Id){
            return 1;
        }
        return 0;
    }
    
}
