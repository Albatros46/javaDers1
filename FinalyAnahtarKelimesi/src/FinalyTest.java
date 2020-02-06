
public class FinalyTest {
    
    public final int objesayisi;// deger burada da verip kullanabiliriz veya constructor icinde verip kullanabiliriz.
    private static int say = 0;
    private final String isim;

    public FinalyTest(String isim) {
        
        this.isim = isim;
        say++;
        objesayisi=say;
        
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalyTest.say = say;
    }
    
     public void deneme(){
        // burada deger veremeyiz.
    }
}
