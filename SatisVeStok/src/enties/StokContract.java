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
public class StokContract {
    private int Id;
	private int personelId;
	private int urunId;
	private Date tarih;
	private int adet;
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
	public int getUrunId() {
		return urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id+" "+personelId+" "+urunId+" "+tarih+" "+adet;
	}
}
