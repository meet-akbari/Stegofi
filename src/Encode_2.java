
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mayank
 */
public class Encode_2 extends javax.swing.JFrame {

    /**
     * Creates new form Encode_2
     */
    int user_id;
    String path_1;
    String path;

    public Encode_2() {
        initComponents();
        this.setLocationRelativeTo(null);
        passcon.setBackground(new Color(0, 0, 0, 0));
        EmailTF2.setBackground(new Color(0, 0, 0, 0));
        jPanel2.setVisible(false);
        jPanel1.setLocation(400, 160);
    }

    public Encode_2(int user_id, String path) {
        initComponents();
        this.setLocationRelativeTo(null);
        passcon.setBackground(new Color(0, 0, 0, 0));
        EmailTF2.setBackground(new Color(0, 0, 0, 0));
        jPanel2.setVisible(false);
        jPanel1.setLocation(400, 160);
        this.user_id = user_id;
        this.path = path;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        encode1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        EmailTF2 = new javax.swing.JTextField();
        encode3 = new javax.swing.JLabel();
        passcon = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        encode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1320, 720));
        getContentPane().setLayout(null);

        jSeparator3.setBackground(new java.awt.Color(102, 255, 51));
        jSeparator3.setForeground(new java.awt.Color(102, 255, 51));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(400, 40, 510, 30);

        encode1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        encode1.setForeground(new java.awt.Color(102, 255, 51));
        encode1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encode1.setText("Encode");
        encode1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encode1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encode1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encode1MouseExited(evt);
            }
        });
        getContentPane().add(encode1);
        encode1.setBounds(500, 50, 300, 50);

        jSeparator2.setBackground(new java.awt.Color(102, 255, 51));
        jSeparator2.setForeground(new java.awt.Color(102, 255, 51));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(400, 110, 510, 30);

        jPanel2.setOpaque(false);

        jLabel8.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setForeground(java.awt.SystemColor.control);
        jLabel8.setText("Enter Security Key : ");

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        EmailTF2.setBackground(new java.awt.Color(51, 51, 51));
        EmailTF2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        EmailTF2.setForeground(new java.awt.Color(102, 255, 51));
        EmailTF2.setText("(6 Characters Only)");
        EmailTF2.setBorder(null);
        EmailTF2.setOpaque(false);
        EmailTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTF2ActionPerformed(evt);
            }
        });

        encode3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        encode3.setForeground(new java.awt.Color(255, 255, 255));
        encode3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encode3.setText("Encode");
        encode3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
        encode3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encode3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encode3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encode3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encode3MouseExited(evt);
            }
        });

        passcon.setBackground(new java.awt.Color(51, 51, 51));
        passcon.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        passcon.setForeground(new java.awt.Color(51, 255, 51));
        passcon.setBorder(null);
        passcon.setCaretColor(new java.awt.Color(255, 255, 0));
        passcon.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passcon, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(encode3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addComponent(EmailTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel8)
                .addGap(49, 49, 49)
                .addComponent(passcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(encode3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(720, 160, 510, 430);

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("          a data which you want to hide in ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setMaximumSize(new java.awt.Dimension(452, 32));
        jLabel2.setMinimumSize(new java.awt.Dimension(452, 32));
        jLabel2.setPreferredSize(new java.awt.Dimension(452, 32));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightbulb.png"))); // NOI18N
        jLabel3.setText("    Choose a Text file where you written  ");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setMaximumSize(new java.awt.Dimension(452, 32));
        jLabel3.setMinimumSize(new java.awt.Dimension(452, 32));
        jLabel3.setPreferredSize(new java.awt.Dimension(452, 32));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("          the choosen image in earlier step.");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setMaximumSize(new java.awt.Dimension(452, 32));
        jLabel4.setMinimumSize(new java.awt.Dimension(452, 32));
        jLabel4.setPreferredSize(new java.awt.Dimension(452, 32));

        encode.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        encode.setForeground(new java.awt.Color(255, 255, 255));
        encode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encode.setText("Select Text file");
        encode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(encode, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(encode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 160, 510, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1320, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encode1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encode1MouseEntered
        // TODO add your handling code here:
        encode1.setForeground(Color.WHITE);
    }//GEN-LAST:event_encode1MouseEntered

    private void encode1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encode1MouseExited
        // TODO add your handling code here:
        encode1.setForeground(Color.GREEN);
    }//GEN-LAST:event_encode1MouseExited

    private void encodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encodeMouseEntered
        // TODO add your handling code here:
        encode.setForeground(Color.GREEN);
        Color VISIBLE_BORDER = new java.awt.Color(255, 255, 255);
        LineBorder visibleBorder = new LineBorder(VISIBLE_BORDER, 1);

        encode.setBorder(visibleBorder);
    }//GEN-LAST:event_encodeMouseEntered

    private void encodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encodeMouseExited
        // TODO add your handling code here:
        encode.setForeground(Color.WHITE);
        Color VISIBLE_BORDER = new java.awt.Color(102, 255, 51);
        LineBorder visibleBorder = new LineBorder(VISIBLE_BORDER, 1);

        encode.setBorder(visibleBorder);
    }//GEN-LAST:event_encodeMouseExited

    private void EmailTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTF2ActionPerformed

    private void encodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encodeMouseClicked
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        //file.setCurrentDirectory(new File(System.getProperty("user.home")));

        //FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt");
        //file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        path_1 = null;
        File selectedFile = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = file.getSelectedFile();
            path_1 = selectedFile.getAbsolutePath();
            //System.out.println(path);
            //System.out.println(path.substring(path.length()-4, path.length()));
            if (path_1.substring(path_1.length() - 4, path_1.length()).equals(".txt")) {
                jPanel1.setVisible(false);
                jPanel2.setVisible(true);
                jPanel2.setLocation(400, 160);
            } else {
                JOptionPane.showMessageDialog(this, "Please select text file...", "ERROR !", JOptionPane.ERROR_MESSAGE);

            }
        }

    }//GEN-LAST:event_encodeMouseClicked

    private void encode3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encode3MouseClicked
        // TODO add your handling code here:
        if (passcon.getText().length() != 6) {
            JOptionPane.showMessageDialog(this, "Security key has length of 6...", "ERROR !", JOptionPane.ERROR_MESSAGE);
        } else {
            FileWriter fw = null;
            BufferedWriter bw = null;
            PrintWriter pw = null;

            try {
                fw = new FileWriter(path_1, true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                pw.println(passcon.getText());

                System.out.println("Data Successfully appended into file");
                pw.flush();
                //code
                Connection conn = null;
                PreparedStatement pstmt = null;
                Statement stmt = null;
                FileInputStream inputStream = null;
                if (Encode() == 1) {
                    JOptionPane.showMessageDialog(this, "Data saved securaly...", "Done !", JOptionPane.INFORMATION_MESSAGE);
                    try {

                        Class.forName("com.mysql.jdbc.Driver");

                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stegofi", "root", "mayank");

                        inputStream = new FileInputStream("src\\Encoded\\encodedimage"+user_id+".png");
                        pstmt = conn.prepareStatement("INSERT INTO `decode`(`UserId`, `image`) VALUES ('" + user_id + "',(?))");

                        pstmt.setBinaryStream(1, (InputStream) inputStream, inputStream.available());
                        pstmt.executeUpdate();
                        //File ff = new File("E:\\encodedimage.png");
                        //ff.delete();
                        Save_or_email_encoded_image ss = new Save_or_email_encoded_image(user_id);
                        this.setVisible(false);
                        ss.setVisible(true);
                    } catch (Exception e) {

                        System.out.println(e);

                    } finally {
                        try {
                            conn.close();
                            pstmt.close();
                        } catch (Exception e) {
                            System.out.println("SQL Exception Finally : " + e);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong...", "ERROR !", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {

                try {
                    pw.close();
                    bw.close();
                    fw.close();
                } catch (IOException io) {// can't do anything }
                }

            }
        }


    }//GEN-LAST:event_encode3MouseClicked

    private void encode3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encode3MouseEntered
        // TODO add your handling code here:
        encode3.setForeground(Color.GREEN);
        Color VISIBLE_BORDER = new java.awt.Color(255, 255, 255);
        LineBorder visibleBorder = new LineBorder(VISIBLE_BORDER, 1);

        encode3.setBorder(visibleBorder);
    }//GEN-LAST:event_encode3MouseEntered

    private void encode3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encode3MouseExited
        // TODO add your handling code here:
        encode3.setForeground(Color.WHITE);
        Color VISIBLE_BORDER = new java.awt.Color(102, 255, 51);
        LineBorder visibleBorder = new LineBorder(VISIBLE_BORDER, 1);

        encode3.setBorder(visibleBorder);
    }//GEN-LAST:event_encode3MouseExited

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
            java.util.logging.Logger.getLogger(Encode_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encode_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encode_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encode_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encode_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailTF2;
    private javax.swing.JLabel encode;
    private javax.swing.JLabel encode1;
    private javax.swing.JLabel encode3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPasswordField passcon;
    // End of variables declaration//GEN-END:variables
    int Encode() {
        try {
            String contentOfMessageFile = (readMessageFile());
            int[] bits = bit_Msg(contentOfMessageFile);
            System.out.println("msg in file " + contentOfMessageFile);
            /*for (int i = 0; i < bits.length; i++) {
                System.out.print(bits[i]);
            }*/
            //System.out.println();
            BufferedImage theImage = readImageFile(path);
            hideTheMessage(bits, theImage);
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    String readMessageFile() throws FileNotFoundException {
        String contentOfMessageFile = "";
        File a = new File(path_1);
        Scanner scan = new Scanner(a);
        while (scan.hasNextLine()) {
            String next = scan.nextLine();
            contentOfMessageFile += next;

            if (scan.hasNextLine()) {
                contentOfMessageFile += "\n";
            }
        }
        scan.close();
        return contentOfMessageFile;
    }

    int[] bit_Msg(String msg) {
        int j = 0;
        int[] b_msg = new int[msg.length() * 8];
        for (int i = 0; i < msg.length(); i++) {
            int x = msg.charAt(i);
            String x_s = Integer.toBinaryString(x);
            while (x_s.length() != 8) {
                x_s = '0' + x_s;
            }
            //System.out.println("dec value for " + x + " is " + x_s);

            for (int i1 = 0; i1 < 8; i1++) {
                b_msg[j] = Integer.parseInt(String.valueOf(x_s.charAt(i1)));
                j++;
            }
        }

        return b_msg;
    }

    BufferedImage readImageFile(String path) {
        BufferedImage theImage = null;
        File p = new File(path);
        try {
            theImage = ImageIO.read(p);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return theImage;
    }

    void hideTheMessage(int[] bits, BufferedImage theImage) throws Exception {
        File f = new File("src\\Encoded\\encodedimage"+user_id+".png");
        BufferedImage sten_img = null;
        int bit_l = bits.length / 8;
        int[] bl_msg = new int[8];
        System.out.println("bit lent " + bit_l);
        String bl_s = Integer.toBinaryString(bit_l);
        while (bl_s.length() != 8) {
            bl_s = '0' + bl_s;
        }
        for (int i1 = 0; i1 < 8; i1++) {
            bl_msg[i1] = Integer.parseInt(String.valueOf(bl_s.charAt(i1)));
        }
        int j = 0;
        int b = 0;
        int currentBitEntry = 8;

        for (int x = 0; x < theImage.getWidth(); x++) {
            for (int y = 0; y < theImage.getHeight(); y++) {
                if (x == 0 && y < 8) {
                    int currentPixel = theImage.getRGB(x, y);
                    int ori = currentPixel;
                    int red = currentPixel >> 16;
                    red = red & 255;
                    int green = currentPixel >> 8;
                    green = green & 255;
                    int blue = currentPixel;
                    blue = blue & 255;
                    String x_s = Integer.toBinaryString(blue);
                    String sten_s = x_s.substring(0, x_s.length() - 1);
                    sten_s = sten_s + Integer.toString(bl_msg[b]);

                    //j++;
                    int temp = Integer.parseInt(sten_s, 2);
                    int s_pixel = Integer.parseInt(sten_s, 2);
                    int a = 255;
                    int rgb = (a << 24) | (red << 16) | (green << 8) | s_pixel;
                    theImage.setRGB(x, y, rgb);
                    //System.out.println("original "+ori+" after "+theImage.getRGB(x, y));
                    ImageIO.write(theImage, "png", f);
                    b++;

                } else if (currentBitEntry < bits.length + 8) {

                    int currentPixel = theImage.getRGB(x, y);
                    int ori = currentPixel;
                    int red = currentPixel >> 16;
                    red = red & 255;
                    int green = currentPixel >> 8;
                    green = green & 255;
                    int blue = currentPixel;
                    blue = blue & 255;
                    String x_s = Integer.toBinaryString(blue);
                    String sten_s = x_s.substring(0, x_s.length() - 1);
                    sten_s = sten_s + Integer.toString(bits[j]);
                    j++;
                    int temp = Integer.parseInt(sten_s, 2);
                    int s_pixel = Integer.parseInt(sten_s, 2);

                    int a = 255;
                    int rgb = (a << 24) | (red << 16) | (green << 8) | s_pixel;
                    theImage.setRGB(x, y, rgb);
                    //System.out.println("original "+ori+" after "+theImage.getRGB(x, y));
                    ImageIO.write(theImage, "png", f);

                    currentBitEntry++;
                    //System.out.println("curre "+currentBitEntry);
                }
            }
        }
    }
}
