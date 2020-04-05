
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KCDG
 */
public class StokUygulamasi extends javax.swing.JFrame {

    /**
     * Creates new form StokUygulamasi
     */
    public StokUygulamasi() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUrunAdi = new javax.swing.JTextField();
        jcmbKategori = new javax.swing.JComboBox<>();
        txtFiyat = new javax.swing.JTextField();
        mesajYazisi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUrunTablosu = new javax.swing.JTable();
        jbtnEkle = new javax.swing.JButton();
        jbtnGuncelle = new javax.swing.JButton();
        jbtnUrunSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Uygulaması v1.1");
        setResizable(false);

        jLabel1.setText("Ürün İsmi");

        jLabel2.setText("Kategori");

        jLabel3.setText("Fiyat");

        jcmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elektronik", "Tekstil", "Kırtasiye", "Bahçe", "Oto Aksesuar" }));

        mesajYazisi.setForeground(new java.awt.Color(255, 0, 0));

        jtbUrunTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        ));
        jtbUrunTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUrunTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUrunTablosu);

        jbtnEkle.setText("Ürün Ekle");
        jbtnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEkleActionPerformed(evt);
            }
        });

        jbtnGuncelle.setText("Ürün Güncelle");
        jbtnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuncelleActionPerformed(evt);
            }
        });

        jbtnUrunSil.setText("Ürün Sil");
        jbtnUrunSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUrunSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUrunAdi)
                                    .addComponent(jcmbKategori, 0, 180, Short.MAX_VALUE)
                                    .addComponent(txtFiyat))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnUrunSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnEkle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnGuncelle))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnUrunSil))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEkleActionPerformed
        // TODO add your handling code here:
        mesajYazisi.setText("  ");
        DefaultTableModel model=(DefaultTableModel) jtbUrunTablosu.getModel();
        if (txtUrunAdi.getText().trim().equals(" ")) {
        //Bastaki ve sondaki bosluklari silmesi icin trim metodu kullandik ve guncel string getirdik
        mesajYazisi.setText("Ürün Adi Boş Bırakılamaz...");
        
        }else{
             Object[] eklenecek = {txtUrunAdi.getText(),jcmbKategori.getSelectedItem().toString(),txtFiyat.getText()};
            
            model.addRow(eklenecek);
        }
    }//GEN-LAST:event_jbtnEkleActionPerformed

    private void jbtnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuncelleActionPerformed
        // TODO add your handling code here:
        mesajYazisi.setText(" ");
        DefaultTableModel model=(DefaultTableModel) jtbUrunTablosu.getModel();
        
        int secili_satir=jtbUrunTablosu.getSelectedRow();
        
        if (secili_satir==-1) {
            //Eger tablo icinde bir satira tiklanmadi ise deger -1 donecek
            if (jtbUrunTablosu.getRowCount()==0) {
               mesajYazisi.setText("Ürün tablosu şuan da boş");
            }else{
               mesajYazisi.setText("Lütfen Güncellenecek bir ürün seçiniz.");
            }
        }else{
           
           model.setValueAt(txtUrunAdi.getText(), secili_satir, 0); //Tablonun 0.indexi
           model.setValueAt(jcmbKategori.getSelectedItem().toString(), secili_satir, 1); //Tablonun 1.indexi
           model.setValueAt(txtFiyat.getText(), secili_satir, 2); //Tablonun 2.indexi
           mesajYazisi.setText("Ürün Başarılı Şekilde Güncellendi.");
        }
    }//GEN-LAST:event_jbtnGuncelleActionPerformed

    private void jtbUrunTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUrunTablosuMouseClicked
         // Tablo tıklanarak gezilirken aktif olan satırı form elemanlarına aktarsin
        DefaultTableModel model=(DefaultTableModel)jtbUrunTablosu.getModel();
        int secili_satir=jtbUrunTablosu.getSelectedRow();
        
        txtUrunAdi.setText(model.getValueAt(secili_satir, 0).toString());//obje dondugu icin toStirng e donusturduk
        jcmbKategori.setSelectedItem(model.getValueAt(secili_satir, 1).toString());
        txtFiyat.setText(model.getValueAt(secili_satir, 2).toString());
        
    }//GEN-LAST:event_jtbUrunTablosuMouseClicked

    private void jbtnUrunSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUrunSilActionPerformed
        // TODO add your handling code here:
        mesajYazisi.setText(" ");
        DefaultTableModel model=(DefaultTableModel)jtbUrunTablosu.getModel();
        int secili_satir=jtbUrunTablosu.getSelectedRow();
        if (secili_satir==-1) {
            if (jtbUrunTablosu.getRowCount()==0) {
                mesajYazisi.setText("Ürün Tablosu Şuanda Boş!");
            }else{
                mesajYazisi.setText("Lütfen SİLMEK istediğiniz ürünü seçiniz!");
            }
        }else{
            model.removeRow(secili_satir);
            mesajYazisi.setText("Ürün Başarıyla Silindi...");
        }
    }//GEN-LAST:event_jbtnUrunSilActionPerformed

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
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEkle;
    private javax.swing.JButton jbtnGuncelle;
    private javax.swing.JButton jbtnUrunSil;
    private javax.swing.JComboBox<String> jcmbKategori;
    private javax.swing.JTable jtbUrunTablosu;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtUrunAdi;
    // End of variables declaration//GEN-END:variables
}