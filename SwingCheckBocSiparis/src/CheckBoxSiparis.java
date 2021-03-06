
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KCDG
 */
public class CheckBoxSiparis extends javax.swing.JFrame {
    //Secilenleri aktaracagimiz LinkedHashSet olusturduk
    Set<String> set=new LinkedHashSet<String>();
    
    Map<String,Integer> siparisler=new LinkedHashMap<String,Integer>();
    //Eklenme sirasina gore kaydolmasi icin LinkedHashMap olarak yazdik
    
    /**
     * Creates new form CheckBoxSiparis
     */
    public CheckBoxSiparis() {
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

        jcbJava = new javax.swing.JCheckBox();
        jcbPython = new javax.swing.JCheckBox();
        jcbCplus = new javax.swing.JCheckBox();
        lblDiller_Alani = new javax.swing.JLabel();
        btnGoster = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbIskender = new javax.swing.JCheckBox();
        jcbBeyti = new javax.swing.JCheckBox();
        jcbSalata = new javax.swing.JCheckBox();
        jcbAyran = new javax.swing.JCheckBox();
        btnSiparisler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş Takip Uygulaması");

        jcbJava.setText("Java");

        jcbPython.setText("Python");

        jcbCplus.setText("C++");

        lblDiller_Alani.setText("Şu diller seçildi : ");

        btnGoster.setText("Goster");
        btnGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGosterActionPerformed(evt);
            }
        });

        jLabel1.setText("MENÜ");

        jcbIskender.setText("İskender - 15 TL");

        jcbBeyti.setText("Beyti - 7 TL");

        jcbSalata.setText("Salata - 5 TL");

        jcbAyran.setText("Ayran - 2 TL");

        btnSiparisler.setText("Siparişleri Goster");
        btnSiparisler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparislerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbJava)
                    .addComponent(jcbPython)
                    .addComponent(btnGoster)
                    .addComponent(lblDiller_Alani, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCplus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbBeyti)
                            .addComponent(jcbIskender)
                            .addComponent(jcbSalata)
                            .addComponent(jcbAyran))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSiparisler, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbJava)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbPython)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCplus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDiller_Alani, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGoster))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbIskender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbBeyti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbSalata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbAyran)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiparisler, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGosterActionPerformed
        // Sayfanin basinda Set olusturduk LinkedHashSet olusturduk
        // Secilenleri oraya aktaracagiz.
        if (jcbJava.isSelected()) {
            set.add("Java");
        }else{
            set.remove("Java");
        }
        if (jcbCplus.isSelected()) {
            set.add("C++");
        }else{
            set.remove("C++");
        }
        if (jcbPython.isSelected()) {
            set.add("Python");
        }else{
            set.remove("Python");
        }
        
        LabelDegistir();
    }//GEN-LAST:event_btnGosterActionPerformed

    private void btnSiparislerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparislerActionPerformed
        if (jcbIskender.isSelected()) {
            //olusturdugumuz map e ekliyoruz.
            siparisler.put("İskender",15);
        }else{
            siparisler.remove("İskender");
        }
         if (jcbBeyti.isSelected()) {
            //olusturdugumuz map e ekliyoruz.
            siparisler.put("Beyti",7);
        }else{
            siparisler.remove("Beyti");
        }
          if (jcbSalata.isSelected()) {
            //olusturdugumuz map e ekliyoruz.
            siparisler.put("Salata",5);
        }else{
            siparisler.remove("Salata");
        }
          if (jcbAyran.isSelected()) {
            //olusturdugumuz map e ekliyoruz.
            siparisler.put("Ayran",2);
        }else{
            siparisler.remove("Ayran");
        }
          siparisleriGoster();
    }//GEN-LAST:event_btnSiparislerActionPerformed
    private void siparisleriGoster() {
	String mesaj=null;
        int tutar=0;
        if (siparisler.isEmpty()) {
            mesaj="Siparişiniz Bulunmamaktadir!";
        }else{
            mesaj+="Siparişler\n";
            for(Map.Entry<String,Integer> entry:siparisler.entrySet()){
               //Map ler for eac dongusunde direkt kullanilmadigindan Entry olarak cagiracagiz.
               mesaj+=entry.getKey()+"\n";
               tutar+=entry.getValue();
            }
            mesaj+="Toplam Tutar : "+tutar;
        }
	       JOptionPane.showMessageDialog(this, mesaj);
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
            java.util.logging.Logger.getLogger(CheckBoxSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBoxSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBoxSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBoxSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBoxSiparis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoster;
    private javax.swing.JButton btnSiparisler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox jcbAyran;
    private javax.swing.JCheckBox jcbBeyti;
    private javax.swing.JCheckBox jcbCplus;
    private javax.swing.JCheckBox jcbIskender;
    private javax.swing.JCheckBox jcbJava;
    private javax.swing.JCheckBox jcbPython;
    private javax.swing.JCheckBox jcbSalata;
    private javax.swing.JLabel lblDiller_Alani;
    // End of variables declaration//GEN-END:variables

    private void LabelDegistir() {
        //Metodumuz da Set icersinde gezinecegiz 
        //set icinde olanlari label e yazdiracagiz.
       String yazi="Şu diller secildi :";
        for (String dil: set) {
            yazi+=dil+" ";
        }
        lblDiller_Alani.setText(yazi);
    }
}
