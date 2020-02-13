package tr.com.srvtkcdg.core;

public class CoreFields {
	private String KullaniciAdi = "root";
	private String Parola = "";
	private String url = "jdbc:mysql://localhost:3306/satisvestok?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";

	public String getKullaniciAdi() {
		return KullaniciAdi;
	}

	public String getParola() {
		return Parola;
	}

	public String getUrl() {
		return url;
	}

}
