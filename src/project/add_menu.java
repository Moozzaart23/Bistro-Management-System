package project;

import java.sql.*;
import javax.swing.JOptionPane;


public class add_menu extends javax.swing.JFrame {

    String emp_id_pass;
    public add_menu(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
        emp_id_pass=id; 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        item_id = new javax.swing.JTextField();
        item_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        item_price = new javax.swing.JTextField();
        type_dropdown = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        veg_dropdown = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(475, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setText("Add Item");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 40, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Menu ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 120, 60, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 210, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 290, 50, 17);

        item_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_idActionPerformed(evt);
            }
        });
        getContentPane().add(item_id);
        item_id.setBounds(240, 120, 120, 20);
        getContentPane().add(item_name);
        item_name.setBounds(240, 160, 120, 20);

        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 350, 120, 30);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 350, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Veg/ Non Veg");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 250, 84, 17);
        getContentPane().add(item_price);
        item_price.setBounds(240, 290, 120, 20);

        type_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Starters", "Main Course", "Drinks", "Desserts" }));
        type_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_dropdownActionPerformed(evt);
            }
        });
        getContentPane().add(type_dropdown);
        type_dropdown.setBounds(240, 200, 110, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Item Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 160, 70, 17);

        veg_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veg", "Non-Veg" }));
        veg_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veg_dropdownActionPerformed(evt);
            }
        });
        getContentPane().add(veg_dropdown);
        veg_dropdown.setBounds(240, 240, 111, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new inventory(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = item_name.getText();
        
            try{
                int id = Integer.parseInt(item_id.getText());
                if(name==null){
                    JOptionPane.showMessageDialog(null, "Enter Valid Name");  
                }else{
                try{
                    float price = Float.parseFloat(item_price.getText());
                  
                        Connection conn1 = null;
                        PreparedStatement ps=null;
                        try{
                            conn1=dbm.dbconnect();
                            String query = "insert into item values(?,?,?,?,?);";
                            ps = conn1.prepareStatement(query);
                            ps.setInt(1, id);
                            ps.setString(2, name);
                            String type="Main Course";
                            int veg=1;
                            switch(veg_dropdown.getSelectedIndex()){
                                case 0:
                                    veg=1;
                                    break;
                                case 1:
                                    veg=0;
                                    break;
                            }
                            switch(type_dropdown.getSelectedIndex()){
                                case 0:
                                    type="Starters";
                                    break;
                                case 1:
                                    type="Main Course";
                                    break;
                                case 2:
                                    type="Drinks";
                                    break;
                                case 3:
                                    type="Desserts";
                                    break; 
                            }
                            ps.setString(3, type);
                            ps.setInt(4, veg);
                            ps.setFloat(5, price);
                            
                            
                            ps.execute();
                            JOptionPane.showMessageDialog(null, "Item Successfully Added");
                            this.setVisible(false);
                            new Menu(emp_id_pass).setVisible(true);
                        }catch(Exception ew){
                            this.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Dish Already Exists");
                            new Menu(emp_id_pass).setVisible(true);
                            //System.out.println("Error in database");
                        }finally{
                            conn1.close();
                            ps.close();
                        }
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Enter Valid Number in Price");
                }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Enter Valid Number in Item ID");
            }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void type_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_dropdownActionPerformed

    private void veg_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veg_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veg_dropdownActionPerformed

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
            java.util.logging.Logger.getLogger(add_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new add_inventory(emp_id_pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField item_id;
    private javax.swing.JTextField item_name;
    private javax.swing.JTextField item_price;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> type_dropdown;
    private javax.swing.JComboBox<String> veg_dropdown;
    // End of variables declaration//GEN-END:variables
}
