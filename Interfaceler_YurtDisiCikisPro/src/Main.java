
public class Main {
    public static void main(String[] args) throws InterruptedException {
	System.out.println("Ataturk Havalimanina Hosgeldiniz");	
        String kurallar="Yurtdisi Cikis Kurallari\n"
                + "Yurtdisi cikis yasaginiz bulunmamasi lazim.\n+"
                + "50 TL Yurtdisi cikis harc bedelini odemelisiniz\n+"
                + "Gidecginiz Ulkeye vizenizin olmasý lazim.\n";
        String message="Yurtdisi cikis kurallarindan en az birini saglamaniz gerek...";
        while(true){
            System.out.println("******************************************");
            System.out.println(message);
            System.out.println("******************************************");
            Yolcu yolcu=new Yolcu();
            System.out.println("Harc Bedeli Kontrol Ediliyor... ");
            Thread.sleep(3000);//3 saniye bekleyecek program
            if (yolcu.YurDisiHarci()==false) {
                System.out.println(message);
                continue;// dongunun basina gidecek
            }
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);//3 saniye bekleyecek program
            
            if (yolcu.VizeDurumu()==false) {
                System.out.println(message);
                continue;// dongunun basina gidecek
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);//3 saniye bekleyecek program
            
            System.out.println("Islemleriniz TAMAM. Yurtdisina Cikabilirsiniz.");
            break;
        }
    }
}
