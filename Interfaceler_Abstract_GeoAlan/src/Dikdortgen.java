
public class Dikdortgen extends Sekil{
    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(String isim,int uzunKenar,int kisaKenar) {
        super(isim);
        this.kisaKenar=kisaKenar;
        this.uzunKenar=uzunKenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim()+" alani :"+(uzunKenar*kisaKenar));
    }
    
}
