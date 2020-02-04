
public class Program {
    public static class Matematik{
        public static void daire_alan(int yariCap){
            System.out.println("Dairenin Alani :"+(yariCap*yariCap*Math.PI));
        }
        
         public static void ucgen_cevresi(int a, int b, int c){
             System.out.println("Ucgenin Cevresi :"+a+b+c);
         }
         
         public static void karenin_alani(int kenar){
             System.out.println("Karenin alani :"+kenar*kenar);
         }
         
         public static void dikdortgenin_alani(int uzunK,int kisaK){
             System.out.println("Dikdortgenin Alani :"+uzunK*kisaK);
         }
    }
    
    public static class Fizik{
        public static void icCarpim(Vec vec1, Vec vec2){
            int iccarpim=vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println(vec1+" ile "+ vec2 + "ic carpimi :"+ iccarpim);
        }
    }
}
