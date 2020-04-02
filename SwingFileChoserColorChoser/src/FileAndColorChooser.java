
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class FileAndColorChooser extends javax.swing.JFrame {

    /**
     * Creates new form FileAndColorChooser
     */
    public FileAndColorChooser() {
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

        btnDosyaAc = new javax.swing.JButton();
        btnRenkDegis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtYaziAlani = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FileChooser ve Color Chooser");

        btnDosyaAc.setText("Dosya Aç");
        btnDosyaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosyaAcActionPerformed(evt);
            }
        });

        btnRenkDegis.setText("Renk Değiştir");
        btnRenkDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenkDegisActionPerformed(evt);
            }
        });

        txtYaziAlani.setColumns(20);
        txtYaziAlani.setRows(5);
        jScrollPane1.setViewportView(txtYaziAlani);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnDosyaAc)
                .addGap(51, 51, 51)
                .addComponent(btnRenkDegis)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDosyaAc)
                    .addComponent(btnRenkDegis))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDosyaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosyaAcActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        //Ok e basilirsa i ye deger gelecek Cancel e basilirsa farklı bir deger gelecek
        //APPROVE_OPTION --> ok e basilirsa
        int i=fc.showOpenDialog(this);
       
        if (i==JFileChooser.APPROVE_OPTION) {
            File file=fc.getSelectedFile();
            String icerik="";
            //Acilan dosyayi icerige aktaracagiz ilkonce icergi bos olarak baslattik
            //Acilan dosyayi okumak icin ise BufferdReader teknigini kullanacagiz 
            //cunku \n (bosluk)  gorene adar okumaya devam ediyor
            try(Scanner scanner= new Scanner(new BufferedReader(new FileReader(file)))){
            while(scanner.hasNextLine()){
                //hasNextLine taki bosluk gorene kadar okumaya devam et.
                icerik+=scanner.nextLine()+"\n"; //bir alt satira gecerek okumaya devam et bosluk gorene kadar
            }
            txtYaziAlani.setText(icerik); //okunan icerigi yazi alanina aktar.
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileAndColorChooser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnDosyaAcActionPerformed

    private void btnRenkDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenkDegisActionPerformed
        // ColoChooser color siniifndan bir obje oldugu icin:
        Color color=JColorChooser.showDialog(rootPane, "Bir Renk Seçin", Color.RED);
        txtYaziAlani.setForeground(color);
        
    }//GEN-LAST:event_btnRenkDegisActionPerformed

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
            java.util.logging.Logger.getLogger(FileAndColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileAndColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileAndColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileAndColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileAndColorChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDosyaAc;
    private javax.swing.JButton btnRenkDegis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtYaziAlani;
    // End of variables declaration//GEN-END:variables
}
