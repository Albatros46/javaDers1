
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadLockOrnegi {
    private Hesap hesap1=new Hesap();
    private Hesap hesap2=new Hesap();
    private Random random=new Random();
    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();
    /*2 hesap oldugu icin 2 tane farkli anahtar urettik. 
    Random deger ise para transferi icin rastgele deger uretecek
    */
    public void th1Fonksiyonu(){
        //Hesap1 den Hesap2 ye 5000 defa para transferi gerceklesecek
        //Lock lar kullanikmadan calistiginda her calisma durumunda hesaplar 
        //senkron olmadigi icin farkli sonuclar gostermektedir.
        //LockKontrol metodunda yazdigimiz gibi her iki anahtar ayni anda elde edilence fonksiyonumuz calisacak
        LockKontrol(lock1, lock2);
        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(250));
        }
        lock1.unlock(); 
        lock2.unlock();
    }
    //--------------------------------------------------------------------------------
    public void th2Fonksiyonu(){
        //Hesap2 den Hesap1 ye 5000 defa para transferi gerceklesecek
        //senkron olmadigi icin farkli sonuclar gostermektedir.
        //LockKontrol metodunda yazdigimiz gibi her iki anahtar ayni anda elde edilence fonksiyonumuz calisacak
        LockKontrol(lock2, lock1);
        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap2, hesap1, random.nextInt(250));
        }
        lock1.unlock(); 
        lock2.unlock(); 
    }
    //--------------------------------------------------------------------------------
    public void thOver(){
        System.out.println("Hesap 1'in Bakiyesi :"+hesap1.getbakiye()+" Hesap 2'nin Bakiyesi : "+hesap2.getbakiye());
        System.out.println("Toplam Bakiye : "+(hesap1.getbakiye()+hesap2.getbakiye()));
    }
    
    public void LockKontrol(Lock a, Lock b){
        /*Locklar kontrol edilmeden kullanilacagi icin bazi durumlarda thread1 bazi durumlarda thread2 den 
        lock gelmesini bekleyecektir. Bu bekleme esnasinda deadlock olusacak bunun onune gecmek icin 
        yazacagimiz metod ile locklari denetecegiz.
        */
        
        boolean a_alindi=false;
        boolean b_alindi=false;
        
        while(true){
        //Sonsuz dongu olusturduk. Ne zaman iki anahtar elde edilirse donguden cikacak   
        a_alindi=a.tryLock();
        b_alindi=b.tryLock();
            if (a_alindi==true && b_alindi==true) {
                return; //break; 
            }
            if (a_alindi==true) {
                //sadece a anahatari alindiysa serbest birak deadlock olusmasin
                a.unlock();
            }
            if (b_alindi==true) {
                //sadece b anahatari alindiysa serbest birak deadlock olusmasin
                b.unlock();
            }
        }
    }
}
