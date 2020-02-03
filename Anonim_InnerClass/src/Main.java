
public class Main {
    public static void main(String[] args) {
	/*
            Herhangi bir class tanimlama olmadan bir tane obje olusturabiliriz.
            Herhangi bir interface den/metoddan override veya implement edilerek kullanilabilir.
        */	
        IOgrenci ogrenci=new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders calisiyorum...");
            }

            @Override
            public void sinava_calis() {
                System.out.println("Sinava Daima Hazirimmm...");
            }
        }; //Class tanimlamasi oldugu icin ; kullaniriz.
        ogrenci.ders_calis();
        ogrenci.sinava_calis();
        System.out.println("------------------------------");
        AOgrenci ogrenci2=new AOgrenci("Servet",220) {
            @Override
            void Kayit_Yaptir() {
                System.out.println(getIsim()+" Ogrenci Nu.: "+getNumara()+" Kayit Yaptirdim, Ders Sectim...");
            }
        };
        ogrenci2.Kayit_Yaptir();
        ogrenci2.DonemYenile();
    }
    public static abstract class AOgrenci{ //govdeli abstract class oldugu icin static olmasi lazim.
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        abstract void Kayit_Yaptir();
        public void DonemYenile(){
            System.out.println("Bahar Donem Harci Yatirdim...");
        }
    }
    public interface IOgrenci {
        void ders_calis();
        void sinava_calis();
    }
}
