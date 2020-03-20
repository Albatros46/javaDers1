
public class Hasta implements Comparable<Hasta>{
	//Oncelik sirasina gores siraya gecmesini saglamak icin Comparable yi implement etmek zorunda
    private String isim;
    private String sikayet;
    private int oncelik;

    public Hasta(String isim, String sikayet, int oncelik) {
        
        this.isim = isim;
        this.sikayet = sikayet;
        this.oncelik=oncelik;
        if (sikayet.equals("Apandist")) {
            this.oncelik=3;
        }else if (sikayet.equals("Yanik")) {
            this.oncelik=2;
        }else if (sikayet.equals("Bas Agrisi")) {
            this.oncelik=1;
        }else{
            System.out.println("Sikayetinizi Nedir? ");
        }
    }

    @Override
    public String toString() {
        String Bilgiler="Hasta Adi: "+isim
                        +"\nSikayeti : "+sikayet
                        +"\nOncelik  : "+oncelik;
        return Bilgiler;
        //return "Hasta{" + "isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + '}';
    }

    @Override
    public int compareTo(Hasta hasta) {
        if (this.oncelik>hasta.oncelik) {
            return -1;
        }else if(this.oncelik<hasta.oncelik){
            return 1;
        }else{
            return 0; //her ikisinin de onceligi esit ise kim once geldiyse o onde olacak
        }
    }
    
}
