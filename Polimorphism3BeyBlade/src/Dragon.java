
public class Dragon extends BeyBlade{
    private String KutsalCanavar;
    private String GizliYetenek;

    public Dragon(String BeyBladeci, int donuzHizi, int saldiriGucu,String KutsalCanavar,String GizliYetenek) {
        super(BeyBladeci, donuzHizi, saldiriGucu);
        this.KutsalCanavar=KutsalCanavar;
        this.GizliYetenek=GizliYetenek;
    }

   @Override
     public void BilgiGetir() {
        super.BilgiGetir(); 
        System.out.println("Kutsal Canavar :"+KutsalCanavar);
        System.out.println("Gizli Yetenek  :"+GizliYetenek);
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {
        System.out.println(getBeyBladeci()+" "+KutsalCanavar+" ortaya çıkarıyor...");
        System.out.println(getBeyBladeci()+" Gizli saldırı Hayalet Kasırgası");
    }
    
}
