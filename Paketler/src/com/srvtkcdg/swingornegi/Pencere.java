
package com.srvtkcdg.swingornegi;

import javax.swing.*;//swing kutuphanesindeki tum objeleri kullan


public class Pencere {
    private JFrame jframe;
    
    public Pencere(){
        jframe=new JFrame();
        JButton button=new JButton("TAMAM");
        button.setVisible(true);
        jframe.add(button);
        jframe.setSize(400,500);
        jframe.setLayout(null);
        jframe.setVisible(true);
        
    }
    public static void main(String[] args) {
	
    }
}
