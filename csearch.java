import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavan
 */
public class csearch extends javax.swing.JFrame {

    /**
     * Creates new form csearch
     */
    public csearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        t11 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("SEARCH BY:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 160, 170, 90);

        r1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        r1.setText("CUSTOMER ID");
        r1.setOpaque(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(360, 190, 190, 31);

        r4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        r4.setText("CONTACT NUMBER");
        r4.setOpaque(false);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        jPanel1.add(r4);
        r4.setBounds(560, 190, 220, 31);

        r2.setBackground(new java.awt.Color(255, 255, 255));
        r2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        r2.setText("NAME");
        r2.setBorder(new javax.swing.border.MatteBorder(null));
        r2.setOpaque(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2);
        r2.setBounds(239, 195, 81, 20);

        r3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        r3.setText("ADDRESS");
        r3.setOpaque(false);
        jPanel1.add(r3);
        r3.setBounds(800, 190, 130, 31);

        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        jPanel1.add(t11);
        t11.setBounds(450, 310, 170, 30);

        jLabel2.setBackground(new java.awt.Color(102, 51, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER THE DATA: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 310, 190, 30);

        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 360, 170, 40);

        t1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        t1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "NAME", "ADDRESS", "DATE OF BIRTH", "CONTACT"
            }
        ));
        t1.setOpaque(false);
        jScrollPane1.setViewportView(t1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 430, 930, 200);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 650, 70, 40);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(940, 650, 80, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\prady\\Desktop\\emf.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, -20, 110, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\prady\\Desktop\\logo-gok.png")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 0, 110, 100);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("GOVERNMENT  OF KARNATAKA");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(370, 100, 320, 40);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("TRANSPORT DEPARTMENT");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(430, 130, 260, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\prady\\Desktop\\nic.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(830, 30, 170, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\prady\\Desktop\\New folder (2)\\kisscc0-desktop-wallpaper-transport-highway-traffic-nature-5afda6d53edc91.2336123615265727572575.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1040, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DefaultTableModel t=(DefaultTableModel)t1.getModel();
        try
    {
            Class.forName("java.sql.Driver");
            Connection c=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/rto","root","server");
            Statement s=(Statement)c.createStatement();
            PreparedStatement pf=null;
            if(r1.isSelected())
            {          
                ResultSet r=s.executeQuery("SELECT * FROM CUSTOMER WHERE cust_id="+t11.getText()+";");
            
                 while(r.next())
    {
        int c_id=r.getInt(1);
        String name=r.getString(2);
        String add=r.getString(3);
        String date=r.getString(4);
        long phone=r.getLong(5);
        t.addRow(new Object[]{c_id,name,add,date,phone,});
                   }
            }
            
            else if(r2.isSelected())
            {          
                String cq=t11.getText();
                pf=c.prepareStatement("SELECT * FROM CUSTOMER WHERE name=?");
                pf.setString(1,cq);
                ResultSet r=pf.executeQuery();
            
                 while(r.next())
    {
        int c_id=r.getInt(1);
        String name=r.getString(2);
        String add=r.getString(3);
        String date=r.getString(4);
        long phone=r.getLong(5);
        t.addRow(new Object[]{c_id,name,add,date,phone});
                   }
            }
            else if(r3.isSelected())
            {          
                String cq=t11.getText();
                pf=c.prepareStatement("SELECT * FROM CUSTOMER WHERE address=?");
                pf.setString(1,cq);
                ResultSet r=pf.executeQuery();
                
            
                 while(r.next())
    {
        int c_id=r.getInt(1);
        String name=r.getString(2);
        String add=r.getString(3);
        String date=r.getString(4);
        long phone=r.getLong(5);
        t.addRow(new Object[]{c_id,name,add,date,phone});
                   }
            }
            
            else if(r4.isSelected())
            {          
                ResultSet r=s.executeQuery("SELECT * FROM CUSTOMER WHERE contact="+t11.getText()+";");
            
                 while(r.next())
    {
        int c_id=r.getInt(1);
        String name=r.getString(2);
        String add=r.getString(3);
        String date=r.getString(4);
        long phone=r.getLong(5);
        t.addRow(new Object[]{c_id,name,add,date,phone});
                   }
            } 
            
            
            }
            catch(Exception e)
                    {
                    JOptionPane.showMessageDialog(null,"No such record found");
                    }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
customer frame1=new customer();
        csearch.this.setVisible(false);
        frame1.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(csearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(csearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(csearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(csearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new csearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTable t1;
    private javax.swing.JTextField t11;
    // End of variables declaration//GEN-END:variables
}
