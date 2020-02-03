
public class Matematik {
    private static double pi=Math.PI;//Kullanim-1
    
    public static class alan{/*Alan class static tanimlandigi icin artik cagirilan yerde
                                Matematik class once cagirilmasina gerek kalmadi 
                              */
        public void daire_alan(int yariCap){
            System.out.println("Dairenin Yaricapi :"+(yariCap*yariCap*pi));//Kullanim-1 pi static tanimlandigi icin burada dogrudan kullandik
                                                            //Aksi takdirde yariCap*yariCap*Math.PI olarak kullanilirdi.
           
            
        }
        
        public static void kare_alan(int kenar){ //Metodumuz da Static 
            System.out.println("Karenin Alani :"+(kenar*kenar));
        }
    }
}
