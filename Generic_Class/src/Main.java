
import java.util.ArrayList;


public class Main {
    public static void main(String [] args){
        /*
        Turden bagimsiz islem yaptigimiz class lar generic class lardir.
        generic metodlar da ise string ifade alirsa string gibi calisir
        integer ifade alirsa integer calisir. yani ne tur ifade alirsa o tur ifade gibi calisir
        */
        toplama(3,4,5);//parametreleri int olan bir metod icine string ifade giremiyoruz genric bir ifade degil.
        
        ArrayList<String> sehirler=new ArrayList<String>();//tur ne ise o turden veri giriyoruz
        ArrayList<Integer> plakalar=new ArrayList<Integer>();
        
        Character [] harfler={'A','B','C','D','E','F','G','H','J','K'};
        Integer[] sayilar={1,2,3,4,5,6,7,8,9,0};
        String[] diller={"C++","C#","Java","Delphi","Python","Visual Basic","Pascal"};
        Ogrenci[] ogrenci={new Ogrenci("Servet",1),new Ogrenci("Ahmet",2),new Ogrenci("Akif",3),new Ogrenci("Oguz",4)};
        //her dizi icin ayri ayri class yazdik ekrana yazdirmak icin class icleri ayni fakat veri tipleri farkli
        //bunun onune gecmek icin generic veri tipi kullaniriz bu saye de bir tek class her turlu veri tipinde kullanilir.
        CharYazdir.Yazdir(harfler);
        System.out.println("________________________");
        IntegerYazdir.Yazdir(sayilar);
         System.out.println("________________________");
        StringYazdir.Yazdir(diller);
         System.out.println("________________________");
        OgrenciYazdir.Yazdir(ogrenci);
        System.out.println("________________________");
        System.out.println("_____Generic Metodla Yazilmistir_______");
        //objelerimiz olusturuldu.
        YazdirmaSinifi<Character> yazdir_char=new YazdirmaSinifi<Character>();//YazdirmaSinifi.java daki e nin yerine character gidecek
        YazdirmaSinifi<Integer> yazdir_int=new YazdirmaSinifi<Integer>();//YazdirmaSinifi.java daki e nin yerine integer gidecek
        YazdirmaSinifi<String> yazdir_str=new YazdirmaSinifi<String>();//YazdirmaSinifi.java daki e nin yerine string gidecek
        YazdirmaSinifi<Ogrenci> yazdir_ogr=new YazdirmaSinifi<Ogrenci>();//YazdirmaSinifi.java daki e nin yerine ogrenci gidecek
        //bu sekilde yukaridaki gibi her dizi icin ayri ayri yazdirma sinifi kullanmanin onene geciyoruz.
        yazdir_char.Yazdir(harfler);
        System.out.println("________________________");
        yazdir_int.Yazdir(sayilar);
        System.out.println("________________________");
        yazdir_str.Yazdir(diller);
        System.out.println("________________________");
        yazdir_ogr.Yazdir(ogrenci);
    }   
    
    public static void toplama(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
