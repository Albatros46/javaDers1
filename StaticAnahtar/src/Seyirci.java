
public class Seyirci {
    private String isim;
    public static int seyirci_sayisi=0;
    
    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayisi++;//Bellekte her seyirci olustugunda seyirci sayisi artiracak
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void oyunseyret(){
        System.out.println(isim+" oyun seyrediyor.");
    }
}
