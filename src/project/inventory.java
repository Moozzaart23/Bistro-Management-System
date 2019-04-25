package project;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class inventory extends javax.swing.JFrame {

    Connection connect1=null;
    String emp_id_pass;
    public inventory(String id) {
        initComponents();
        connect1=dbm.dbconnect();
        this.setLocationRelativeTo(null);
        inventorybutton.setEnabled(false);
        emp_id_pass=id; 
        updateTable();
    }
    public void updateTable(){
    String sql="select * from inventory";
        try {
            PreparedStatement smt=connect1.prepareStatement(sql);
            //smt.setString(1, runame);
            ResultSet rs=smt.executeQuery();
            
            inventorytable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inventorytable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        menubutton = new javax.swing.JButton();
        inventorybutton = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        inventorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Quantity"
            }
        ));
        inventorytable.setRowHeight(25);
        jScrollPane1.setViewportView(inventorytable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 290, 452, 94);

        jPanel1.setBackground(new java.awt.Color(165, 6, 6));
        jPanel1.setMaximumSize(new java.awt.Dimension(179, 341));
        jPanel1.setMinimumSize(new java.awt.Dimension(179, 341));
        jPanel1.setPreferredSize(new java.awt.Dimension(179, 341));
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

        inventorybutton.setBackground(new java.awt.Color(46, 46, 46));
        inventorybutton.setForeground(new java.awt.Color(255, 255, 255));
        inventorybutton.setText("Inventory");
        inventorybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventorybuttonActionPerformed(evt);
            }
        });
        jPanel1.add(inventorybutton);
        inventorybutton.setBounds(0, 240, 180, 42);

        Orders.setBackground(new java.awt.Color(46, 46, 46));
        Orders.setForeground(new java.awt.Color(255, 255, 255));
        Orders.setText("Orders");
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });
        jPanel1.add(Orders);
        Orders.setBounds(0, 280, 180, 42);

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
        jPanel1.setBounds(0, 0, 179, 600);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 32)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Inventory");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 90, 190, 40);

        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 485, 146, 39);

        jButton2.setText("Delete Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(711, 485, 148, 39);

        jButton3.setText("Update Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 485, 135, 39);

        jButton10.setText("LogOut");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(840, 40, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\anish\\Downloads\\Database images\\image.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-620, -120, 1770, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new add_inventory(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        int column = inventorytable.getSelectedColumn();
        int row =inventorytable.getSelectedRow();
        
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Inventory ID for Updating");
        }else{
            String value = inventorytable.getModel().getValueAt(row, column).toString();
            int id1 = Integer.parseInt(value);
            String name1 = inventorytable.getModel().getValueAt(row, 1).toString();
            float price1 = Float.parseFloat(inventorytable.getModel().getValueAt(row, 3).toString());
            int quan1 = Integer.parseInt(inventorytable.getModel().getValueAt(row, 2).toString());
            this.setVisible(false);
            new Update_inventory(id1,name1,price1,quan1,emp_id_pass).setVisible(true);
        }
        }catch(Exception ex){
            System.out.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Please select Inventory ID");
        
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int column = inventorytable.getSelectedColumn();
        int row =inventorytable.getSelectedRow();
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Inventory ID for deletion");
        }else{
            String value = inventorytable.getModel().getValueAt(row, column).toString();
            int id = Integer.parseInt(value);
            Connection conn1=null;
            PreparedStatement ps = null;
            String query = "Delete from inventory where id = ?";
            try{
                conn1=dbm.dbconnect();
                ps = conn1.prepareStatement(query);
                ps.setInt(1, id);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Deletion Successfull");
                updateTable();
            }catch(Exception ez){
                //JOptionPane.showMessageDialog(null, "Please select Inventory ID");
                System.out.println(ez.getMessage());
        }finally{
            conn1.close();
            ps.close();
        }
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please select Inventory ID");
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       this.setVisible(false);
       new login().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void menubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuttonActionPerformed
        this.setVisible(false);
        new Menu(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_menubuttonActionPerformed

    private void inventorybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventorybuttonActionPerformed
        this.setVisible(false);
        new inventory(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_inventorybuttonActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        this.setVisible(false);
        new orders(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_OrdersActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.setVisible(false);
        new sales_page(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Orders;
    private javax.swing.JButton inventorybutton;
    private javax.swing.JTable inventorytable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menubutton;
    // End of variables declaration//GEN-END:variables
}
