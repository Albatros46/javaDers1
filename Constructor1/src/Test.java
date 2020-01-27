
public class Test {
    public static void main(String[] args){
        Hesap hesap1=new Hesap();
        hesap1.setHesapNu("1");
        hesap1.setIsim("Servet AKCADAG");
        hesap1.setCepTlf("5321334263");
        hesap1.setEposta("Albatross220@windows.com");
        hesap1.setBakiye(2000.0);
        System.out.println(hesap1.getIsim() +" Bakiyeniz "+hesap1.getBakiye());
        Hesap hesap2=new Hesap();
        hesap2.setHesapNu("2");
        hesap2.setIsim("Ahmet AKCADAG");
        hesap2.setCepTlf("5638549675");
        hesap2.setEposta("Albats220@windows.com");
        hesap2.setBakiye(5000.0);
        System.out.println(hesap2.getIsim() +" Bakiyeniz "+hesap2.getBakiye());
        Hesap hesap3=new Hesap("12","Akif Akcadag","marasli@gmail.com","536749641",3500.0);
        //Test.java da tanımladığımız parametreli construct kullanılarak veri giliyor.
        //yukarıdaki gibi tek tek set ederek veri girmek yerine bu kullanım tercih edilir.
        System.out.println(hesap3.getIsim()+" Bakiyeniz :"+hesap3.getBakiye());
        hesap2.ParaYatır(650);
        hesap3.ParaÇekme(785);
    }
}
