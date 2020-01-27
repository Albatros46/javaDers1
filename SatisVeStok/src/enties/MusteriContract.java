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
public class MusteriContract {
   	private int Id;
	private String AdiSoyadi;
	private String CepTlf;
	private String Adres;
	private int sehirId;
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
	public String getCepTlf() {
		return CepTlf;
	}
	public void setCepTlf(String cepTlf) {
		CepTlf = cepTlf;
	}
	public String getAdres() {
		return Adres;
	}
	public void setAdres(String adres) {
		Adres = adres;
	}
	public int getSehirId() {
		return sehirId;
	}
	public void setSehirId(int sehirId) {
		this.sehirId = sehirId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id+" "+AdiSoyadi+" "+CepTlf+" "+sehirId+" "+Adres;
	} 
}
