package tr.com.srvtkcdg.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import tr.com.srvtkcdg.interfaces.CoreInterfaces;

public class ObjectHelper extends CoreFields implements CoreInterfaces {
	// Veritabani baglantisini CoreInterfaceden implement ediyoruz
	// Veritabanina erisim icin gerekli alani ise CoreFields den miras aliyoruz
	static { // jdbc nin projemize tanitilmasi
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Connection getConnection() {
		Connection connection = null; // Veritabanina baglanti olusturuluyor
		try {
			connection = DriverManager.getConnection(getUrl(), getParola(), getKullaniciAdi());
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;
	}

}
