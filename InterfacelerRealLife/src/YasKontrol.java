
public class YasKontrol implements IKullaniciKontrol{

     @Override
    public boolean Kullanici(Kullanici kullanici) {
        if (kullanici.getYasi()>=18) {
            return true;
        }
        return false;
    }

    boolean KontrolEt(Kullanici kullanici) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
