
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

public class CalisanEkrani extends javax.swing.JDialog {
    DefaultTableModel model; //JTable icin model olusturuyoruz
    CalisanIslemleri islemler =  new CalisanIslemleri();
    
    
    public CalisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        //program calisirken tekrar yukeleme yapmasin diye  modeli burada cagiriyoruz
        model=(DefaultTableModel) CalisanTablosu.getModel();
        CalisanGoruntule();// program calisircalisman tablo direkt dolsun
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CalisanTablosu = new javax.swing.JTable();
        txtAramaCubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdiAlani = new javax.swing.JTextField();
        txtSoyadiAlani = new javax.swing.JTextField();
        txtDepartmanAlani = new javax.swing.JTextField();
        txtMaasAlani = new javax.swing.JTextField();
        mesajAlani = new javax.swing.JLabel();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Çalışan Listesi");
        setBackground(new java.awt.Color(96, 147, 189));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        CalisanTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ad", "Soyad", "Departman", "Maaş"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CalisanTablosu.setName(""); // NOI18N
        CalisanTablosu.setSelectionBackground(new java.awt.Color(221, 79, 67));
        CalisanTablosu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CalisanTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalisanTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CalisanTablosu);

        txtAramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAramaCubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Adı");

        jLabel2.setText("Soyadı");

        jLabel3.setText("Departman");

        jLabel4.setText("Maaş");

        mesajAlani.setForeground(new java.awt.Color(255, 0, 0));

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDepartmanAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtAdiAlani))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoyadiAlani)
                            .addComponent(txtMaasAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuncelle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAramaCubugu)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoyadiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEkle)
                    .addComponent(btnSil)
                    .addComponent(btnGuncelle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtDepartmanAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaasAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesajAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaCubuguKeyReleased
        // Dinamik arama yapma iclemi
        String ara=txtAramaCubugu.getText();//textfield den alinan veri degiskene aktarildi
        dinamikAra(ara); //degiskeni dinamikAra metoduna gonderdik
    }//GEN-LAST:event_txtAramaCubuguKeyReleased

    private void CalisanTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalisanTablosuMouseClicked
        // Burada secilenler textfiled lere aktarilacak ve guncelleme isleminde kullanilacak
        //JTable mizi default model olarak tanimlamistik textfiled lerdimizi de model uzerinde 
        //tabeldeki idex lerine gore textfiled lere cekiyoruz       
        int selectedrow = CalisanTablosu.getSelectedRow();
        txtAdiAlani.setText(model.getValueAt(selectedrow, 1).toString());
        txtSoyadiAlani.setText(model.getValueAt(selectedrow, 2).toString());
        txtDepartmanAlani.setText(model.getValueAt(selectedrow, 3).toString());
        txtMaasAlani.setText(model.getValueAt(selectedrow, 4).toString());
    }//GEN-LAST:event_CalisanTablosuMouseClicked

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        // TODO add your handling code here:
        mesajAlani.setText("");
        String ad=txtAdiAlani.getText();
        String soyad=txtAdiAlani.getText();
        String departman=txtAdiAlani.getText();
        String maas=txtAdiAlani.getText();
        
        islemler.calisanEkle(ad,soyad,departman,maas); //calisanislemleri.java daki metodu kullancagiz.
        CalisanGoruntule();
        mesajAlani.setText("Yeni Çalışan Başaraıyla Eklendi...");
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        
        String ad=txtAdiAlani.getText();
        String soyad=txtAdiAlani.getText();
        String departman=txtAdiAlani.getText();
        String maas=txtAdiAlani.getText();
        
        int selectedrow=CalisanTablosu.getSelectedRow();
        if (selectedrow==-1) {
            //Tablonun ici dolu/boz kontrol edildi-->dolu ise calisan secildi mi oda kontrol edildi.
            if (model.getRowCount()==0) {//tablo boş ise
                mesajAlani.setText("Tablo şuan boş. Lütfen Kontrol Ediniz!");
            }else{
                //tablo dolu fakat secim yapılmamış
                mesajAlani.setText("Lütfen Güncellenecek Bir Çalışan Seçiniz!");
            }
            
        }
        else{
            int id = (int)model.getValueAt(selectedrow,0);
                      
            islemler.calisanGuncelle(id,ad,soyad,departman,maas);
            
            CalisanGoruntule();
            
            mesajAlani.setText("Çalışan başarıyla güncellendi...");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        // TODO add your handling code here:
        mesajAlani.setText("");
        int secilenSatir=CalisanTablosu.getSelectedRow();
        if (secilenSatir==-1) {
            if (model.getRowCount()==0) {
                mesajAlani.setText("Calisan Tablosu Boş...");
            }else{
                mesajAlani.setText("Lütfen Bir Çalışan Seçiniz...");
            }
        }else{
            int id=(int)model.getValueAt(secilenSatir, 0);//int e donuzturmeliyiz.
            islemler.calisanSil(id); //CalisanIslemler.java daki metodu calistiriyoruz.
            mesajAlani.setText("Çalışan başarıyla silindi......");
            CalisanGoruntule();
        }
    }//GEN-LAST:event_btnSilActionPerformed
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> trs=new TableRowSorter<DefaultTableModel>(model);
        CalisanTablosu.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(ara));
    }
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
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void CalisanGoruntule(){
        //calisan tablosu baska metodlarda caigirildiginda her islem sonrasinda sikinti cikmasin diye 
        //her islem sonunda tablo sıfırlanip yenilenecek
        model.setRowCount(0);
        
        ArrayList<Calisan> calisanlar=new ArrayList<Calisan>();
        calisanlar=islemler.calisanlariGetir();
        if (calisanlar!=null) {
            for(Calisan calisan:calisanlar ){
                Object[] eklenecek={calisan.getId(),calisan.getAd(),calisan.getSoyad(),calisan.getDepartman(),calisan.getMaas()};
                model.addRow(eklenecek);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CalisanTablosu;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTextField txtAdiAlani;
    private javax.swing.JTextField txtAramaCubugu;
    private javax.swing.JTextField txtDepartmanAlani;
    private javax.swing.JTextField txtMaasAlani;
    private javax.swing.JTextField txtSoyadiAlani;
    // End of variables declaration//GEN-END:variables
}
