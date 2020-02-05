
public class Test {
    public static void main(String[] args){
        Character [] harfler={'A','B','C','D','E','F','G','H','J','K'};
        Integer[] sayilar={1,2,3,4,5,6,7,8,9,0};
        String[] diller={"C++","C#","Java","Delphi","Python","Visual Basic","Pascal"};
        Ogrenci[] ogrenci={new Ogrenci("Servet",1),new Ogrenci("Ahmet",2),new Ogrenci("Akif",3),new Ogrenci("Oguz",4)};
        Yazdir(harfler);
        Yazdir(sayilar);
        Yazdir(diller);
        Yazdir(ogrenci);
        System.out.println("---------------------------");
        Sayisal sayisal1=new Sayisal(30, 20, 15, 30);
        Sayisal sayisal2=new Sayisal(30, 30, 2, 30);
        Sayisal birinci=birinci(sayisal1, sayisal2);
        System.out.println("Birinci Sayisal Ogrencinin Puani :"+birinci.puanHesapla());
        System.out.println("--------------------------");
        EsitAgirlik ea1=new EsitAgirlik(25, 25, 20, 21);
        EsitAgirlik ea2=new EsitAgirlik(30, 30, 9, 18);
        EsitAgirlik birinci2=birinci(ea1, ea2);
        System.out.println("Birinci Esitagirlik Ogrenci Puani :"+birinci2.puanHesapla());
    }
    
    public static <E extends Aday> E birinci(E e1, E e2){ //E Aday.java dan gelen her turlu veriyi alacak 
                                        //diger sekilde olsaydi her class dan gelen veriyi de kabul ederdi
        if (e1.puanHesapla()>e2.puanHesapla()) {
            return e1;
        }else{
            return e2;
        }
    }
    
    public static <E> void Yazdir(E[] dizi){
        for(E e:dizi){
            System.out.println(e);
        }
    }
}
