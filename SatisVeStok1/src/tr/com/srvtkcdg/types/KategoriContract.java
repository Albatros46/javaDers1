package tr.com.srvtkcdg.types;

public class KategoriContract {
	private int Id;
	private String Adi;
	private int ParentId;

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

	public int getParentId() {
		return ParentId;
	}

	public void setParentId(int parentId) {
		ParentId = parentId;
	}

	@Override
	public String toString() {

		return  Adi;
	}
}
