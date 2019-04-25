package project;
import java.awt.Color;
import java.sql.*;
//import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {

    Connection connect1 = null;
    public login() {
        initComponents();
        connect1=dbm.dbconnect();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(login);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        login_heading = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();
        txt_user_id = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user_id1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setOpaque(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(null);

        login_heading.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        login_heading.setForeground(new java.awt.Color(255, 255, 255));
        login_heading.setText("LOGIN");
        jPanel2.add(login_heading);
        login_heading.setBounds(110, 20, 140, 44);

        user_id.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        user_id.setForeground(new java.awt.Color(255, 255, 255));
        user_id.setText("Password");
        jPanel2.add(user_id);
        user_id.setBounds(80, 170, 100, 20);

        txt_user_id.setForeground(new java.awt.Color(204, 204, 204));
        txt_user_id.setText("Enter Emp ID");
        txt_user_id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_user_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_user_idFocusLost(evt);
            }
        });
        txt_user_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_idActionPerformed(evt);
            }
        });
        jPanel2.add(txt_user_id);
        txt_user_id.setBounds(76, 130, 190, 35);

        txt_password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_password);
        txt_password.setBounds(76, 203, 190, 35);

        login.setBackground(new java.awt.Color(108, 12, 24));
        login.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        login.setForeground(new java.awt.Color(240, 240, 240));
        login.setText("Login");
        login.setBorder(null);
        login.setBorderPainted(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(login);
        login.setBounds(70, 330, 211, 51);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(76, 250, 130, 23);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(107, 128, 20, 20);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(107, 62, 20, 27);

        user_id1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        user_id1.setForeground(new java.awt.Color(255, 255, 255));
        user_id1.setText("Emp ID");
        jPanel2.add(user_id1);
        user_id1.setBounds(80, 100, 80, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(580, 60, 348, 449);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\anish\\Downloads\\Database images\\the_bistro_hero.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_user_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_user_idFocusGained
        if(txt_user_id.getText().equals("Enter Emp ID")){
            txt_user_id.setText(null);
            txt_user_id.setForeground(Color.BLACK);}
    }//GEN-LAST:event_txt_user_idFocusGained

    private void txt_user_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_user_idFocusLost
        if(txt_user_id.getText().equals("")){
            txt_user_id.setForeground(new Color(204,204,204));
            txt_user_id.setText("Enter Emp ID");}
    }//GEN-LAST:event_txt_user_idFocusLost

    private void loginjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButton1ActionPerformed
        boolean check=false;
        if("Enter Emp ID".equals(txt_user_id.getText())){
            JOptionPane.showMessageDialog(null, "Enter Valid Emp ID");
        }
        else if(txt_password.getPassword().length==0){
            JOptionPane.showMessageDialog(null, "Enter Valid Password");
        }
        else{
            //System.out.println("entered");
            try
            {
                String dbuname=txt_user_id.getText();
                String query ="select PASSWORD from waiter where Emp_ID=? ";
                //String query = "Select * from item;";
                PreparedStatement ps = connect1.prepareStatement(query);
                ps.setInt(1,Integer.parseInt(dbuname));
                ResultSet rs = ps.executeQuery();
                int count=0;
                String pass=null;
                while(rs.next()){
                    count++;
                    pass=rs.getString("PASSWORD");
                    //System.out.println(rs.getString("name"));
                }
                System.out.println(count);
                if(count==1){
                    if(pass.equals(String.valueOf(txt_password.getPassword()))){
                        check=true;
                        //JOptionPane.showMessageDialog(null ,"WELCOME "+rs.getString("NAME")+"!");
                    }
                    else
                    JOptionPane.showMessageDialog(null ,"Incorrect password!");
                }
                else{
                    JOptionPane.showMessageDialog(null ,"SORRY you are not registered");
                    check=false;
                }
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null ,"Enter a valid User Id or Password!");
                System.out.println(e.getMessage());
            }

            if(check){
                this.setVisible(false);
                new orders(txt_user_id.getText()).setVisible(true);
            }

        }
    }//GEN-LAST:event_loginjButton1ActionPerformed
 public static void main(String[] args)
    {
        
        login frame = new login();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    } 
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            txt_password.setEchoChar((char)0);
        }else
        txt_password.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txt_user_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JLabel login_heading;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user_id;
    private javax.swing.JLabel user_id;
    private javax.swing.JLabel user_id1;
    // End of variables declaration//GEN-END:variables
}
