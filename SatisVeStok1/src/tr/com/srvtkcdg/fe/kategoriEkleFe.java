package tr.com.srvtkcdg.fe;

import com.toedter.calendar.JDateChooser;
import java.awt.GridLayout;
import javax.swing.*;

import tr.com.srvtkcdg.dal.KategoriDal;
import tr.com.srvtkcdg.interfaces.FeInterfaces;

public class kategoriEkleFe extends JDialog implements FeInterfaces{

	public kategoriEkleFe () {
		initPencere();
	}
	
	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		
		setTitle("Kategori Ekle");
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);
		add(panel);
		setTitle("Kategori Ekle");
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);//pencereden cikis yapma sec
	}

	@Override
	public JPanel initPanel() {
		
		JPanel panel = new JPanel(new GridLayout(3, 2));
		JLabel adiLabel = new JLabel("Kategori Adý :",JLabel.RIGHT);
		panel.add(adiLabel);
		JTextField textAdi = new JTextField(15);
		panel.add(textAdi);
		JLabel kategorisecLabel = new JLabel("Kategori Seç :",JLabel.RIGHT);
		panel.add(kategorisecLabel);
		JComboBox kategoriSecbox=new JComboBox(new KategoriDal().GetAll().toArray());
		panel.add(kategoriSecbox);
		kategoriSecbox.insertItemAt("**Kateegori Seçiniz**", 0);
		kategoriSecbox.setSelectedIndex(0);
		JButton kaydetButton=new JButton("Kaydet");
		panel.add(kaydetButton);
		JButton iptalButton=new JButton("Ýptal");	
		panel.add(iptalButton);
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
