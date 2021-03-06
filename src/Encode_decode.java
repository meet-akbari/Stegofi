
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mayank
 */
public class Encode_decode extends javax.swing.JFrame {

    /**
     * Creates new form Encode_decode
     */
    int user_id;
    private ResultSet rs;
    private Connection conn, conn1;
    private Statement stmt, stmt1;

    public Encode_decode() {
        initComponents();
        this.setLocationRelativeTo(null);
        //jSeparator2.setBackground(Color.GREEN);
        //jSeparator3.setForeground(Color.GREEN);
        jSeparator2.setBackground(Color.green);
        Back.setBackground(new Color(21, 0, 21));
        encode.setBackground(new Color(0, 0, 0, 0));
        decode.setBackground(new Color(0, 0, 0, 0));
        jLabel1.setBackground(new Color(0, 0, 0, 0));
        jLabel2.setBackground(new Color(0, 0, 0, 0));
        profile1.setBackground(new Color(0, 0, 0, 0));
        profile.setBackground(new Color(0, 0, 0, 0));

    }

    public Encode_decode(int user_id) {
        initComponents();
        this.setLocationRelativeTo(null);
        //jSeparator2.setBackground(Color.GREEN);
        //jSeparator3.setForeground(Color.GREEN);
        jSeparator2.setBackground(Color.green);
        Back.setBackground(new Color(21, 0, 21));
        encode.setBackground(new Color(0, 0, 0, 0));
        decode.setBackground(new Color(0, 0, 0, 0));
        jLabel1.setBackground(new Color(0, 0, 0, 0));
        jLabel2.setBackground(new Color(0, 0, 0, 0));
        profile1.setBackground(new Color(0, 0, 0, 0));
        profile.setBackground(new Color(0, 0, 0, 0));
        this.user_id = user_id;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stegofi", "root", "mayank");

            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT * FROM `register` WHERE UserId='"+user_id+"';");
            if (rs.next()) {
                //System.out.println(rs.getString(2));
                profile1.setText(rs.getString(2));
            }
            
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile = new javax.swing.JLabel();
        decode = new javax.swing.JLabel();
        encode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        profile1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1320, 720));
        setMinimumSize(new java.awt.Dimension(1320, 720));
        setPreferredSize(new java.awt.Dimension(1320, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        profile.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user-48.png"))); // NOI18N
        getContentPane().add(profile);
        profile.setBounds(1210, 50, 60, 50);

        decode.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        decode.setForeground(new java.awt.Color(255, 255, 255));
        decode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decode.setText("Decode");
        decode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                decodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                decodeMouseExited(evt);
            }
        });
        getContentPane().add(decode);
        decode.setBounds(490, 330, 300, 50);

        encode.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        encode.setForeground(new java.awt.Color(255, 255, 255));
        encode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encode.setText("Encode");
        encode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encodeMouseExited(evt);
            }
        });
        getContentPane().add(encode);
        encode.setBounds(490, 230, 300, 50);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightbulb.png"))); // NOI18N
        jLabel1.setText(" Decode : It means extract the hidden data from image.");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 590, 1050, 40);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightbulb.png"))); // NOI18N
        jLabel2.setText("Encode :  It means Hiding the data in Image.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 500, 1050, 40);

        profile1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        profile1.setForeground(new java.awt.Color(102, 255, 51));
        profile1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(profile1);
        profile1.setBounds(850, 50, 340, 50);

        jSeparator2.setBackground(new java.awt.Color(102, 255, 51));
        jSeparator2.setForeground(new java.awt.Color(102, 255, 51));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(390, 410, 510, 30);

        jSeparator3.setBackground(new java.awt.Color(102, 255, 51));
        jSeparator3.setForeground(new java.awt.Color(102, 255, 51));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(390, 200, 510, 30);

        Back.setBackground(new java.awt.Color(21, 21, 10));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        Back.setPreferredSize(new java.awt.Dimension(1320, 720));
        getContentPane().add(Back);
        Back.setBounds(0, 0, 1320, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encodeMouseEntered
        // TODO add your handling code here:
        encode.setForeground(Color.GREEN);
    }//GEN-LAST:event_encodeMouseEntered

    private void encodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encodeMouseExited
        // TODO add your handling code here:
        encode.setForeground(Color.WHITE);
    }//GEN-LAST:event_encodeMouseExited

    private void decodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decodeMouseEntered
        // TODO add your handling code here:
        decode.setForeground(Color.GREEN);
    }//GEN-LAST:event_decodeMouseEntered

    private void decodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decodeMouseExited
        // TODO add your handling code here:
        decode.setForeground(Color.WHITE);
    }//GEN-LAST:event_decodeMouseExited

    private void encodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encodeMouseClicked
        // TODO add your handling code here:
        Encode_screen es = new Encode_screen(user_id);
        this.setVisible(false);
        es.setVisible(true);
    }//GEN-LAST:event_encodeMouseClicked

    private void decodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decodeMouseClicked
        // TODO add your handling code here:
        Decode_screen ds = new Decode_screen(user_id);
        this.setVisible(false);
        ds.setVisible(true);
    }//GEN-LAST:event_decodeMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Encode_decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encode_decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encode_decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encode_decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encode_decode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel decode;
    private javax.swing.JLabel encode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel profile1;
    // End of variables declaration//GEN-END:variables
}
