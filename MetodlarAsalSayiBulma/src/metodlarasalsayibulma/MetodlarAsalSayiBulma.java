
package metodlarasalsayibulma;


public class MetodlarAsalSayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	for (int i=2;i<1000;i++) {
			if (asalMi(i)) {
				System.out.println("1-1000 arasındaki asal sayılar :"+i);
			}
		}
    }
    
    public static boolean asalMi(int sayi) {
		for (int i=2; i< 1000; i++) {
			if (sayi % i==0) {
				return false;
			}
		}
		return true;
	}
    
}
