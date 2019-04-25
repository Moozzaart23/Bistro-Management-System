
package project;

import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
public class orders extends javax.swing.JFrame {
    String emp_id_pass;
    public orders(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
        orderbutton.setEnabled(false);
        emp_id_pass=id;
        updateTableonline();
        updateTableoffline();
    }
    
    public void updateTableonline(){
        Connection conn1=null;
        PreparedStatement smt =null;
        ResultSet rs=null;
        String sql = "select * from bistro.order where type = ? order by completed asc,order_id desc";
        try {
            conn1 = dbm.dbconnect();
            smt = conn1.prepareStatement(sql);
            smt.setString(1,"Online");
            rs = smt.executeQuery();         
            tableonline.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            //JOptionPane.showMessageDialog(null, e);
            System.out.println(e.getMessage());
        }finally{
            try {
                conn1.close();
                smt.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(orders.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
    
    public void updateTableoffline(){
        Connection conn2=null;
        PreparedStatement smt =null;
        ResultSet rs=null;
    String sql="select * from bistro.order where type = ? order by completed asc,order_id desc";
        try {   
            conn2 = dbm.dbconnect();
            smt=conn2.prepareStatement(sql);
            smt.setString(1,"Offline");
            rs=smt.executeQuery();            
            tableoffline.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            //JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                conn2.close();
                smt.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(orders.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menubutton = new javax.swing.JButton();
        Inventory = new javax.swing.JButton();
        orderbutton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableonline = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        login_heading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableoffline = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        login_heading1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(165, 6, 6));
        jPanel1.setLayout(null);

        menubutton.setBackground(new java.awt.Color(46, 46, 46));
        menubutton.setForeground(new java.awt.Color(255, 255, 255));
        menubutton.setText("Menu");
        menubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubuttonActionPerformed(evt);
            }
        });
        jPanel1.add(menubutton);
        menubutton.setBounds(0, 200, 180, 42);

        Inventory.setBackground(new java.awt.Color(46, 46, 46));
        Inventory.setForeground(new java.awt.Color(255, 255, 255));
        Inventory.setText("Inventory");
        Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryActionPerformed(evt);
            }
        });
        jPanel1.add(Inventory);
        Inventory.setBounds(0, 240, 180, 42);

        orderbutton.setBackground(new java.awt.Color(46, 46, 46));
        orderbutton.setForeground(new java.awt.Color(255, 255, 255));
        orderbutton.setText("Orders");
        orderbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(orderbutton);
        orderbutton.setBounds(0, 280, 180, 42);

        jButton11.setBackground(new java.awt.Color(46, 46, 46));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton11.setForeground(java.awt.Color.white);
        jButton11.setText("Sales");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(0, 320, 180, 42);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 180, 600);

        jTabbedPane1.setAlignmentX(0.0F);
        jTabbedPane1.setAlignmentY(0.0F);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabbedPane1.setInheritsPopupMenu(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(120, 120));

        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel2.setLayout(null);

        tableonline.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tableonline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableonline.setRowHeight(25);
        jScrollPane2.setViewportView(tableonline);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(130, 190, 540, 150);

        jButton1.setText("Add Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(110, 470, 160, 40);

        jButton2.setText("Complete Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(520, 470, 140, 40);

        jButton6.setText("Add Customer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(320, 470, 150, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("View Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(530, 360, 125, 35);

        jButton10.setText("LogOut");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(640, 40, 127, 33);

        login_heading.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        login_heading.setForeground(new java.awt.Color(255, 255, 255));
        login_heading.setText("Online Order");
        jPanel2.add(login_heading);
        login_heading.setBounds(310, 50, 220, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\anish\\Downloads\\Database images\\image_order.png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-10, -110, 1020, 790);

        jTabbedPane1.addTab("Online Orders", jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel3.setLayout(null);

        tableoffline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableoffline.setRowHeight(25);
        jScrollPane3.setViewportView(tableoffline);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(150, 210, 519, 160);

        jButton4.setText("Add Order");
        jPanel3.add(jButton4);
        jButton4.setBounds(150, 480, 150, 40);

        jButton5.setText("Complete Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(520, 480, 150, 39);

        jButton7.setText("Add Customer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(330, 480, 150, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("View Details");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(461, 399, 125, 35);

        jButton9.setText("LogOut");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(640, 40, 128, 33);

        login_heading1.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        login_heading1.setForeground(new java.awt.Color(255, 255, 255));
        login_heading1.setText("Offline Order");
        jPanel3.add(login_heading1);
        login_heading1.setBounds(310, 50, 220, 44);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\anish\\Downloads\\Database images\\offline.jpg")); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(-50, -40, 910, 700);

        jTabbedPane1.addTab("Offline Orders", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(180, 0, 820, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       new add_order(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new add_customer(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int column = tableonline.getSelectedColumn();
        int row = tableonline.getSelectedRow();
        int value=1;
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Order ID for Updating");
        }else{
            int id = Integer.parseInt(tableonline.getModel().getValueAt(row, 0).toString());
            Connection conn = null;
            PreparedStatement ps = null;
            String query = "update bistro.order set completed = ? where order_ID = ?";
            try{
                conn = dbm.dbconnect();
                ps = conn.prepareStatement(query);
                ps.setInt(1,1);
                ps.setInt(2,id);
                ps.execute();
            updateTableonline();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("error in database");
            }
        }
        }catch(Exception ex){
            System.out.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Please select Order ID");
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        new add_customer(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int column = tableoffline.getSelectedColumn();
        int row = tableoffline.getSelectedRow();
        int value=1;
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Order ID for Updating");
        }else{
            int id = Integer.parseInt(tableoffline.getModel().getValueAt(row, 0).toString());
            Connection conn = null;
            PreparedStatement ps = null;
            String query = "update bistro.order set completed = ? where order_ID = ?";
            try{
                conn = dbm.dbconnect();
            ps = conn.prepareStatement(query);
            ps.setInt(1,1);
            ps.setInt(2,id);
            ps.execute();
            updateTableoffline();
            }catch(Exception ex){
                System.out.print(ex.getMessage());
                System.out.println("error in database");
            }
        }
        }catch(Exception ex){
            System.out.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Please select Order ID");
        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int column = tableonline.getSelectedColumn();
        int row = tableonline.getSelectedRow();
        int value=1;
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Order ID for Viewing Details.");
        }else{
            this.setVisible(false);
            new order_details(Integer.parseInt(tableonline.getModel().getValueAt(row, 0).toString()),emp_id_pass).setVisible(true);
        }
        }catch(Exception ex){
            System.out.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Please select Order ID");
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int column = tableoffline.getSelectedColumn();
        int row = tableoffline.getSelectedRow();
        int value=1;
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Order ID for Viewing Details.");
        }else{
            this.setVisible(false);
            new order_details(Integer.parseInt(tableoffline.getModel().getValueAt(row, 0).toString()),emp_id_pass).setVisible(true);
        }
        }catch(Exception ex){
            System.out.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Please select Order ID");
        
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.setVisible(false);
       new login().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false);
       new login().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void menubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuttonActionPerformed
        this.setVisible(false);
        new Menu(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_menubuttonActionPerformed

    private void InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryActionPerformed
        this.setVisible(false);
        new inventory(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_InventoryActionPerformed

    private void orderbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbuttonActionPerformed
        this.setVisible(false);
        new orders(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_orderbuttonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.setVisible(false);
        new sales_page(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed
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
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inventory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel login_heading;
    private javax.swing.JLabel login_heading1;
    private javax.swing.JButton menubutton;
    private javax.swing.JButton orderbutton;
    private javax.swing.JTable tableoffline;
    private javax.swing.JTable tableonline;
    // End of variables declaration//GEN-END:variables
}
