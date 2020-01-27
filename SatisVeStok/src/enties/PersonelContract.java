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
public class PersonelContract {
    	private int Id;
	private String AdiSoyadi;
	private String eposta;
	
	
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
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id +" "+ AdiSoyadi +" "+ eposta;
	}
}
