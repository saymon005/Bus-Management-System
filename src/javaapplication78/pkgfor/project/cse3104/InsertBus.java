/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication78.pkgfor.project.cse3104;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class InsertBus extends javax.swing.JFrame {

    /** Creates new form InsertBus */
    public InsertBus() {
        initComponents();
        readcode();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFielddepartlocation = new javax.swing.JTextField();
        jTextFieldsource = new javax.swing.JTextField();
        jTextFielddestination = new javax.swing.JTextField();
        jTextFieldBUSNAME = new javax.swing.JTextField();
        jTextFielddepartdate = new javax.swing.JTextField();
        jTextFielddeparttime = new javax.swing.JTextField();
        jTextFieldarrivaltime = new javax.swing.JTextField();
        jTextField1availseat = new javax.swing.JTextField();
        jTextFieldseatnumber = new javax.swing.JTextField();
        jTextFielddriverid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBUS = new javax.swing.JTable();
        jButtoninsert = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonsearch = new javax.swing.JButton();
        jButtonback = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DEPARTURE TIME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DEPARTURE DATE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("SEAT NUMBER");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("AVAILABLE SEAT");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ARRIVAL TIME");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("SOURCE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("BUS TYPE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("BUS NAME");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("DRIVER ID");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("DEPARTURE LOCATION");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("DESTINATION");

        jTextFielddepartlocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldsource.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFielddestination.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldBUSNAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFielddepartdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFielddeparttime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldarrivaltime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField1availseat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldseatnumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFielddriverid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUS");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFielddepartlocation)
                            .addComponent(jTextFielddestination, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldsource, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 297, Short.MAX_VALUE)
                            .addComponent(jTextFieldBUSNAME, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFielddepartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFielddeparttime, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldarrivaltime)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1availseat, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFielddriverid))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldseatnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(183, 183, 183))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBUSNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielddepartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielddeparttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldsource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFielddestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jTextFieldarrivaltime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField1availseat)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFielddepartlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldseatnumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielddriverid))
                .addGap(93, 93, 93))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 1060, 400));

        jTableBUS.setBackground(new java.awt.Color(51, 204, 255));
        jTableBUS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BUS ID", "BUS NAME", "BUS TYPE", "SOURCE", "DESTINATION", "DEPARTURE LOCATION", "DEPARTURE DATE", "DEPARTURE TIME", "ARRIVAL TIME", "AVAILABLE SEAT", "SEAT NUMBER", "DRIVER ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableBUS);
        if (jTableBUS.getColumnModel().getColumnCount() > 0) {
            jTableBUS.getColumnModel().getColumn(0).setResizable(false);
            jTableBUS.getColumnModel().getColumn(1).setResizable(false);
            jTableBUS.getColumnModel().getColumn(2).setResizable(false);
            jTableBUS.getColumnModel().getColumn(3).setResizable(false);
            jTableBUS.getColumnModel().getColumn(4).setResizable(false);
            jTableBUS.getColumnModel().getColumn(5).setResizable(false);
            jTableBUS.getColumnModel().getColumn(6).setResizable(false);
            jTableBUS.getColumnModel().getColumn(7).setResizable(false);
            jTableBUS.getColumnModel().getColumn(8).setResizable(false);
            jTableBUS.getColumnModel().getColumn(9).setResizable(false);
            jTableBUS.getColumnModel().getColumn(10).setResizable(false);
            jTableBUS.getColumnModel().getColumn(11).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1310, 210));

        jButtoninsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtoninsert.setText("INSERT");
        jButtoninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 176, 50));

        jButtondelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtondelete.setText("DELETE");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 147, 50));

        jButtonsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonsearch.setText("SEARCH");
        jButtonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 164, 50));

        jButtonback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonback.setText("BACK");
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonback, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 157, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\database project\\1eCitaro-G_ALM_HOEHE_MBPASSION_COM_WHAT_ELSE_.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 1350, 890));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void readcode(){
        try {            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BUS_MANAGEMENT_SYSTEM;selectMethod=cursor", "sa", "11223399");
            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM BUS");
            DefaultTableModel tabm = (DefaultTableModel)jTableBUS.getModel();
            tabm.setRowCount(0);
            while (resultSet.next()) {
                String data[]={resultSet.getString("BUS_ID"),resultSet.getString("BUS_NAME"), resultSet.getString("BUS_TYPE"),resultSet.getString("SOURCE"),resultSet.getString("DESTINATION"), resultSet.getString("DEPARTURE_LOCATION"), resultSet.getString("DEPARTURE_DATE"), resultSet.getString("DEPARTURE_TIME"), resultSet.getString("ARRIVAL_TIME"),resultSet.getString("AVAILABLE_SEAT"),resultSet.getString("SEAT_NUM"),resultSet.getString("DRIVER_ID")};                
                tabm.addRow(data);              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void jButtoninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BUS_MANAGEMENT_SYSTEM;selectMethod=cursor", "sa", "11223399");
            System.out.println("DATABASE NAME IS: " + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO BUS VALUES('"+jTextFieldBUSNAME.getText()+"','"+jComboBox1.getSelectedItem().toString()+"','"+jTextFieldsource.getText()+"','"+jTextFielddestination.getText()+"','"+jTextFielddepartlocation.getText()+"','"+jTextFielddepartdate.getText()+"','"+jTextFielddeparttime.getText()+"','"+jTextFieldarrivaltime.getText()+"','"+jTextField1availseat.getText()+"','"+jTextFieldseatnumber.getText()+"','"+jTextFielddriverid.getText()+"')");
            
            System.out.println("Table Name: BUS\nData inserted succesfully.\n");
            readcode();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButtoninsertActionPerformed

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
        showtable obj = new showtable();
        obj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jButtonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearchActionPerformed
        // TODO add your handling code here:
        forSearch obj = new forSearch("BUS", "BUS_ID", "BUS_NAME", "BUS_TYPE", "SOURCE", "DESTINATION", "DEPARTURE_LOCATION", "DEPARTURE_DATE", "DEPARTURE_TIME", "ARRIVAL_TIME", "AVAILABLE_SEAT", "SEAT_NUM", "DRIVER_ID");
        obj.setVisible(true);
       
    }//GEN-LAST:event_jButtonsearchActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // TODO add your handling code here:
        forDelete obj = new forDelete("BUS", "BUS_ID");
        obj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtondeleteActionPerformed

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
            java.util.logging.Logger.getLogger(InsertBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertBus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtoninsert;
    private javax.swing.JButton jButtonsearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBUS;
    private javax.swing.JTextField jTextField1availseat;
    private javax.swing.JTextField jTextFieldBUSNAME;
    private javax.swing.JTextField jTextFieldarrivaltime;
    private javax.swing.JTextField jTextFielddepartdate;
    private javax.swing.JTextField jTextFielddepartlocation;
    private javax.swing.JTextField jTextFielddeparttime;
    private javax.swing.JTextField jTextFielddestination;
    private javax.swing.JTextField jTextFielddriverid;
    private javax.swing.JTextField jTextFieldseatnumber;
    private javax.swing.JTextField jTextFieldsource;
    // End of variables declaration//GEN-END:variables

}
