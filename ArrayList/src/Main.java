import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Normal Array da boyutu belirlendinten sonra genisletme yapamiyoruz 
        //Fakat ArrayList ile bu sorunu ortadan kaldirabiliriz.
		ArrayList<String> arabalar=new ArrayList<String>();//arabalar referansýnda bir arraylist oluþturduk
		arabalar.add("Ford Mondeo"); //Add metodu ile ArrayList obje eklenebilir.
        arabalar.add("Ford Fiesta");
        arabalar.add("Toyota Avensis");
        arabalar.add("Toyata Avalon");
        arabalar.add("Toyota Camry");
        arabalar.add("Audi A8");
        arabalar.add("Audi A6 S Line");
        arabalar.add("Toyata Avalon");
        System.out.println(arabalar.get(5)); //arabalar ArrayList in 0. index de buluna nesne
        System.out.println(arabalar.size()); //arabalar ArrayList kac elemani var
        System.out.println("__________");
        System.out.println("Aranan objenin Index nu :"+ arabalar.indexOf("Toyata Avalon"));
        //eger bir objeden iki tana kayit varsada
        System.out.println("Aranan objenin Index nu :"+ arabalar.lastIndexOf("Toyata Avalon"));
        System.out.println("___-----___");
        //arabalar.remove(0);   //ArrayList iki sekilde silme yapabiliriz direkt objenin ismini yazaarak 
        // arabalar.remove("Audi A8"); //yada objenin index ini yazarak silebiliriz.
        arabalar.set(7, "Volvo XC90"); //ArrayList index nu ile guncelleme yapabiliriz
        for (int i = 0; i < arabalar.size(); i++) {
            System.out.println(arabalar.get(i));  //arabalar  ArrayList ekrana yazdirdik
        }
	}

}
