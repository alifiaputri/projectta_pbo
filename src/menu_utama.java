
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class menu_utama extends javax.swing.JFrame {

    /**
     * Creates new form menu_utama
     */
    public menu_utama() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        notelp = new javax.swing.JTextField();
        kode = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        namasewa = new javax.swing.JTextField();
        nokamar = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        keluar = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        bersihkan = new javax.swing.JButton();
        daftar = new javax.swing.JButton();
        pembayaran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel1.setText("Alamat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 220, 180, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setText("SELAMAT DATANG");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 10, 180, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setText("Kode Transaksi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 180, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setText("Tanggal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 180, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Nama Penyewa");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 180, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setText("No. Telp");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 260, 180, 30);

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel7.setText("No Kamar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 180, 180, 30);
        getContentPane().add(notelp);
        notelp.setBounds(150, 260, 370, 30);
        getContentPane().add(kode);
        kode.setBounds(150, 60, 370, 30);
        getContentPane().add(tanggal);
        tanggal.setBounds(150, 100, 370, 30);
        getContentPane().add(namasewa);
        namasewa.setBounds(150, 140, 370, 30);
        getContentPane().add(nokamar);
        nokamar.setBounds(150, 180, 370, 30);
        getContentPane().add(alamat);
        alamat.setBounds(150, 220, 370, 30);

        keluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(20, 460, 70, 30);

        cari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cari.setText("Pencarian");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari);
        cari.setBounds(20, 313, 100, 30);

        bersihkan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bersihkan.setText("Bersihkan");
        bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanActionPerformed(evt);
            }
        });
        getContentPane().add(bersihkan);
        bersihkan.setBounds(140, 310, 100, 30);

        daftar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        daftar.setText("Daftar Baru");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });
        getContentPane().add(daftar);
        daftar.setBounds(20, 360, 100, 30);

        pembayaran.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pembayaran.setText("Pembayaran");
        pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(pembayaran);
        pembayaran.setBounds(140, 360, 100, 30);

        setBounds(0, 0, 585, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluarActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        String x=JOptionPane.showInputDialog(null, "Masukan kode transaksi");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:81/ta_pbo", "root","");
            Statement stat=connection.createStatement();
            String cari="SELECT kode_transaksi, tanggal, nama_penyewa, no_kamar, alamat, no_telp FROM 'sewa'";
            ResultSet rsnya = stat.executeQuery(cari);
           
            if(rsnya.next()){
                System.out.print(rsnya.getString(1));
                kode.setText(rsnya.getString(1));
                tanggal.setText(rsnya.getString(2));
                namasewa.setText(rsnya.getString(3));
                nokamar.setText(rsnya.getString(4));
                alamat.setText(rsnya.getString(5));
                notelp.setText(rsnya.getString(6));
                JOptionPane.showMessageDialog(rootPane, "Data Ditemukan");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Data Tidak Ada");
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Koneksi Gagal"+e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanActionPerformed
        String x=JOptionPane.showInputDialog(null, "Masukan Kode Barang");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:81/ta_pbo", "root", "");
            Statement stat=connection.createStatement();
            String del="Delete FROM sewa WHERE kode_transaksi='"+x+"'";
            stat.executeUpdate(del);
            JOptionPane.showMessageDialog(rootPane, "Data Terhapus");
            
            kode.setText("");
            tanggal.setText("");
            namasewa.setText("");
            nokamar.setText("");
            alamat.setText("");
            notelp.setText("");
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Koeksi Gagal"+e);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bersihkanActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        new sewa().show();
        this.dispose();

        // TODO add your handling code here:
        
    }//GEN-LAST:event_daftarActionPerformed

    private void pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranActionPerformed
        new pembayaran().show();
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_pembayaranActionPerformed

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
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton bersihkan;
    private javax.swing.JButton cari;
    private javax.swing.JButton daftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField namasewa;
    private javax.swing.JTextField nokamar;
    private javax.swing.JTextField notelp;
    private javax.swing.JButton pembayaran;
    private javax.swing.JTextField tanggal;
    // End of variables declaration//GEN-END:variables

    private void LoadData() {
    }
}