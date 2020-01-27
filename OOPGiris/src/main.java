
public class main {
   public static void Main(String[] args) {
	Araba araba1=new Araba();
	araba1.renk="Kırmmızı";
	araba1.model="Sedan";
	araba1.kapılar=5;
	araba1.tekerler=4;
	araba1.motor="16 V";
	System.out.print(araba1.model);
        
       Konut konut1=new Konut();
       konut1.setKonut("Paşa Konağı");
       System.out.println("Kiralık Konut :"+konut1.getKonut());
    } 
}
