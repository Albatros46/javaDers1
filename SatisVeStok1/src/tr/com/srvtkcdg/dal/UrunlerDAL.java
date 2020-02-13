package tr.com.srvtkcdg.dal;

import java.util.List;

import tr.com.srvtkcdg.core.ObjectHelper;
import tr.com.srvtkcdg.interfaces.DALInterfaces;

public class UrunlerDAL<UrunlerContract> extends ObjectHelper implements DALInterfaces<UrunlerContract> {

	@Override
	public void Insert(UrunlerContract entity) {

	}

	@Override
	public List<UrunlerContract> GetAll() {
		return null;
	}

	@Override
	public UrunlerContract Delete(UrunlerContract entity) {
		return null;
	}

	@Override
	public void Update(UrunlerContract entity) {

	}

	@Override
	public List<UrunlerContract> GetById(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

}
