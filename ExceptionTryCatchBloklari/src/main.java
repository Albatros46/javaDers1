
public class main {
    public static void main(String[] args) {
	/* try{
        //exception olusabilecek kodlar
        }catch(//Exception turu){
        //exception olustugunda calismasini istedigimiz kodlar
        }	
        */
//        int a=30/0;//Unchecked Exception-ArithmeticException 
//        
//        int[] b={1,2,3,4,5};
//        System.out.println(b[6]);//6. index bulunmadigindan hata verecektir. ArithmeticException
//        
    	//Bir den fazla try-catch blogu yazilacak ise ozel den genele dogru yazilmalidir. 
    	//Asagida goruldugu gibi.
    	 try{
             int a=30/2;
             int[] b={1,2,3,4,5};
             System.out.println(b[6]);
         }
         catch(IndexOutOfBoundsException e){
             System.out.println("Dizin index boyunu astiniz");
             e.printStackTrace();
         }
         catch(ArithmeticException e){
             System.out.println("Bir sayi 0 a bolunemez..");
             e.printStackTrace();
         }
         catch(Exception e){
             System.out.println("Bir hata olustu");
             e.printStackTrace();//hatanin da ekrana yazilmasini istiyoruz
         }  
    }   
}
