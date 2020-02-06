
public class Main {
        //Bir deger atamasi bir kere atanir ve bir daha asla degistilemez.
        //Tekrar degistirmek istedigimizde hata ile karsilasiriz.
        //Projede degistirmesilmesini istemedigimiz bir obje finaly olarak tanimlariz.
        //Final degeri ya tanimladigi yerde verilir yada constructor icinde verilir.
    public static void main(String[] args) {
	FinalyTest final1=new FinalyTest("Obje 1");
        FinalyTest final2=new FinalyTest("Obje 2");
        
        System.out.println("Obje Sayisi :"+final1.objesayisi);
        System.out.println("Obje Sayisi :"+final2.objesayisi);
        System.out.println("***********************************");
        System.out.println("Veritabani Adi :"+DataBase.databaseName);
        System.out.println("Kullanici Adi  :"+DataBase.kullaniciAdi);
        System.out.println("Parola         :"+DataBase.parola);
    }

}
