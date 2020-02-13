package tr.com.srvtkcdg.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tr.com.srvtkcdg.types.KategoriContract;
import tr.com.srvtkcdg.core.ObjectHelper;
import tr.com.srvtkcdg.interfaces.DALInterfaces;

/*Objectifhelperdaki T degikeni kategori den gelen veriye gore calisacak
 * T nin generic tanimlanmasinin sebebi budur.
 * */
public class KategoriDal<KategoriContract> extends ObjectHelper implements DALInterfaces<KategoriContract> {

	@Override
	public void Insert(KategoriContract entity) {
		Connection connection=getConnection();
		try {
			Statement statement=(Statement) connection.createStatement();
			 statement.executeUpdate("INSERT INTO Kategori(Adi, ParentId)VALUES('"+((tr.com.srvtkcdg.types.KategoriContract) entity).getAdi()+"',"
                     +((tr.com.srvtkcdg.types.KategoriContract) entity).getParentId()+")");
             statement.close();
             connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public List<KategoriContract> GetAll() {
		List<KategoriContract> dataContract=new ArrayList<KategoriContract>();	
		Connection connection=getConnection();
		KategoriContract contract;
		
		
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("SELECT*FROM Kategori");
			
			
			while(resultSet.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public KategoriContract Delete(KategoriContract entity) {

		return null;
	}

	@Override
	public void Update(KategoriContract entity) {

	}

	@Override
	public List<KategoriContract> GetById(int id) {

		return null;
	}

}
