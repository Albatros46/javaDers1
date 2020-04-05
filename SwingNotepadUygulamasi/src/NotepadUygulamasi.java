
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KCDG
 */
public class NotepadUygulamasi extends javax.swing.JFrame {

    /**
     * Creates new form NotepadUygulamasi
     */
    public NotepadUygulamasi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        yaziAlani = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuDosyaAc = new javax.swing.JMenuItem();
        menuDosyaKaydet = new javax.swing.JMenuItem();
        menuCikis = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Not Defteri v1.1");
        setLocation(new java.awt.Point(400, 170));

        yaziAlani.setColumns(20);
        yaziAlani.setRows(5);
        jScrollPane1.setViewportView(yaziAlani);

        jMenu4.setText("Dosya");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        menuDosyaAc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuDosyaAc.setText("Dosya Aç");
        menuDosyaAc.setActionCommand("DosyaAc");
        menuDosyaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDosyaAcActionPerformed(evt);
            }
        });
        jMenu4.add(menuDosyaAc);

        menuDosyaKaydet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuDosyaKaydet.setText("Dosya Kaydet");
        menuDosyaKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDosyaKaydetActionPerformed(evt);
            }
        });
        jMenu4.add(menuDosyaKaydet);

        menuCikis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuCikis.setText("Çıkış");
        menuCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCikisActionPerformed(evt);
            }
        });
        jMenu4.add(menuCikis);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Düzenle");

        jMenu2.setText("Renk");

        jMenuItem1.setText("Renk Değiştir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu5.add(jMenu2);

        jMenu3.setText("Yazı Tipi");

        jMenuItem2.setText("Arial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Times New Roman");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu5.add(jMenu3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuDosyaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDosyaAcActionPerformed
          // Dosya Aç menüsü
        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(this);
        if (i==JFileChooser.APPROVE_OPTION) {
            File file=fc.getSelectedFile();
            try(Scanner scanner=new Scanner(new BufferedReader(new FileReader(file)))){
                String icerik="";
                while(scanner.hasNextLine()){
                    icerik+=scanner.nextLine()+"\n";
                }
                //Secilen dosyaya gore icerik degiskenin ici yazi alanina aktarilacak
                yaziAlani.setText(icerik);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NotepadUygulamasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuDosyaAcActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
      
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void menuDosyaKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDosyaKaydetActionPerformed
        // Dosyayi Kaydet menusu
        JFileChooser fc=new JFileChooser(); //Dosya secici olusturduk
        int cevap=fc.showSaveDialog(this); 
        // show dialog dan gelecek cevap sayisal deger oldugu icin
        // Sifir(0)-> APPROVE_OPTION --> ok a basildiginda
        if (cevap==JFileChooser.APPROVE_OPTION) {
            String dosyaYolu=fc.getSelectedFile().getPath();
            //Kaydedecegimiz dosya yolunu seciyoruz
            try(FileWriter yazici=new FileWriter(dosyaYolu)){
                //Dosya yolunu yazici degiskenine aktartiktan sonra 
                yazici.write(yaziAlani.getText());
                //yaziAlani(TextArea) icindeki veriyi yazici degiskenine aktarip kaydediyoruz.
            } catch (IOException ex) {
                Logger.getLogger(NotepadUygulamasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuDosyaKaydetActionPerformed

    private void menuCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCikisActionPerformed
        // Çıkış menüsü
        System.exit(0); //cikis
    }//GEN-LAST:event_menuCikisActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Renk Degistir Menüsü
        // Color sinifindan bir obje urettik. ve color penceresini actirdik
        Color color=JColorChooser.showDialog(this,"Renk Seçiniz",Color.RED);
        yaziAlani.setForeground(color); //textarea(yaziAlani) icindeki yazinin rengini degistirdik
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Yazı Tipi-->Arial menusu
        Font font=new Font("Arial",Font.PLAIN,14);
        yaziAlani.setFont(font);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Yazi Tipi-->times new roman menusu
        Font font=new Font("Times New Roman",Font.PLAIN,14);
        yaziAlani.setFont(font);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuCikis;
    private javax.swing.JMenuItem menuDosyaAc;
    private javax.swing.JMenuItem menuDosyaKaydet;
    private javax.swing.JTextArea yaziAlani;
    // End of variables declaration//GEN-END:variables
}