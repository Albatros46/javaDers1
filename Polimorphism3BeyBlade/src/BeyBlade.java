
public class BeyBlade { //Ana class
    private String BeyBladeci;
    private int donuzHizi;
    private int saldiriGucu;

    public BeyBlade(String BeyBladeci, int donuzHizi, int saldiriGucu) {
        this.BeyBladeci = BeyBladeci;
        this.donuzHizi = donuzHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeyBladeci() {
        return BeyBladeci;
    }

    public void setBeyBladeci(String BeyBladeci) {
        this.BeyBladeci = BeyBladeci;
    }

    public int getDonuzHizi() {
        return donuzHizi;
    }

    public void setDonuzHizi(int donuzHizi) {
        this.donuzHizi = donuzHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public void saldiriGucu(){
        System.out.println(getBeyBladeci()+" "+saldiriGucu+" "+donuzHizi+" ile saldırıyor...");
    }
    public void KutsalCanavarOrtayaCikar(){
        System.out.println("Bu BeyBlade nin kutsal canavarı yok");
    }
    public void BilgiGetir(){
        System.out.println("BeyBlade İsmi :"+BeyBladeci);
        System.out.println("Saldırı Gücü  :"+saldiriGucu);
        System.out.println("Dönüş Hızı    :"+donuzHizi);
    }
}
