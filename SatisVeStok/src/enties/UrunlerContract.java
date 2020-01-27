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
public class UrunlerContract {
    private int id;
	private String adi;
	private int kategoriId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public int getKategoriId() {
		return kategoriId;
	}
	public void setKategoriId(int kategoriId) {
		this.kategoriId = kategoriId;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	private Date tarih;
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return id+" "+adi+" "+kategoriId+" "+ tarih;
    }
}
