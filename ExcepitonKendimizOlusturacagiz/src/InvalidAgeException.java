



public class InvalidAgeException extends ArithmeticException {
/*  ArithmeticException dan bir tane class turettik
    Unchecked Exception oldugu icin InvalidAgeException bir Unchecked
    Eger IOException u extends etseydik main.java da yasKontrol de InvalidAgeException i throws etmemiz gerek 
    IOException dan extends etseydik bu sefer CheckedException olurdu.
    Dosyamizi bir baskasi Api/jar olarak kullanmak isterse de InvalidAgeException'i kendisi yakalamak zorundadir.
*/  
    public InvalidAgeException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir InvalidAgeException Hatasidir!");
        super.printStackTrace(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
