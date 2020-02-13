package tr.com.srvtkcdg.interfaces;

import java.util.List;

public interface DALInterfaces<T> {
	// Generic bir yapi kullanacagiz.
	// Generic yapi ne tur veri gelirse gelsin geldigi turde islem yapacak
	// Int gelirse int olarak calisacak String gerlise String calisacak Float
	// gelirse Float calisacak demek
	void Insert(T entity); // Veri Eklemek icin
	// public <T> Insert (T entity) seklinde de kullanilabilir.

	List<T> GetAll(); // Veri Listelemek icin

	T Delete(T entity); // Veri Silmek icin

	void Update(T entity); // Veri Guncellemek icin

	List<T> GetById(int id); // Id ye gore liste halinde veri cekmek icin

}
