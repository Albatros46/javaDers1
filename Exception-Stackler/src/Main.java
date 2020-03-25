
public class Main {
    public static void main(String[] args){
        //Ic ice fonksiyonlar Exception yakalamak-ExceptionPropation olarak tanimlanir.
        /*
        */
       
        birincifonksiyon();//try blogunu burada da kullanabilirdik
       
    }
    
    public static void birincifonksiyon(){
        ikincifonksiyon();//try blogunu burada da kullanabilirdik
    }
    
    public static void ikincifonksiyon(){
        ucuncufonksiyon();//try blogunu burada da kullanabilirdik
    }
    
    public static void ucuncufonksiyon(){
    	try {
        int a=30/0;
    	}catch(ArithmeticException e) {
    		System.out.println("Bir sayý sifir (0)'a bolunemez!");
    		
    	}
    }
}
