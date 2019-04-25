package project;


import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import project.dbm;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class add_order extends javax.swing.JFrame {
    int id ;
   String num=null;
   int sum=0;
   int[] items = new int[20];
   int [] quantities = new int[20];
   int tot_quan = 0;
   int total_cost=0;
   String emp_id_pass;
    public add_order(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
        emp_id_pass=id; 
        updateMenuTable();
        
    }
String ty=null;
    public void updateMenuTable(){
    Connection connect1=null;
    String sql="select Item_ID as ID,name as Name,price as Price from item ";
    try {
            connect1=dbm.dbconnect();
            PreparedStatement smt=connect1.prepareStatement(sql);
            //smt.setString(1, runame);
            ResultSet rs=smt.executeQuery();
            
            menutable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    public void updateTableCart(){
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = { String.valueOf(items[tot_quan-1]), String.valueOf(quantities[tot_quan-1]) };
        model.addRow(row);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_number = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        menutable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        add_order = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_quan = new javax.swing.JTextField();
        add_to_cart = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        drop_type = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        drop_waiter = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txt_tot_cost = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 730));
        setMinimumSize(new java.awt.Dimension(980, 730));
        setPreferredSize(new java.awt.Dimension(980, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 22)); // NOI18N
        jLabel1.setText("Add Order");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 30, 160, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(155, 130, 0, 0);

        txt_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_numberFocusLost(evt);
            }
        });
        txt_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numberActionPerformed(evt);
            }
        });
        getContentPane().add(txt_number);
        txt_number.setBounds(300, 160, 150, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Total Cost");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 410, 100, 17);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 640, 120, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(530, 230, 390, 160);

        menutable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(menutable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 230, 410, 190);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        add_order.setText("Add Order");
        add_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_orderActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Select item ID you want");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Enter Quantity");

        add_to_cart.setText("Add to Cart");
        add_to_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(txt_quan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(add_order, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(add_to_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_quan)))
                    .addComponent(add_order, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(add_to_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 440, 840, 180);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Menu");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 200, 159, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cart");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 200, 159, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Waiter");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 170, 70, 17);

        drop_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offline", "Online" }));
        getContentPane().add(drop_type);
        drop_type.setBounds(300, 100, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Customer Mobile Number");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 170, 159, 17);

        drop_waiter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hari Kumar", "Mohan Das", "Saarthaak Jain", "Smit Shah", "Dhruv Gupta" }));
        getContentPane().add(drop_waiter);
        drop_waiter.setBounds(660, 160, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Order Type");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 110, 100, 17);

        txt_tot_cost.setEditable(false);
        txt_tot_cost.setText("0");
        txt_tot_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tot_costActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tot_cost);
        txt_tot_cost.setBounds(740, 400, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_orderActionPerformed
        
        
        String mobile = txt_number.getText();
        int order_id = 0;
        if(mobile==null){
            JOptionPane.showMessageDialog(null, "Enter valid mobile");
        }else{
            
                try{
                            Connection conn =null;
                            PreparedStatement ps = null;
                            String query = "insert into bistro.order values(?,?,?,?,?,?,?);";
                            try{
                                conn = dbm.dbconnect();
                                ps = conn.prepareStatement(query);
                                java.util.Date d1 = new java.util.Date();
                                order_id = Integer.parseInt(String.valueOf(d1.getTime()%10000000));
                                ps.setInt(1, order_id);
                                ps.setString(2, mobile);
                                ty="Offline";
                                if(drop_type.getSelectedIndex()==1) ty ="Online";
                                ps.setString(3, ty);
                                ps.setInt(4, 0);
                                //java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(d1.getTime());
                                //ps.setTimestamp(5, ourJavaTimestampObject);
                                String final_time = String.valueOf(1900+d1.getYear())+"-"+String.valueOf(d1.getMonth()+1)+"-"+String.valueOf(d1.getDate())+" "+String.valueOf(d1.getHours())+":"+String.valueOf(d1.getMinutes())+":"+String.valueOf(d1.getSeconds())+".000";                                      
                                ps.setString(5, final_time);
                                ps.setInt(6,1001+drop_waiter.getSelectedIndex());
                                ps.setInt(7, sum);
                                ps.execute();
                            }catch(Exception eq){
                                System.out.println("Error in database");
                                System.out.println(eq.getMessage());
                                //JOptionPane.showMessageDialog(null, "Enter valid pincode.");
                            } finally{
                                conn.close();
                                ps.close();
                            }
                            //Enter data into contains
                            Connection conn1 = null;
                            PreparedStatement ps1 = null;
                                String query1 = "insert into contains values(?,?,?)";
                                try{
                                    for(int i=0;i<tot_quan;++i){
                                        conn1 = dbm.dbconnect();
                                        ps1 = conn1.prepareStatement(query1);
                                        ps1.setInt(1, order_id);
                                        ps1.setInt(2, items[i]);
                                        ps1.setInt(3, quantities[i]);
                                        ps1.execute();
                                    }
                                    this.setVisible(false);
                                    JOptionPane.showMessageDialog(null, "Order Successfully Placed.");
                                    new orders(emp_id_pass).setVisible(true);
                                
                                }catch(Exception eq){
                                    System.out.println("Error in database1");
                                    System.out.println(eq.getMessage());
                                    //JOptionPane.showMessageDialog(null, "Enter valid pincode.");
                                } finally{
                                  conn1.close();
                                  ps1.close();
                                }
                            
                }catch(Exception e){
                    //JOptionPane.showMessageDialog(null, "Enter Valid Number in Price");
                }
            
        }

    }//GEN-LAST:event_add_orderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new orders(emp_id_pass).setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numberActionPerformed

    private void txt_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_numberFocusLost
        num = txt_number.getText();
        if(num==null){
            JOptionPane.showMessageDialog(null, "Enter Valid Mobile Number");
        }
        else{
            Connection conn=null;
            PreparedStatement ps = null;
            String query="select * from customer where mobile = ?";
            int count=0;
            try{
                conn=dbm.dbconnect();
                ps = conn.prepareStatement(query);
                ps.setString(1, num);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                ++count;
                }
                if(count==0){
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Customer not registered. Please Add Customer.");
                    new add_customer(emp_id_pass).setVisible(true);
                }else{
                
                }
                
                
            }catch(Exception ex){}

        }
    }//GEN-LAST:event_txt_numberFocusLost

    private void add_to_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cartActionPerformed
       if(txt_quan.getText()==null){
        JOptionPane.showMessageDialog(null, "Enter valid Quantity");
       }
        if (menutable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select an Item");
        }
       else{
           try{
               int column = menutable.getSelectedColumn();
                int row = menutable.getSelectedRow();
                int price=0;
                id=Integer.parseInt(menutable.getModel().getValueAt(row, 0).toString());
               int quan = Integer.parseInt(txt_quan.getText());
               price=Integer.parseInt(menutable.getModel().getValueAt(row, 2).toString());
               items[tot_quan] = id;
               quantities[tot_quan] = quan;
               sum+=quan*price;
               ++tot_quan;
               updateTableCart();
               txt_tot_cost.setText(String.valueOf(sum));
               txt_quan.setText("");
           }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Enter Valid Quantity");  
           }
       
       
       }
    }//GEN-LAST:event_add_to_cartActionPerformed

    private void txt_tot_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tot_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tot_costActionPerformed

    
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
            java.util.logging.Logger.getLogger(add_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new add_order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_order;
    private javax.swing.JButton add_to_cart;
    private javax.swing.JComboBox<String> drop_type;
    private javax.swing.JComboBox<String> drop_waiter;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable menutable;
    private javax.swing.JTextField txt_number;
    private javax.swing.JTextField txt_quan;
    private javax.swing.JTextField txt_tot_cost;
    // End of variables declaration//GEN-END:variables
}
