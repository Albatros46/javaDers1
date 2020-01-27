
public class Test { // KALITIM-Inheritance
    public static void main(String[] args) {
	// Bir sınıfın başka bir sınıftan özelliklerini ve metodlarını miras alması KALITIM dır.
	Yonetici yonetici1=new Yonetici("Servet","IT",5682.0,20);
        yonetici1.BilgiGetir();	
        yonetici1.zam_yap(350.0);
        Yonetici yonetici2=new Yonetici("Ahmet","Veteriner",3250.75,3);
        yonetici2.BilgiGetir();
	}

}
