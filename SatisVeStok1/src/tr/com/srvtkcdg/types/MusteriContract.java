package tr.com.srvtkcdg.types;

public class MusteriContract {
	private int Id;
	private String AdiSoyadi;
	private String Telefon;
	private String Adres;
	private int SehirId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAdiSoyadi() {
		return AdiSoyadi;
	}

	public void setAdiSoyadi(String adiSoyadi) {
		AdiSoyadi = adiSoyadi;
	}

	public String getTelefon() {
		return Telefon;
	}

	public void setTelefon(String telefon) {
		Telefon = telefon;
	}

	public String getAdres() {
		return Adres;
	}

	public void setAdres(String adres) {
		Adres = adres;
	}

	public int getSehirId() {
		return SehirId;
	}

	public void setSehirId(int sehirId) {
		SehirId = sehirId;
	}

	@Override
	public String toString() {

		return Id + " " + AdiSoyadi + " " + Telefon + " " + SehirId + " " + Adres;
	}

}
