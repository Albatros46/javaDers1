package tr.com.srvtkcdg.types;

import java.sql.Date;

public class StokContract {
	private int Id;
	private int personelId;
	private int urunId;
	private Date StokTarihi;
	private int adet;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getpersonelId() {
		return personelId;
	}

	public void setpersonelId(int personelId) {
		this.personelId = personelId;
	}

	public int getUrunId() {
		return urunId;
	}

	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}

	public Date getStokTarihi() {
		return StokTarihi;
	}

	public void setStokTarihi(Date stokTarihi) {
		StokTarihi = stokTarihi;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	@Override
	public String toString() {

		return Id + " " + personelId + " " + urunId + " " + StokTarihi + " " + adet;
	}
}
