package tr.com.srvtkcdg.fe;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import tr.com.srvtkcdg.interfaces.FeInterfaces;
import tr.com.srvtkcdg.utilities.MenulerCom;

//AnaPencerenin Tasarimlari burada yapilirken cagirilip calismasi run.java da yapilmaktadir.
public class AnaPencereFe extends JFrame implements FeInterfaces {

	public static void main(String[] args) {

	}

	public AnaPencereFe() {
		initPencere();
	}

	@Override
	public void initPencere() {

		JTabbedPane tabs = initTabs();
		JMenuBar bar = initBar();

		// add(tabs);
		setJMenuBar(bar);
		setTitle("Satýþ Ve Stok Takip Programý"); // Pencerenin basligi
		setSize(400, 600);// Pencerenin boyutunu belirledik
		pack(); // penceredeki nesneler pencereye gore konumlansin
		setVisible(true); // Pencere gorunsun
		setLocationRelativeTo(null);// pencere acildiginde direct merkezde acilsin.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel();

		return panel;
	}

	@Override
	public JMenuBar initBar() {
		JMenuBar bar = MenulerCom.initBar();// MenulerCom da olusturdugumuz menuleri cagirdik.
		return bar;

	}

	@Override
	public JTabbedPane initTabs() {
		JTabbedPane tabs = new JTabbedPane();

		return tabs;
	}

}
