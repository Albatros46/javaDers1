
public class BeyBladeUretim {
    public BeyBlade BeyBlade_Uret(String BeyBlade_Turu){
        if (BeyBlade_Turu.equals("Dragon")) {
            return new Dragon("Takao ", 800, 600," Mavi Ejderha", " Kusal Canavarla Konuşma");
        }else if (BeyBlade_Turu.equals("Dranza")) {
            return new Dranza("Kai  ", 650, 400," Kırmızı Anka Kuşu");
        }else if (BeyBlade_Turu.equals("Draciel")) {
            return new Draciel("Rei  ", 700, 500," Kırmızı Anka Kuşu");
        }else if (BeyBlade_Turu.equals("Drayga")) {
            return new Drayga("Max  ", 680, 575," Kara Kaplumbağa");
        }else{
            return null;
        }
    }
}
