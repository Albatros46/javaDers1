
public class Drayga extends BeyBlade{
     private String KutsalCanavar;

    public Drayga(String BeyBladeci, int donuzHizi, int saldiriGucu,String KutsalCanavar) {
        super(BeyBladeci, donuzHizi, saldiriGucu);
        this.KutsalCanavar=KutsalCanavar;
    }
    @Override
     public void BilgiGetir() {
        super.BilgiGetir(); 
        System.out.println("Kutsal Canavar :"+KutsalCanavar);
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {
        System.out.println(getBeyBladeci()+" "+KutsalCanavar+" ortaya çıkarıyor...");
        System.out.println(getBeyBladeci()+" gizli saldırısı Kaplan Pençesi");
    }
}
