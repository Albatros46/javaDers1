import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Cok boyutlu array lar . 
        int [][] a=new int [2][2]; //2 satýr 2 sutun lu coklu dizi
        a[0][0]=20;//0 inci satir 0 inci sutunun elemani
        a[0][1]=30;//0 inci satir 1 inci sutunun elemani
        a[1][0]=40;//1 inci satir 0 inci sutunun elemani
        a[1][1]=50;//1 inci satir 1 inci sutunun elemani
        System.out.println(a[0][0]);
        System.out.println("------------------------------");
        //Yukaridaki kullanimina alternatif bir kullanim
        int [][] b={{80,90},{110,210}};
        System.out.println(b[1][1]);
        System.out.println("--------Array Elanlari Kullanicidan isteniyor");
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               // System.out.println("i="+i+" j ="+j);
               b[i][j]=scanner.nextInt();
            }
        }
        System.out.println("***************************************");
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               // System.out.println("i="+i+" j ="+j);
                System.out.println(b[j][j]+" ");
            }
           System.out.println(" ");  
        }
	}

}
