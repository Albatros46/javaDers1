/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enties;

/**
 *
 * @author KCDG
 */
import java.sql.Date;
public class SatisContract {
   private int Id;
	private int musteriId;
	private int personelId;
	private int urunId;
	private int adet;
	private float fiyat;
	private float tutar;
	private Date tarih;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getMusteriId() {
		return musteriId;
	}
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	public int getUrunId() {
		return urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public float getFiyat() {
		return fiyat;
	}
	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}
	public float getTutar() {
		return tutar;
	}
	public void setTutar(float tutar) {
		this.tutar = tutar;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id+" "+musteriId+" "+personelId+" "+urunId+""+fiyat+" "+adet+" "+tutar+" "+tarih;
	}
}
