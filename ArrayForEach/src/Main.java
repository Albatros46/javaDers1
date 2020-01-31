
public class Main {

	public static void main(String[] args) {
		String[] meyveler={"Elma","Armut","Portakal","Karpuz"};
        for (int i = 0; i < meyveler.length; i++) {
            System.out.println(meyveler[i]);
        }
        
        System.out.println("-----Diger Kullaným Sekli.......");
        
        for(String a: meyveler){ //a degiskeni meyveler dizinin tum ozelliklerine sahip oluyor
            System.out.println(a);

        }
        
        System.out.println("__________________");
        int[] j={1,2,3,4,5,6,7,8,9,10};
        for(int i:j){System.out.println(i);}
        System.out.println("____/----");
        AdSoyad[] array1={new AdSoyad("Servet AKCADAG"),new AdSoyad("Ahmet AKCADAG"),
        		new AdSoyad("Akif AKCADAG"),new AdSoyad("Oguz AKCADAG"),new AdSoyad("Rukiye AKCADAG")};
        for(AdSoyad k:array1) {
        	k.Yazdir();
        }
	}
}
