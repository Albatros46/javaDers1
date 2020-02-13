package tr.com.srvtkcdg.utilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import tr.com.srvtkcdg.fe.kategoriEkleFe;
import tr.com.srvtkcdg.fe.urunEkleFe;

public class MenulerCom {
	public static JMenuBar initBar() {
		JMenuBar bar = new JMenuBar();// Menu bar olusturuldu
		JMenu dosyaMenu = new JMenu("Dosya"); // Menubar a Dosya menusu eklendi
		bar.add(dosyaMenu);
		JMenuItem cikis = new JMenuItem("��k��");// Alt menu eklendik
		dosyaMenu.add(cikis);
		// *********URUNLER MENUSU*******************
		JMenu urunlerMenu = new JMenu("�r�nler"); // Menubar a Urunler menusu eklendi
		bar.add(urunlerMenu);
		JMenuItem urunEkleItem = new JMenuItem("�r�n Ekle");// Alt menu ekledik
		urunlerMenu.add(urunEkleItem);
		JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
		urunlerMenu.add(kategoriEkleItem);
		urunlerMenu.addSeparator();
		JMenuItem urunDuzenleItem = new JMenuItem("�r�n D�zenle");
		urunlerMenu.add(urunDuzenleItem);
		JMenuItem kategoriDuzenleItem = new JMenuItem("Kategori D�zenle");
		urunlerMenu.add(kategoriDuzenleItem);
		
		urunEkleItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new urunEkleFe();

			}
		});
		
		kategoriEkleItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new kategoriEkleFe();
				
			}
			
		} );
		return bar;
	}
}
