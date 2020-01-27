
public class main {
    public static void main(String[] args) {
	Account account1=new Account("101","Oğuz AKCADAG","oguz@gmail.com","53641850",2750.75);//Bellekte yeni obje oluşturduk
        Account account2=account1;//account2 objesi bellekte referans olarak account1 e eşit
        Account account3=new Account("105","CAMALİ AKCADAG","marasli@gmail.com","9685732",1385.75);//bellekte yeni bir obje oluşturduk.
        if (account1==account2) {
            System.out.println("account2 referans olarak account1 i göstermektedir.");
        }else if (account1!=account3) {
            System.out.println("account3 referans olarak account1 den farklı göstermektedir.");
        }
        //referans oluşturmadan tek satırlık da işlem yapılabilir.
        //fakat ileride kullanamayız. Bu yöntem sadece referans gerektirmeyen durumdarda kullanılır.
        new Account("285","cuma AKCADAG","cuma@gmail.com","8567412",3857.75).BilgileriGoster();
    }
}
