package project;

import java.sql.*;
import javax.swing.JOptionPane;


public class add_inventory extends javax.swing.JFrame {

    String emp_id_pass;
    public add_inventory(String id) {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        item_id = new javax.swing.JTextField();
        item_name = new javax.swing.JTextField();
        item_price = new javax.swing.JTextField();
        item_quan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(475, 450));
        setMinimumSize(new java.awt.Dimension(475, 450));
        setPreferredSize(new java.awt.Dimension(475, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setText("Add Inventory");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 40, 138, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 150, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Item Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 190, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 230, 40, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 270, 60, 17);

        item_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_idActionPerformed(evt);
            }
        });
        getContentPane().add(item_id);
        item_id.setBounds(240, 150, 120, 20);
        getContentPane().add(item_name);
        item_name.setBounds(240, 190, 120, 20);
        getContentPane().add(item_price);
        item_price.setBounds(240, 230, 120, 20);
        getContentPane().add(item_quan);
        item_quan.setBounds(240, 270, 120, 20);

        jButton1.setText("Add Inventory");
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
                    try{
                        int quan = Integer.parseInt(item_quan.getText());
                        
                        
                        Connection conn1 = null;
                        PreparedStatement ps=null;
                        PreparedStatement ps1=null;
                        try{
                            conn1=dbm.dbconnect();
                            String query = "insert into inventory values(?,?,?,?);";
                            String query1 ="insert into manages values (?,?,?,?)";
                            ps = conn1.prepareStatement(query);
                            
                            ps.setInt(1, id);
                            ps.setString(2, name);
                            ps.setInt(3, quan);
                            ps.setFloat(4, price);
                            ps.execute();
                            
                            java.util.Date d1 = new java.util.Date(); 
                            String final_time = String.valueOf(1900+d1.getYear())+"-"+String.valueOf(d1.getMonth()+1)+"-"+String.valueOf(d1.getDate())+" "+String.valueOf(d1.getHours())+":"+String.valueOf(d1.getMinutes())+":"+String.valueOf(d1.getSeconds())+".000";                                      
                            ps1 = conn1.prepareStatement(query1);
                            ps1.setInt(1, id);
                            ps1.setInt(2, Integer.parseInt(emp_id_pass));
                            ps1.setString(3, "insert");
                            ps1.setString(4, final_time);
                            ps1.execute();
                            
                            
                            this.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Item Successfully Added");
                            new inventory(emp_id_pass).setVisible(true);
                        }catch(Exception ew){
                            System.out.println(ew.getMessage());
                            this.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Item Already Exists, you need to update it");
                            new inventory(emp_id_pass).setVisible(true);
                            //System.out.println("Error in database");
                        }finally{
                            conn1.close();
                            ps.close();
                            ps1.close();
                        }
                    }catch(Exception eq){
                    JOptionPane.showMessageDialog(null, "Enter Valid Number in Quantity");
                }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Enter Valid Number in Price");
                }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Enter Valid Number in Item ID");
            }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextField item_quan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
