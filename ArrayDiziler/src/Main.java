import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		  int[] a= {34,56,21,67,54,89}; //int t�r�nde 6 elemanl� bir array olu�turuldu.
			//Index :0- 1- 2- 3- 4- 5
			//Eleman:34-56-21-67-54-89
			System.out.println(a[3]);//a array �n 3. indix eleman� yazd�rd�k
		        System.out.println("----------------");
		        int[] b= new int [10]; //int turunde b array referansi olusturuldu ve o referans bellekte 10 elemanlik yer ayirdi
		       // b[5]=524; //b referansin 5. index i 524 degeri verildi
		        System.out.println(b[5]);
		        for (int i = 0; i < 10; i++) { //b nin referans yeri kadar i donecek ve uretilen sayiyi b ye aktaracak
		            b[i]=i*4+3;
		            
		        } 
		        array_yazdir(b); //yazmis oldugumuz metoda b dizinini gonderdik
		        System.out.println("Dizinin elemanlar�n�n ortalamasi :"+ortalamabul(b));//ortlamabul metodunun �agirilmasi
		        
		        System.out.println("b array in boyutu :"+b.length);// dizinin ka� eleman� oldugunu sorgulamak
		         for (int i = 0; i < 10; i++) {
		            System.out.println(b[i]);
		        }
		         System.out.println("----------------------------------");
		         Scanner scanner=new Scanner(System.in);
		         int[] c=new int[5];//bellekte c adinda int turunde 5 elemanli yer ayrildi
		         for (int j = 0; j < 5; j++) { //for 5 elemanli donguye girecek
		            c[j]=scanner.nextInt(); //c arrayin baaslagic degeri kullanicidan istenecek
		           
		         }

	}
	
	  public static void array_yazdir(int [] array){ //dizini metoda gonderme islemi
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Eleman :"+(i+1)+" "+array[i]);
	        }
	    }
	  
	  public static double ortalamabul(int [] ort){
	        int toplam=0;
	        for (int i = 0; i < ort.length; i++) {
	            toplam+=ort[i];
	        }
	        return ((double)toplam/ort.length);
	    }
}
