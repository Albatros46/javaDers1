
public class main {

	public static void main(String[] args) {
	     IMuhendis muhendis1=new PcMuhendisi(false,false);
		 muhendis1.AdliSicilSorgula();
	     muhendis1.AskerlikDurumu();
	     muhendis1.MezuniyetOrtalmasi(2.95);
	     String[] tecrube={"Turkcell","Turk Telekom","Akbank IT","ING Bank IT Departman"};
	     muhendis1.Is_Tecrubesi(tecrube);
	     System.out.println("____________________");
	     MakineMuhendisi muhendis2= new MakineMuhendisi(true,false);
	     String[] tecrube2={"Devlet Demir Yollari","Eregli Demir Celik","MEM Tekstil","Kipas A.S.","Karsan","OTOKAR","BMC","Kalyon A.S.","Vs As."};
	     String[] referans={"Servet KOCA","Ahmet KARALÝ","Cabbar KOCOGLÝ","Cemil CUMBA","Tuba KAR"};
	     muhendis2.AdliSicilSorgula();
	     muhendis2.AskerlikDurumu();
	     muhendis2.MezuniyetOrtalmasi(3.17);
	     muhendis2.Is_Tecrubesi(tecrube2);
	     muhendis2.ReferansGetir(referans);
	     muhendis2.Calis();
	}

}
