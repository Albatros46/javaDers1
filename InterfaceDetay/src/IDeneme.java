
public interface IDeneme {
    //Innterface ye ozellik eklemek istiyorsaniz;
    // public olamli ve degeri interface icinde verilmelidir.
    //static veya final kullanilmasina gerek yok cunku java interface oldugu icin kendisi ceviriyi yapiyor.
    //Interface ler e sadece bu sekilde tanimlama yapilarak ozellik eklenebilir.
    public int a=4;
    public int b=5;
    
    public String Deneme="Kahramanmaras"; //Static yazilmasina gerek yok 
    
    public final int c=6; //ýnterfaceler de constructur yazamadigimiz icin degerini burada veririz.
    //final kullanmadan da ayni islemi gormektedir. 
    
    public static void deneme(){ //interface icine metod yazmak icin kesinlikle static olmalidir.
        System.out.println("Deneme");
    }
}
