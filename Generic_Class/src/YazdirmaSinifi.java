
public class YazdirmaSinifi<E> {
    // <E> anlami sana ne tur veri gelirse onu E olarak algila ve kullanilan yerlere gelen turde islem yap.
    public void Yazdir(E [] dizi){
    // e ye string gelirse string davran
    // e ye integer gelirse integer davran
    // e ye ogrenci gelirse ogrenci davran
        for(E e:dizi){
            System.out.println(e);
        }
    }
}
