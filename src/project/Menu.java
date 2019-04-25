
package project;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public class Menu extends javax.swing.JFrame {

    Connection connect1=null;
    String emp_id_pass;
    public Menu(String id) {
        initComponents();
        connect1=dbm.dbconnect();
        this.setLocationRelativeTo(null);
        emp_id_pass=id; 
        menubutton.setEnabled(false);
    }
     
   
   
    public void updateTable(int v,String t){
        String sql="";
        if(v==2)
        {
                    if(t.equals("All"))
                        sql="select Item_ID as ID,name as Name,price as Price from item ";
                    else if(t.equals("Main Course"))              
                        sql="select Item_ID as ID,name,price from item where type='Main Course'";
                    else if(t.equals("Starter"))              
                        sql="select Item_ID as ID,name,price from item where type='Starter'";
                    else if(t.equals("Drinks"))              
                        sql="select Item_ID as ID,name,price from item where type='Drinks'";
                    else if(t.equals("Desserts"))              
                        sql="select Item_ID as ID,name,price from item where type='Desserts'";
        }
        else if(v==1)
               {
                    if(t.equals("All"))
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=1";
                    else if(t.equals("Main Course"))              
                        sql="select Item_ID as ID,name as Name,price as Name from item where veg=1 and type='Main Course'";
                    else if(t.equals("Starter"))              
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=1 and type='Starter'"; 
                    else if(t.equals("Drinks"))              
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=1 and type='Drinks'";
                    else if(t.equals("Desserts"))              
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=1 and type='Desserts'";
               }
        else if(v==0)
               {
                    if(t.equals("All"))
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=0";
                    else if(t.equals("Main Course"))              
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=0 and type='Main Course'";
                    else if(t.equals("Starter"))              
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=0 and type='Starter'"; 
                    else if(t.equals("Drinks"))              
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=0 and type='Drinks'";
                    else if(t.equals("Desserts"))              
                        sql="select Item_ID as ID,name as Name,price as Price from item where veg=0 and type='Desserts'";
               }
        try {
            PreparedStatement smt=connect1.prepareStatement(sql);
            //smt.setString(1, runame);
            ResultSet rs=smt.executeQuery();
            
            menutable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        menutable = new javax.swing.JTable();
        veg_dropdown = new javax.swing.JComboBox<>();
        type_dropdown = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Inventory = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        menubutton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("search");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        menutable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menutable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(menutable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 350, 550, 120);

        veg_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Veg", "Non-Veg" }));
        veg_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veg_dropdownActionPerformed(evt);
            }
        });
        getContentPane().add(veg_dropdown);
        veg_dropdown.setBounds(510, 140, 111, 28);

        type_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Starters", "Main Course", "Drinks", "Desserts" }));
        type_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_dropdownActionPerformed(evt);
            }
        });
        getContentPane().add(type_dropdown);
        type_dropdown.setBounds(510, 190, 110, 28);

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(350, 240, 120, 40);

        jPanel1.setBackground(new java.awt.Color(165, 6, 6));
        jPanel1.setMaximumSize(new java.awt.Dimension(177, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(177, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(177, 600));
        jPanel1.setLayout(null);

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 200, 100, 17);

        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 510, 150, 40);

        jButton2.setText("Update Price");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 510, 150, 40);

        jButton3.setText("Delete Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(750, 510, 140, 40);

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setText("Inventory");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 91, 23);

        jButton10.setText("LogOut");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(820, 40, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Veg/ Non-Veg");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 150, 100, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\anish\\Downloads\\Database images\\menu_page.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-190, 0, 1270, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veg_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veg_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veg_dropdownActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       int veg=0;String type="";
        switch(veg_dropdown.getSelectedIndex()){
            case 0:
                veg=2;
                break;
            case 1:
                veg=1;
                break;
            case 2:
                veg=0;
                break;}
        switch(type_dropdown.getSelectedIndex()){
            case 0:
                type="All";
                break;
            case 1:
                type="Starter";
                break;
            case 2:
                type="Main Course";
                break;
            case 3:
                  type="Drinks";
                  break;
            case 4:
                    type="Desserts";
                    break;
            }
        
        updateTable(veg,type);
             
    }//GEN-LAST:event_searchActionPerformed

    private void type_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_dropdownActionPerformed

    private void InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryActionPerformed
        this.setVisible(false);
        new inventory(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_InventoryActionPerformed

    private void menubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menubuttonActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        this.setVisible(false);
        new orders(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_OrdersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new add_menu(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int column = menutable.getSelectedColumn();
        int row =menutable.getSelectedRow();
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Menu ID for deletion");
        }else{
            String value = menutable.getModel().getValueAt(row, column).toString();
            int id = Integer.parseInt(value);
            Connection conn1=null;
            PreparedStatement ps = null;
            String query = "Delete from item where item_id = ?";
            try{
                conn1=dbm.dbconnect();
                ps = conn1.prepareStatement(query);
                ps.setInt(1, id);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Deletion Successfull");
                updateTable(2,"All");
            }catch(Exception ez){
                //JOptionPane.showMessageDialog(null, "Please select Inventory ID");
                System.out.println("Error in database");
        }finally{
            conn1.close();
            ps.close();
        }
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please select Inventory ID");
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int column = menutable.getSelectedColumn();
        int row = menutable.getSelectedRow();
        
        try{
        if(column!=0){
            JOptionPane.showMessageDialog(null, "Select only Item ID for Updating");
        }else{
            String value = menutable.getModel().getValueAt(row, column).toString();
            int id1 = Integer.parseInt(value);
            String name1 = menutable.getModel().getValueAt(row, 1).toString();
            float price1 = Float.parseFloat(menutable.getModel().getValueAt(row, 2).toString());
            
            this.setVisible(false);
            new update_menu(id1,name1,price1,emp_id_pass).setVisible(true);
        }
        }catch(Exception ex){
            System.out.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Please select Inventory ID");
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false);
       new login().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.setVisible(false);
        new sales_page(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inventory;
    private javax.swing.JButton Orders;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menubutton;
    private javax.swing.JTable menutable;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> type_dropdown;
    private javax.swing.JComboBox<String> veg_dropdown;
    // End of variables declaration//GEN-END:variables
}
