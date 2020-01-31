import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		   /*
        Wrapper Class
        boolean--->Boolean
        char------>Character
        byte------>Byte
        int------->Integer
        long------>Long
        float----->Float
        double---->Double
        */
	ArrayList<String> arrayList1=new ArrayList<String>();
      //  ArrayList<int> arraylist2=new ArrayList<int>(); //bu sekil ilkel degisken atama ile hata verdigi icin
        ArrayList<Integer> arraylist3=new ArrayList<Integer>(); //yukaridaki hatayi engellemek icin wrapper clas tarzi atama yaptýk
        System.out.println("__________Autoboxing_________");
        for (int i = 0; i < 10; i++) {
            arraylist3.add(Integer.valueOf(i*4)); //ilkel tanýmlanmis i degiskeni wrapper tanýmlamis degiskene 
                                                 //karsilik gelmesi AUTOBOXING
        }
        System.out.println("__________Unboxing_________");
        for (int i = 0; i < arraylist3.size(); i++) {
            System.out.println(arraylist3.get(i).intValue()); //unboxing
        }
		
	}

}
