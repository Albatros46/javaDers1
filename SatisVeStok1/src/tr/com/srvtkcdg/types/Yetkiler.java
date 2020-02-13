package tr.com.srvtkcdg.types;

public class Yetkiler {
	private int Id;
	private String Adi;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAdi() {
		return Adi;
	}

	public void setAdi(String adi) {
		Adi = adi;
	}

	@Override
	public String toString() {

		return Id + " " + Adi;
	}
}
