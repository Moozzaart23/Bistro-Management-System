
package project;

import javax.swing.*;
import java.sql.*;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class sales_page extends javax.swing.JFrame {
    Connection connect=null;
    String emp_id_pass;
    public sales_page(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
        connect=dbm.dbconnect();
        emp_id_pass=id; 
           sales_button.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        menubutton = new javax.swing.JButton();
        Inventory = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        sales_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sales = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        eDateTxt = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        sDate = new com.toedter.calendar.JDateChooser();
        eDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txt_tot_cost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
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

        sales_button.setBackground(new java.awt.Color(46, 46, 46));
        sales_button.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        sales_button.setForeground(java.awt.Color.white);
        sales_button.setText("Sales");
        sales_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(sales_button);
        sales_button.setBounds(0, 320, 180, 42);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 180, 600);

        sales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Item", "Price"
            }
        ));
        sales.setRowHeight(25);
        jScrollPane1.setViewportView(sales);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 250, 550, 120);

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(530, 440, 140, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("End Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 190, 70, 14);

        eDateTxt.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        getContentPane().add(eDateTxt);
        eDateTxt.setBounds(500, 490, 280, 40);

        jButton10.setText("LogOut");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(830, 40, 110, 30);
        getContentPane().add(sDate);
        sDate.setBounds(440, 140, 210, 20);
        getContentPane().add(eDate);
        eDate.setBounds(440, 190, 210, 20);

        jLabel3.setText("Total Sales");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(700, 400, 70, 14);

        txt_tot_cost.setEditable(false);
        txt_tot_cost.setText("0");
        txt_tot_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tot_costActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tot_cost);
        txt_tot_cost.setBounds(770, 390, 120, 30);

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 32)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Sales");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 60, 190, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Starting Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 140, 80, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\anish\\Downloads\\Database images\\sales.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 0, 1030, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void updateTable(Date s,Date e){
    String sql="select order_id as Order_ID,type as Type,DATE(order_time) as Date,total_cost as Total_Cost from bistro.order where DATE(order_time) between ? and ? and completed=1 order by type ASC";
        try {
            PreparedStatement smt=connect.prepareStatement(sql);
            smt.setDate(1, s);
            smt.setDate(2, e);
            ResultSet rs=smt.executeQuery();
            
           sales.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, e1);
        }    
    }
    public int tot_sale(JTable mdl) {
               int total = 0;
               for (int i = 0 ; i < mdl.getRowCount() ; i++) {
                   total += (Integer) mdl.getValueAt(i,3);
               }
               return total;
   }
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
           java.sql.Date s=new java.sql.Date(sDate.getDate().getTime());
           java.sql.Date e=new java.sql.Date(eDate.getDate().getTime());
           //System.out.println(s);
           //System.out.println(e);
           
           updateTable(s, e);
           int ts=tot_sale(sales);
           //System.out.println("ts = "+ts);
           txt_tot_cost.setText(String.valueOf(ts));
                 

    }//GEN-LAST:event_searchActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txt_tot_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tot_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tot_costActionPerformed

    private void menubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuttonActionPerformed
        this.setVisible(false);
        new Menu(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_menubuttonActionPerformed

    private void InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryActionPerformed
        this.setVisible(false);
        new inventory(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_InventoryActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        this.setVisible(false);
        new orders(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_OrdersActionPerformed

    private void sales_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_buttonActionPerformed
        this.setVisible(false);
        new sales_page(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_sales_buttonActionPerformed
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
            java.util.logging.Logger.getLogger(sales_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new sales_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inventory;
    private javax.swing.JButton Orders;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private com.toedter.calendar.JDateChooser eDate;
    private javax.swing.JLabel eDateTxt;
    private javax.swing.JButton jButton10;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menubutton;
    private com.toedter.calendar.JDateChooser sDate;
    private javax.swing.JTable sales;
    private javax.swing.JButton sales_button;
    private javax.swing.JButton search;
    private javax.swing.JTextField txt_tot_cost;
    // End of variables declaration//GEN-END:variables
}
