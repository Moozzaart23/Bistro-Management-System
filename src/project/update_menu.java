package project;

import java.sql.*;
import javax.swing.JOptionPane;


public class update_menu extends javax.swing.JFrame {

    int item_id1;
    String item_name1;
    float price1;
    String emp_id_pass;
    public update_menu(int id,String name,float price,String is) {
        initComponents();
        item_id1=id;
        item_name1 = name;
        price1 = price;
        item_name.setText(item_name1);
        item_id.setText(String.valueOf(item_id1));
        item_price.setText(String.valueOf(price1));
        emp_id_pass=is; 
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        item_id = new javax.swing.JTextField();
        item_name = new javax.swing.JTextField();
        item_price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(475, 450));
        setMinimumSize(new java.awt.Dimension(475, 450));
        setPreferredSize(new java.awt.Dimension(475, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setText("Update Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 40, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 130, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Item Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 170, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 210, 40, 17);

        item_id.setEditable(false);
        item_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_idActionPerformed(evt);
            }
        });
        getContentPane().add(item_id);
        item_id.setBounds(250, 130, 120, 20);

        item_name.setEditable(false);
        getContentPane().add(item_name);
        item_name.setBounds(250, 170, 120, 20);
        getContentPane().add(item_price);
        item_price.setBounds(250, 210, 120, 20);

        jButton1.setText("Update Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 280, 120, 30);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 280, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Menu(emp_id_pass).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            float price = Float.parseFloat(item_price.getText());
            
                Connection conn1 = null;
                PreparedStatement ps = null;
                String query ="update item set price=? where item_id = ? ";
                try{
                    conn1= dbm.dbconnect();
                    ps = conn1.prepareStatement(query);
                    ps.setFloat(1, price);
                    ps.setInt(2, item_id1);
                    ps.execute();
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Updation Successful");
                    new Menu(emp_id_pass).setVisible(true);
                }catch(Exception eq){
                    System.out.println("Error in database");
                
                }finally{
                    conn1.close();
                    ps.close();
                }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Enter Valid Price");
        
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
            java.util.logging.Logger.getLogger(Update_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_inventory().setVisible(true);
            }
        });*/
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
    // End of variables declaration//GEN-END:variables
}
