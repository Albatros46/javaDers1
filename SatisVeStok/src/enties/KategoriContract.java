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
public class KategoriContract {
    	private int Id;
	private String adi;
	private int parentId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	} 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id + " " + adi + " " + parentId;
	}
}
