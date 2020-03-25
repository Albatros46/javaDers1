
public class main {
    public static void main(String[] args){
        //dosya kapama yada veri tabani kapama-acma gibi kodlarimizi finallu blogu arasina yazacagiz
        try{
            String s=null;
            System.out.println(s.hashCode());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Hatasi..");
            e.printStackTrace();
        }
        finally{//yukaridaki hatalari gerceklessede kesinlikle calismasini istedigimiz kodlari buraya yaziyoruz
        		//her durumda calisacaktir burasi
        	//catch bloguna yakalanmasada kesinlikle calisacakir finally blogu
            //finally blogu: hata olsa da olmasa da calisacaktir.
            System.out.println("Finally blogu calisiyor...");
        }
    }
}
