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
public class AccountsContract {
    	private int Id;
	private int yetkiId;
	private int personelId;
	private String sifre;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getYetkiId() {
		return yetkiId;
	}
	public void setYetkiId(int yetkiId) {
		this.yetkiId = yetkiId;
	}
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id + " "+yetkiId +" "+ personelId +" " + sifre;
	}
}
