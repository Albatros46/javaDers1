
public class Main {
    public static void main(String[] args) {
	Matematik.alan alan=new Matematik.alan();//Matematik icindeki Alan dan bir tane obje olusturduk.
        alan.daire_alan(5);
        
        Matematik.alan.kare_alan(20);//asagidaki gibi de kullanilabilir.
        alan.kare_alan(10);//Kare metodu da static tanimladi Alan objesinin bir kere tanimlanmasi yeterli olur.
    }
}
