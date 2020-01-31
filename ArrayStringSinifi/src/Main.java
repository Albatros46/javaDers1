
public class Main {

	  public static void main(String[] args){
		  String a="Servet";
	        String b=new String("TURKIYE-Kahramanmaras");
	        System.out.println(b);
	        System.out.println("0. Index :"+b.charAt(0));
	        System.out.println("Kelimenin uzunlugu :"+b.length());
	        System.out.println("|------------------------|");
	        for (int i = 0; i < b.length(); i++) {
	            System.out.println(b.charAt(i));
	        }
	        System.out.println("____________________________");
	        System.out.println(b.startsWith("Ka"));//b string i Ka ile basliyorsa True baslamiyorsa False sonuc verecek
	        System.out.println(b.endsWith("sa"));//b string i as ile bitiyorsa True baslamiyorsa False sonuc verecek
	        System.out.println(b.indexOf("s"));//b string inde s harfi var mi kacinci index te yer aliyor
	        System.out.println(b.toLowerCase());//b string inde tüm harfleri kucuk harfe ceviriyor
	        System.out.println(b.toUpperCase());//b string inde tüm harfleri buyuk harfe ceviriyor
	        System.out.println("____________________________");
	        String a1="1923"; //String tanýmlanmis degeri
	        int b1=Integer.parseInt(a1); //integer degere aktariyoruz.
	        System.out.println(b1);
	        
	        int a2=1988;
	        String b2=String.valueOf(a2); //Integer tanimlanmis deger burada string e cevrildi.
	        System.out.println(b2);
	        
	  }
}

