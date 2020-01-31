import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Array larda S�ralama, Kopyalama ve ek detaylar
		int[] a=array_doldur(5);
        Array_Yazdir(a);
        Array_Sirala(a);
        int[] a1={1,2,3,4,5,6,}; 
        int[] a2={1,2,3,4,5,6,};
        if (a1==a1) {
            System.out.println("E�itler");//i�erik ayn� olsada sonu� e�it de�il olacak 
        }else{                            //cunku bellekte farkl� yerleri referans gostermektedirler.
            System.out.println("E�it De�iller");
        }
        System.out.println("----Array sinifi ile karsilastirma------");
        if (Arrays.equals(a1, a2)) {//Yukaridaki if blogunda sonuc Esit Degil ciktigi icin
             System.out.println("E�itler");//iki array icerigini Arrays sinifinda equals ozelligi ile karsilastiririz.
        }else{
            System.out.println("E�it De�iller");
        }

	}

	  public static int [] array_doldur(int sayi){
	        Scanner scanner=new Scanner(System.in);
	        int[] cikti=new int[sayi];
	        
	        for (int i = 0; i < sayi; i++) {
	            cikti[i]=scanner.nextInt();
	            
	        }
	        return cikti;
	    }
	  
	  public static void Array_Yazdir(int[] array){
	        System.out.println("Dizinin eleman say�s� :"+array.length);
	        for (int i = 0; i < array.length; i++) {
	            
	            System.out.println("Eleman :"+(i+1)+array[i]);
	        }
	    }
	  
	  public static void Array_Sirala(int[] array){
	        //Arrays s�n�f�n�n Sort metodu kullanaca��z. Yapaca��m�z i�leme gore bir �ok metod bulunmaktadir.
	        Arrays.sort(array);
	        Array_Yazdir(array);
	    }
}
