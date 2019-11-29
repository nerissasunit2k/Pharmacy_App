/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author sunitne_sd2082
 */
public class Remove extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public Remove() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        coughbtn = new javax.swing.JButton();
        headachebtn = new javax.swing.JButton();
        bodypainbtn = new javax.swing.JButton();
        allergiesbtn = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        medID = new javax.swing.JTextField();
        removebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44,62,80));

        jPanel2.setBackground(new java.awt.Color(248,148,6));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Remove Medicine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(121, 121, 121))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Select Medicine Type to Remove");

        coughbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coughbtn.setText("Medicine for Cough");
        coughbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coughbtnActionPerformed(evt);
            }
        });

        headachebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        headachebtn.setText("Medicine for Headache");
        headachebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headachebtnActionPerformed(evt);
            }
        });

        bodypainbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bodypainbtn.setText("Medicine for Body Pain");
        bodypainbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodypainbtnActionPerformed(evt);
            }
        });

        allergiesbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        allergiesbtn.setText("Medicine for Allergies");
        allergiesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergiesbtnActionPerformed(evt);
            }
        });

        backBTN.setBackground(new java.awt.Color(153, 153, 153));
        backBTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBTN.setForeground(new java.awt.Color(0, 153, 153));
        backBTN.setText("< Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Select medicine brandname you want to remove:");

        medID.setText(" ");
        medID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medIDActionPerformed(evt);
            }
        });

        removebtn.setText("Remove");
        removebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removebtnMouseClicked(evt);
            }
        });
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(allergiesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bodypainbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headachebtn)
                            .addComponent(coughbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(medID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBTN)
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(coughbtn)
                .addGap(18, 18, 18)
                .addComponent(headachebtn)
                .addGap(18, 18, 18)
                .addComponent(bodypainbtn)
                .addGap(18, 18, 18)
                .addComponent(allergiesbtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(medID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coughbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coughbtnActionPerformed
        this.setVisible(true);
        new Cough().setVisible(true);
    }//GEN-LAST:event_coughbtnActionPerformed

    private void headachebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headachebtnActionPerformed
        this.setVisible(true);
        new Headache().setVisible(true);
    }//GEN-LAST:event_headachebtnActionPerformed

    private void bodypainbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodypainbtnActionPerformed
        this.setVisible(true);
        new BodyPain().setVisible(true);
    }//GEN-LAST:event_bodypainbtnActionPerformed

    private void allergiesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergiesbtnActionPerformed
        this.setVisible(true);
        new Allergies().setVisible(true);
    }//GEN-LAST:event_allergiesbtnActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed

    }//GEN-LAST:event_removebtnActionPerformed

    private void removebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removebtnMouseClicked
        String b = medID.getText();
        boolean exist = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE brandname='" +b+ "'");

            while (rs.next()) {
                System.out.println("Reading!");
                if (rs.getString("brandname").equals(b)) {
                    try {
                        exist = true;
                        String sql = "DELETE FROM `medicine` WHERE brandname='" + b + "'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Successfully removed!");
                        this.dispose();
                        new PharmacyDashboard().setVisible(true);
                        break;
                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error removing!!");
                    }
                }
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(null, "Brand name do not exist!");
            }
            con.close();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting!!");
        }

//        try {
//            System.out.println("Here error");
//            int idOfMedic = Integer.parseInt(medid);
//
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
//                Statement stmt = con.createStatement();
//                ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE id=" + medid); // only choose the medicine inputted from the view
//
//                if (rs.next()) {
//                    if (rs.getInt("id") == idOfMedic) {
//                        try {
//                            exist = true; // signifies that medicine existed
//
//                            String sql = "DELETE FROM `medicine` WHERE id =" + idOfMedic; // query here
//
//                            stmt.executeUpdate(sql); // delete the medicine you've inputted earlier
//
//                            JOptionPane.showMessageDialog(null, "Successfully removed!"); // tells us that it is successful
//
//                            this.dispose(); // page will now close
//
//                            new PharmaDashboard().setVisible(true);  // page will go back to the pharmacist menu view
//                        } catch (HeadlessException | SQLException e) {
//                            JOptionPane.showMessageDialog(null, "Error removing!!"); // This is something error while removing
//                        }
//                    }
//                }
//                System.out.println("Here error again");
//
//                if (exist == false) {
//                    JOptionPane.showMessageDialog(null, "Medicine ID do not exist!");  // if brand name you entered do not exist from the database              
//                }
//
//            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//                JOptionPane.showMessageDialog(null, "Error connecting!!"); // can't connect to database maybe query has something wrong
//            }
//
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Medicine ID should be a number!");
//        }
    }//GEN-LAST:event_removebtnMouseClicked

    private void medIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medIDActionPerformed

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
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Remove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allergiesbtn;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton bodypainbtn;
    private javax.swing.JButton coughbtn;
    private javax.swing.JButton headachebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField medID;
    private javax.swing.JButton removebtn;
    // End of variables declaration//GEN-END:variables
}
