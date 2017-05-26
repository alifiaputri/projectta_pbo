
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mokleters
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pas = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        masuk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 80, 170, 40);

        user.setFont(new java.awt.Font("Budidaya", 0, 24)); // NOI18N
        getContentPane().add(user);
        user.setBounds(250, 90, 170, 30);

        pas.setFont(new java.awt.Font("Budidaya", 0, 24)); // NOI18N
        getContentPane().add(pas);
        pas.setBounds(250, 140, 170, 30);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 140, 160, 30);

        keluar.setBackground(new java.awt.Color(204, 204, 204));
        keluar.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(420, 250, 90, 40);

        masuk.setBackground(new java.awt.Color(204, 204, 204));
        masuk.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        masuk.setText("Masuk");
        masuk.setToolTipText("");
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });
        getContentPane().add(masuk);
        masuk.setBounds(320, 250, 90, 40);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel4.setText("PENGINAPAN HOTEL ALA ALA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 30, 260, 30);

        setBounds(0, 0, 534, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Yakin Keluar?", "Yakin?", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_keluarActionPerformed

    private void masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukActionPerformed
        if(user.getText().equals("admin")){
            if(pas.getText().equals("admin")){
            JOptionPane.showMessageDialog(rootPane, "Selamat Datang di Penginapan Ala Ala");
            new menu_utama().show();
            this.dispose();
            }else{
            JOptionPane.showMessageDialog(null,"Password Salah");
            pas.setText("");
            pas.requestFocus();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Username Salah");
            user.setText("");
            pas.setText("");
            user.requestFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_masukActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton keluar;
    private javax.swing.JButton masuk;
    private javax.swing.JPasswordField pas;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
