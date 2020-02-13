package tr.com.srvtkcdg.types;

import java.sql.Date;

public class SatisContract {
	private int Id;
	private int personelId;
	private int musteriId;
	private int adet;
	private int UrunId;
	private Date SatisTarihi;

	public int getUrunId() {
		return UrunId;
	}

	public void setUrunId(int urunId) {
		UrunId = urunId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public int getMusteriId() {
		return musteriId;
	}

	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	public Date getSatisTarihi() {
		return SatisTarihi;
	}

	public void setSatisTarihi(Date satisTarihi) {
		SatisTarihi = satisTarihi;
	}

	@Override
	public String toString() {

		return Id + " " + personelId + " " + musteriId + " " + UrunId + " " + adet + " " + SatisTarihi;
	}
}
