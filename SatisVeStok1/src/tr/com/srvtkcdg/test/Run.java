package tr.com.srvtkcdg.test;

import javax.swing.SwingUtilities;

import tr.com.srvtkcdg.fe.AnaPencereFe;

public class Run {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() { // AnaPencereFe yi burada cagiriyoruz
				new AnaPencereFe();

			}
		});

	}

}
