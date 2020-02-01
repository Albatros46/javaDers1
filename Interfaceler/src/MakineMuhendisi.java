
public class MakineMuhendisi implements IMuhendis,ICalisma{
    @Override
	public void Calis() {
		// TODO Auto-generated method stub
    	 System.out.println("Makine Muhendisi Calisiyor");
	}

	private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    @Override
    public void AdliSicilSorgula() {
       if (adliSicil) {
             System.out.println("Adli Sicil Kaydi VARR");
        }else{
             System.out.println("Herhangi bir adli Sicil Kaydi Bulunmamaktadir.");
        }
    }

    @Override
    public void AskerlikDurumu() {
        if (askerlik) {
            System.out.println("Askerligini Yapti.");
        }else{
            System.out.println("Askerligimi Henuz Tamamlamadim...");
        }
    }

    @Override
    public void Is_Tecrubesi(String[] array) {
        if (array.length==0) {
            System.out.println("Herhangi Bir Tecubem Bulunmuyor");
        }else{
            System.out.println("Makine Muhendisi olarak;");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            System.out.println("firmalarinda calistim.");
        }
    }

    @Override
    public String MezuniyetOrtalmasi(double derece) {
      return "Ortalama :"+ derece;
    }
    
    public void ReferansGetir(String[] array){
        if (array.length==0) {
            System.out.println("Herhangi bir referansim yok."); 
        }else{
            System.out.println("Referanslarim :");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
