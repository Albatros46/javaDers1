
public class ComplexKullaniciKontrol implements IKullaniciKontrol{


    @Override
    public boolean Kullanici(Kullanici kullanici) {//Kullanici adinin Se ile baslayanlar ve 18 yasindan buyuk olanlari kaydet
      if (kullanici.getYasi()>=18 && kullanici.getKullaniciAdi().startsWith("Se")) {
            return true;
        }
        return false;
    }
}
