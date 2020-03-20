import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//Hastane Acil Servis Ornegi
        /*
        Hastalar hastalik durumuna gore siraya gececekler(PriorityQueue)
        Apandist-En yuksek oncelik-3
        Yanik-Ikinci Oncelik - 2
        Bas Agrisi-Ucuncu Oncelik - 1
        
        */
        Queue<Hasta> AcilServis=new PriorityQueue<Hasta>();
        AcilServis.offer(new Hasta("Servet AKCADAG","Yanik",2));
        AcilServis.offer(new Hasta("Ahmet AKCADAG","Apandist",3));
        AcilServis.offer(new Hasta("Akif AKCADAG","Bas Agrisi",1));
        AcilServis.offer(new Hasta("Oguz GUNES","Yanik",2));
        AcilServis.offer(new Hasta("Rukiye COBAN","Apandist",3));
        AcilServis.offer(new Hasta("Kenan PALA","Yanik",2));
        AcilServis.offer(new Hasta("Ilknur CENGIZ","Yanik",2));
        AcilServis.offer(new Hasta("Yavuz CAN","Apandist",3));
        AcilServis.offer(new Hasta("Hatice KOZAN","Bas Agrisi",1));
        
        int i=1;
        while(AcilServis.isEmpty()!=true){//Acil servis bos olana kadar dongomus donecek
            System.out.println("***********************"); 
            System.out.println(i+" Sirada ");
            System.out.println(AcilServis.poll());//Ilk siradakini cekecek
            i++;
        }

	}

}
