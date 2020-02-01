
public class PcMuhendisi implements IMuhendis {
	private boolean askerlik;
	private boolean adli_sicil;
	
	public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
		super();
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void AdliSicilSorgula() {
		  if (adli_sicil) {
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
	            System.out.println("Askerligimi Henus Tamamlamadim...");
	      }
		
	}

	@Override
	public void Is_Tecrubesi(String[] array) {
		 System.out.println("Yazilimci olarak asagidaki firmalarda calistim");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	}

	@Override
	public String MezuniyetOrtalmasi(double derece) {
		 
		return "Ortalamasi :"+ derece;
	}



	
}
