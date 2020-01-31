
public class Kart {
	  private char Deger;
	    private boolean tahmin=false;

	  public char getDeger() {
			return Deger;
		}

		public void setDeger(char deger) {
			Deger = deger;
		}

		public boolean isTahmin() {
			return tahmin;
		}

		public void setTahmin(boolean tahmin) {
			this.tahmin = tahmin;
		}

	public Kart(char Deger) {
	        this.Deger = Deger;
	        
	  }
}
