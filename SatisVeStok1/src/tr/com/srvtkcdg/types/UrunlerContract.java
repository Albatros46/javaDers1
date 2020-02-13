package tr.com.srvtkcdg.types;

import java.sql.Date;

public class UrunlerContract {
	private int Id;
	private String Adi;
	private int kategoriId;
	private Date tarihi;
	private float fiyat;

	public float getFiyat() {
		return fiyat;
	}

	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}

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

	public int getKategoriId() {
		return kategoriId;
	}

	public void setKategoriId(int kategoriId) {
		this.kategoriId = kategoriId;
	}

	public Date getTarihi() {
		return tarihi;
	}

	public void setTarihi(Date tarihi) {
		this.tarihi = tarihi;
	}

	@Override
	public String toString() {

		return Id + " " + Adi + " " + " " + kategoriId + " " + tarihi + " " + fiyat;
	}
}
