
public class Araba {
    //----Erişim Belirleyiciler
	// public : Başka java dosyalarından doğrudan erişim sağlanabilir
	// private : başka java dosyalarında doğrudan erişim sağlanamaz. dolaylı olarak sağlanır
	// protected :
        //public erişim olanlara başka java dosyasından direkt erişim sağlanır.
	public String renk; // araba nesnesini public tanımlayarak başka java dosyalarında kullanılmasına izin verdik.
	public int kapılar;
	public int tekerler;
	public String motor;
	public String model;
        
        //private erişim şekli olanlara başka java dosyasından direkt erişim olmaz; dolaylı erişim sağlanır
       
        
    public void setModel(String model){ // konut değişkenine erişim sağlayıp veri girmek için "set" kullanılır
        this.model=model;
    }
    
    public String getModel(){ // konut verisini okumak için "get" kullanılmaktadır.
        //return konut;    //her iki kullanım şeklide yapılanilir.
        return this.model;
    }
}
