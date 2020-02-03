
public class Main {

    public static void main(String[] args) {
	//Static olarak tanimladigimiz objeler program calistirildigi andan itibaren bellekte direkt olusur
        // ve sinifa ait oldugu icin sadece bir defa olusur.
        Seyirci seyirci1=new Seyirci("Servet AKCADAG");
        seyirci1.oyunseyret();
        Seyirci seyirci2=new Seyirci("Cuma KARACA");
        seyirci2.oyunseyret();
        Seyirci seyirci3=new Seyirci("Kemal ERSOY");
        seyirci3.oyunseyret();
        System.out.println("Seyirci Sayisi :"+Seyirci.seyirci_sayisi);
    }

}
