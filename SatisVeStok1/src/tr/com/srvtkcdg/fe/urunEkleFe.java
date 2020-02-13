package tr.com.srvtkcdg.fe;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.applet.*;
import java.awt.datatransfer.*;
import tr.com.srvtkcdg.interfaces.FeInterfaces;

public class urunEkleFe extends JDialog implements FeInterfaces {

	public urunEkleFe() {
		initPencere();
	}

	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Ürün Kayýt Alaný"));
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);
		//setModalityType->Urun ekleme penceresi kapatilmadan diger ekrana tiklandiginda hata sesi cikaracak
		add(panel);
		setTitle("Ürün Ekle");
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel(new GridLayout(5, 2));
		JLabel adiLabel = new JLabel("Ürün Adý :",JLabel.RIGHT);
		panel.add(adiLabel);
		JTextField textAdi = new JTextField(15);
		panel.add(textAdi);
		JLabel kategoriLabel = new JLabel("Kategori Seçiniz :",JLabel.RIGHT);
		panel.add(kategoriLabel);
		JComboBox kategoriBox = new JComboBox();
		panel.add(kategoriBox);
		JLabel tarihLabel = new JLabel("Tarih Seçiniz :",JLabel.RIGHT);
		panel.add(tarihLabel);
		JDateChooser urunlerTarih= new JDateChooser();
		panel.add(urunlerTarih);
		JLabel fiyatLabel = new JLabel("Fiyat Giriniz :",JLabel.RIGHT);
		panel.add(fiyatLabel);
		JTextField textfiyat=new JTextField(15);
		panel.add(textfiyat);
		JButton kaydetButton=new JButton("Kaydet");
		panel.add(kaydetButton);
		JButton iptalButton=new JButton("Ýptal");	
		panel.add(iptalButton);
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
