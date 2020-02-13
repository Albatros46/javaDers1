package tr.com.srvtkcdg.types;

public class PersonelContract {
	private int Id;
	private String AdiSoyadi;
	private String Eposta;

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

	public String getEposta() {
		return Eposta;
	}

	public void setEposta(String eposta) {
		Eposta = eposta;
	}

	@Override
	public String toString() {

		return Id + " " + AdiSoyadi + " " + Eposta;
	}
}
