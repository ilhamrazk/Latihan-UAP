package latihanuaap;
import javax.swing.JOptionPane;
public class NewFrame extends javax.swing.JFrame {
    lahanParkir a1 = new lahanParkir("0000", "Lahan Parkir A");
    lahanParkir a2 = new lahanParkir("0000", "Lahan Parkir A");
    lahanParkir b1 = new lahanParkir("0000", "Lahan Parkir B");
    lahanParkir b2 = new lahanParkir("0000", "Lahan Parkir B");
    lahanParkir c1 = new lahanParkir("0000", "Lahan Parkir C");
    lahanParkir c2 = new lahanParkir("0000", "Lahan Parkir C");
    lahanParkir d1 = new lahanParkir("0000", "Lahan Parkir D");
    lahanParkir d2 = new lahanParkir("0000", "Lahan Parkir D");
    public NewFrame() {
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
        infoPlat = new javax.swing.JTextField();
        showData = new javax.swing.JButton();
        Masuk1 = new javax.swing.JButton();
        Masuk2 = new javax.swing.JButton();
        Masuk3 = new javax.swing.JButton();
        Masuk4 = new javax.swing.JButton();
        Keluar1 = new javax.swing.JButton();
        Keluar2 = new javax.swing.JButton();
        Keluar3 = new javax.swing.JButton();
        Keluar4 = new javax.swing.JButton();
        Masuk5 = new javax.swing.JButton();
        Masuk6 = new javax.swing.JButton();
        Keluar5 = new javax.swing.JButton();
        Keluar6 = new javax.swing.JButton();
        Masuk7 = new javax.swing.JButton();
        Masuk8 = new javax.swing.JButton();
        Keluar7 = new javax.swing.JButton();
        Keluar8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 525));
        setPreferredSize(new java.awt.Dimension(480, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Sistem Parkir");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 21, -1, -1));

        jLabel2.setText("Nomor Plat :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 50, -1, -1));

        infoPlat.setText("Plat Nomor Kendaraan");
        getContentPane().add(infoPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 47, 154, -1));

        showData.setText("Tampilkan Data");
        showData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataActionPerformed(evt);
            }
        });
        getContentPane().add(showData, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 46, -1, -1));

        Masuk1.setText("Masuk");
        Masuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk1ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 80, 80));

        Masuk2.setText("Masuk");
        Masuk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk2ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 87, 80, 80));

        Masuk3.setText("Masuk");
        Masuk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk3ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, 80));

        Masuk4.setText("Masuk");
        Masuk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk4ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 80, 80));

        Keluar1.setText("Keluar");
        Keluar1.setVisible(false);
        Keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, 80, 80));

        Keluar2.setText("Keluar");
        Keluar2.setVisible(false);
        Keluar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 185, 80, 80));

        Keluar3.setText("Keluar");
        Keluar3.setVisible(false);
        Keluar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar3ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 80, 80));

        Keluar4.setText("Keluar");
        Keluar4.setVisible(false);
        Keluar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar4ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 80, 80));

        Masuk5.setText("Masuk");
        Masuk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk5ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 308, 80, 80));

        Masuk6.setText("Masuk");
        Masuk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk6ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 308, 80, 80));

        Keluar5.setText("Keluar");
        Keluar5.setVisible(false);
        Keluar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar5ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 406, 80, 80));

        Keluar6.setText("Keluar");
        Keluar6.setVisible(false);
        Keluar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar6ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 406, 80, 80));

        Masuk7.setText("Masuk");
        Masuk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk7ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, 80));

        Masuk8.setText("Masuk");
        Masuk8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk8ActionPerformed(evt);
            }
        });
        getContentPane().add(Masuk8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 80, 80));

        Keluar7.setText("Keluar");
        Keluar7.setVisible(false);
        Keluar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar7ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 80, 80));

        Keluar8.setText("Keluar");
        Keluar8.setVisible(false);
        Keluar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar8ActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 80, 80));

        setSize(new java.awt.Dimension(496, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Masuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk1ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        a1 = new lahanParkir(platNomor, "Lahan Parkir A");
        a1.In = a1.setTime();
        Masuk1.setVisible(false);
        Keluar1.setVisible(true);
    }//GEN-LAST:event_Masuk1ActionPerformed

    private void Masuk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk2ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        a2 = new lahanParkir(platNomor, "Lahan Parkir A");
        a2.In = a2.setTime();
        Masuk2.setVisible(false);
        Keluar2.setVisible(true);
    }//GEN-LAST:event_Masuk2ActionPerformed

    private void Masuk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk3ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        b1 = new lahanParkir(platNomor, "Lahan Parkir B");
        b1.In = b1.setTime();
        Masuk3.setVisible(false);
        Keluar3.setVisible(true);
    }//GEN-LAST:event_Masuk3ActionPerformed

    private void Masuk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk4ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        b2 = new lahanParkir(platNomor, "Lahan Parkir B");
        b2.In = b2.setTime();
        Masuk4.setVisible(false);
        Keluar4.setVisible(true);
    }//GEN-LAST:event_Masuk4ActionPerformed

    private void Masuk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk5ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        c1 = new lahanParkir(platNomor, "Lahan Parkir C");
        c1.In = c1.setTime();
        Masuk5.setVisible(false);
        Keluar5.setVisible(true);
    }//GEN-LAST:event_Masuk5ActionPerformed

    private void Masuk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk6ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        c2 = new lahanParkir(platNomor, "Lahan Parkir C");
        c2.In = c2.setTime();
        Masuk6.setVisible(false);
        Keluar6.setVisible(true);
    }//GEN-LAST:event_Masuk6ActionPerformed

    private void Masuk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk7ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        d1 = new lahanParkir(platNomor, "Lahan Parkir D");
        d1.In = d1.setTime();
        Masuk7.setVisible(false);
        Keluar7.setVisible(true);
    }//GEN-LAST:event_Masuk7ActionPerformed

    private void Masuk8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk8ActionPerformed
        String platNomor = String.valueOf(infoPlat.getText().trim());
        d2 = new lahanParkir(platNomor, "Lahan Parkir D");
        d2.In = d2.setTime();
        Masuk8.setVisible(false);
        Keluar8.setVisible(true);
    }//GEN-LAST:event_Masuk8ActionPerformed

    private void Keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar1ActionPerformed
        a1.status = "Sudah Keluar";
        a1.Out = a1.setTime();
        Masuk1.setVisible(true);
        Keluar1.setVisible(false);
    }//GEN-LAST:event_Keluar1ActionPerformed

    private void Keluar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar2ActionPerformed
        a2.status = "Sudah Keluar";
        a2.Out = a2.setTime();
        Masuk2.setVisible(true);
        Keluar2.setVisible(false);
    }//GEN-LAST:event_Keluar2ActionPerformed

    private void Keluar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar3ActionPerformed
        b1.status = "Sudah Keluar";
        b1.Out = b1.setTime();
        Masuk3.setVisible(true);
        Keluar3.setVisible(false);
    }//GEN-LAST:event_Keluar3ActionPerformed

    private void Keluar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar4ActionPerformed
        b2.status = "Sudah Keluar";
        b2.Out = b2.setTime();
        Masuk4.setVisible(true);
        Keluar4.setVisible(false);
    }//GEN-LAST:event_Keluar4ActionPerformed

    private void Keluar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar5ActionPerformed
        c1.status = "Sudah Keluar";
        c1.Out = c1.setTime();
        Masuk5.setVisible(true);
        Keluar5.setVisible(false);
    }//GEN-LAST:event_Keluar5ActionPerformed

    private void Keluar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar6ActionPerformed
        c2.status = "Sudah Keluar";
        c2.Out = c2.setTime();
        Masuk6.setVisible(true);
        Keluar6.setVisible(false);
    }//GEN-LAST:event_Keluar6ActionPerformed

    private void Keluar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar7ActionPerformed
        d1.status = "Sudah Keluar";
        d1.Out = d1.setTime();
        Masuk7.setVisible(true);
        Keluar7.setVisible(false);
    }//GEN-LAST:event_Keluar7ActionPerformed

    private void Keluar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar8ActionPerformed
        d2.status = "Sudah Keluar";
        d2.Out = d2.setTime();
        Masuk8.setVisible(true);
        Keluar8.setVisible(false);
    }//GEN-LAST:event_Keluar8ActionPerformed

    private void showDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataActionPerformed
        a1.tampilData(a1.status); a2.tampilData(a2.status);
        b1.tampilData(b1.status); b2.tampilData(b2.status);
        c1.tampilData(c1.status); c2.tampilData(c2.status);
        d1.tampilData(d1.status); d2.tampilData(d2.status);
        JOptionPane.showMessageDialog(null,"Data telah disave dalam bentuk .txt dengan nama file data_parkir\nSilakan lihat file untuk lebih detail");
    }//GEN-LAST:event_showDataActionPerformed

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
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar1;
    private javax.swing.JButton Keluar2;
    private javax.swing.JButton Keluar3;
    private javax.swing.JButton Keluar4;
    private javax.swing.JButton Keluar5;
    private javax.swing.JButton Keluar6;
    private javax.swing.JButton Keluar7;
    private javax.swing.JButton Keluar8;
    private javax.swing.JButton Masuk1;
    private javax.swing.JButton Masuk2;
    private javax.swing.JButton Masuk3;
    private javax.swing.JButton Masuk4;
    private javax.swing.JButton Masuk5;
    private javax.swing.JButton Masuk6;
    private javax.swing.JButton Masuk7;
    private javax.swing.JButton Masuk8;
    private javax.swing.JTextField infoPlat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton showData;
    // End of variables declaration//GEN-END:variables
}
