package Java_MysqlConn;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/*import java.text.DateFormat;*/
import java.text.MessageFormat;
/*import java.text.SimpleDateFormat;*/
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Java_MysqlConn extends javax.swing.JFrame {
private static final String username = "root";
private static final String password = "aaaa";
private static final String dataConn = "jdbc:mysql://localhost:3300/connector";
Connection sqlConn = null;
PreparedStatement pst = null;
ResultSet rs = null;
int q, i, id, deleteItem;
    public Java_MysqlConn() {
        initComponents();
    }

   public void upDateDB() throws ClassNotFoundException, SQLException
   {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           sqlConn = DriverManager.getConnection(dataConn,username,password);
           pst = sqlConn.prepareStatement("select * from connector");
       rs = pst.executeQuery ();
       ResultSetMetaData stData = rs.getMetaData();
       q = stData.getColumnCount();
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
       RecordTable.setRowCount(0);
       while (rs.next()){
           Vector columnData = new Vector ();
           for (i = 1;i <= q; i++)
           {
               columnData.add(rs.getString("ID"));
               columnData.add(rs.getString("ProduitID"));
               columnData.add(rs.getString("NomProduit"));
               columnData.add(rs.getString("Type"));
               columnData.add(rs.getString("Quantité"));
               columnData.add(rs.getString("Prix"));
               columnData.add(rs.getString("Prixg"));
               columnData.add(rs.getString("NomSocieté"));
               columnData.add(rs.getString("NumSocieté"));
           }
           RecordTable.addRow(columnData);
           }
           }
       catch (ClassNotFoundException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex);
       }
       }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnUpdate = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnAddNew = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtNumSocieté = new javax.swing.JTextField();
        jtxtPrix = new javax.swing.JTextField();
        jtxtQuantité = new javax.swing.JTextField();
        jtxtNomSocieté = new javax.swing.JTextField();
        jtxtNomProduit = new javax.swing.JTextField();
        jtxtProduitID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtPrixg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtType = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4));
        jPanel2.setLayout(null);

        jbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnUpdate.setText("Mise à jour");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnUpdate);
        jbtnUpdate.setBounds(10, 110, 160, 40);

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnPrint.setText("Imprimer");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnPrint);
        jbtnPrint.setBounds(10, 180, 160, 40);

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnReset.setText("Réinitialiser");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReset);
        jbtnReset.setBounds(10, 260, 160, 40);

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnExit.setText("Quitter");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExit);
        jbtnExit.setBounds(10, 420, 160, 40);

        jbtnAddNew.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnAddNew.setText("Ajouter");
        jbtnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddNewActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAddNew);
        jbtnAddNew.setBounds(10, 40, 160, 40);

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnDelete.setText("Supprimer");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDelete);
        jbtnDelete.setBounds(10, 340, 160, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(790, 110, 180, 500);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4));
        jPanel3.setLayout(null);

        jLabel3.setText("Nom Produit :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 50, 106, 31);

        jLabel4.setText("Nom Societé :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 250, 106, 31);

        jLabel5.setText("Quantité :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 130, 106, 31);

        jLabel6.setText("Prix d'unité (DH) :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 170, 106, 31);

        jLabel7.setText("Tel Societé :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 290, 106, 30);

        jLabel8.setText("Produit ID :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 10, 106, 31);
        jPanel3.add(jtxtNumSocieté);
        jtxtNumSocieté.setBounds(120, 290, 320, 30);
        jPanel3.add(jtxtPrix);
        jtxtPrix.setBounds(120, 170, 320, 30);

        jtxtQuantité.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtQuantitéActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtQuantité);
        jtxtQuantité.setBounds(120, 130, 320, 30);

        jtxtNomSocieté.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNomSocietéActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtNomSocieté);
        jtxtNomSocieté.setBounds(120, 250, 320, 30);
        jPanel3.add(jtxtNomProduit);
        jtxtNomProduit.setBounds(120, 50, 320, 30);
        jPanel3.add(jtxtProduitID);
        jtxtProduitID.setBounds(120, 10, 320, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produit ID", "Nom Produit", "Type", "Quantité", "Prix d'unité", "Prix en gros", "Nom Societé", "Tel Societé"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 340, 720, 150);
        jPanel3.add(jtxtPrixg);
        jtxtPrixg.setBounds(120, 210, 320, 30);

        jLabel2.setText("Type :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 90, 80, 30);
        jPanel3.add(jtxtType);
        jtxtType.setBounds(120, 90, 320, 30);

        jLabel10.setText("Prix en gros (DH) :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 214, 100, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 110, 770, 500);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("    Gestion de Stock");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logovbvbvbhcp.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 80));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 10, 952, 80);

        jLabel11.setText("Réalisé par Abdelghafour ATTARI");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(790, 620, 180, 14);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNomSocietéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNomSocietéActionPerformed
        
    }//GEN-LAST:event_jtxtNomSocietéActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        try
        {
            id = Integer.parseInt(RecordTable.getValueAt (SelectedRows,0).toString());
            deleteItem = JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item",
                    "Warning",JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION)
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        sqlConn = DriverManager.getConnection(dataConn,username,password);
           pst = sqlConn.prepareStatement("delete from connector where id=?");
            pst.setInt(1,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record updated");
            upDateDB();
            jtxtProduitID.setText("");
            jtxtProduitID.requestFocus();
            jtxtNomProduit.setText("");
            jtxtType.setText("");
            jtxtQuantité.setText("");
            jtxtPrix.setText("");
            jtxtPrixg.setText("");
            jtxtNomSocieté.setText("");
            jtxtNumSocieté.setText("");
                    }
     } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        System.err.println(ex);
    }                                          
   
    }//GEN-LAST:event_jbtnDeleteActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Voulez vous vraiment quitter cette page?","Quitter",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jtxtQuantitéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtQuantitéActionPerformed
        
    }//GEN-LAST:event_jtxtQuantitéActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtProduitID.setText("");
        jtxtNomProduit.setText("");
        jtxtType.setText("");
        jtxtQuantité.setText("");
        jtxtPrix.setText("");
        jtxtPrixg.setText("");
        jtxtNomSocieté.setText("");
        jtxtNumSocieté.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddNewActionPerformed
        try
       {
           Class.forName("com.mysql.jdbc.Driver");
           sqlConn = DriverManager.getConnection(dataConn,username,password);
           pst = sqlConn.prepareStatement("insert into connector(ProduitID,NomProduit,Type,Quantité,"
                   +"Prix,Prixg,NomSocieté,NumSocieté)value(?,?,?,?,?,?,?,?)");
                  
                   pst.setString(1,jtxtProduitID.getText());
                   pst.setString(2,jtxtNomProduit.getText());
                   pst.setString(3,jtxtType.getText());
                   pst.setString(4,jtxtQuantité.getText());
                   pst.setString(5,jtxtPrix.getText());
                   pst.setString(6,jtxtPrixg.getText());
                   pst.setString(7,jtxtNomSocieté.getText());
                   pst.setString(8,jtxtNumSocieté.getText());
                   pst.executeUpdate();                 
                   JOptionPane.showMessageDialog(this,"Record Added");
                   upDateDB();
       
            
    } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.
                SEVERE,null,ex);
    }//GEN-LAST:event_jbtnAddNewActionPerformed
}
    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        try
       {
           Class.forName("com.mysql.jdbc.Driver");
           sqlConn = DriverManager.getConnection(dataConn,username,password);
           pst = sqlConn.prepareStatement("update connector set ProduitID=?,NomProduit=?,Type=?,Quantité=?,"
                   +"Prix=?,Prixg=?,NomSocieté=?,NumSocieté=? where id=?");
           
                   pst.setString(1,jtxtProduitID.getText());
                   pst.setString(2,jtxtNomProduit.getText());
                   pst.setString(3,jtxtType.getText());
                   pst.setString(4,jtxtQuantité.getText());
                   pst.setString(5,jtxtPrix.getText());
                   pst.setString(6,jtxtPrixg.getText());
                   pst.setString(7,jtxtNomSocieté.getText());
                   pst.setString(8,jtxtNumSocieté.getText());
                   pst.executeUpdate();
                   JOptionPane.showMessageDialog(this,"Record Updated");
                   upDateDB();
       
            
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(Java_MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
       int SelectedRows = jTable1.getSelectedRow();
       jtxtProduitID.setText (RecordTable.getValueAt (SelectedRows,1).toString());
       jtxtNomProduit.setText (RecordTable.getValueAt (SelectedRows,2).toString());
       jtxtType.setText (RecordTable.getValueAt (SelectedRows,3).toString());
       jtxtQuantité.setText (RecordTable.getValueAt (SelectedRows,4).toString());
       jtxtPrix.setText (RecordTable.getValueAt (SelectedRows,5).toString());
       jtxtPrixg.setText (RecordTable.getValueAt (SelectedRows,6).toString());
       jtxtNomSocieté.setText (RecordTable.getValueAt (SelectedRows,7).toString());
       jtxtNumSocieté.setText (RecordTable.getValueAt (SelectedRows,8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header = new MessageFormat("Gestion de Stock");
        MessageFormat footer = new MessageFormat("");
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed
    
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
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Java_MysqlConn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAddNew;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtNomProduit;
    private javax.swing.JTextField jtxtNomSocieté;
    private javax.swing.JTextField jtxtNumSocieté;
    private javax.swing.JTextField jtxtPrix;
    private javax.swing.JTextField jtxtPrixg;
    private javax.swing.JTextField jtxtProduitID;
    private javax.swing.JTextField jtxtQuantité;
    private javax.swing.JTextField jtxtType;
    // End of variables declaration//GEN-END:variables
}
