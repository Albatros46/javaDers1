
public class Hesap {
	private int bakiye=10000;
	
	public void paraCek(int miktar) {
		bakiye-=miktar;
	}
	
	public void paraYatir(int miktar) {
		bakiye+=miktar;
	}
	
	public static void paraTransferi(Hesap hesap1, Hesap hesap2,int miktar) {
		hesap1.paraCek(miktar);
		hesap2.paraYatir(miktar);
	}
	
	public int getbakiye() {
		return bakiye;
	}
	
	public void setbakiye(int bakiye) {
		this.bakiye=bakiye;
	}
}
