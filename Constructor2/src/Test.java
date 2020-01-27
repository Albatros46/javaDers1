
public class Test {
    public static void main(String[] args){
    // account içine değer gönderilmeden çağıdıldığında default deger ne ise o gelsin
    // account.java dan varsayılan olarak yazılmış olan constructor kısmı çalışacak
    Account account1=new Account();
        System.out.println(account1.getIsim());
    Account account2=new Account("12","Akif Akcadag","marasli@gmail.com","536749641",3500.0);
    account2.BilgileriGoster();
    }
}
