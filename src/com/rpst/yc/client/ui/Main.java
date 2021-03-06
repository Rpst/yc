/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.client.ui;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

/**
 *
 * @author Pavan Poudel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form ClientUIMain
     */
    public Main() {
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

        jLabel6 = new javax.swing.JLabel();
        lbl_loginId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_others_amt = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_pricing = new javax.swing.JLabel();
        lbl_payment = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lbl_prepaid_amt = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        jlabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_total_amt = new javax.swing.JLabel();
        lbl_time_amt = new javax.swing.JLabel();
        lbl_traffic_amt = new javax.swing.JLabel();
        jlabel9 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_balance = new javax.swing.JLabel();
        jlabel11 = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YelloCafe");
        setAlwaysOnTop(true);
        setForeground(java.awt.Color.blue);
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(385, 530));
        setMinimumSize(new java.awt.Dimension(385, 530));
        setPreferredSize(new java.awt.Dimension(385, 530));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_loginId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_loginId.setText("-- login ID --");
        getContentPane().add(lbl_loginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Login ID :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Pricing :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lbl_others_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_others_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_others_amt.setText("-- amount --");
        getContentPane().add(lbl_others_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 80, -1));

        lbl_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_name.setText("-- name --");
        getContentPane().add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        lbl_pricing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_pricing.setText("-- pricing --");
        getContentPane().add(lbl_pricing, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        lbl_payment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_payment.setText("-- Payment --");
        getContentPane().add(lbl_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Log OFF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 90, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Payment");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Order");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Password");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));

        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 5));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 202, 350, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Payment :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 246, 220, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pre-paid :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, -1));

        lbl_prepaid_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_prepaid_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_prepaid_amt.setText("-- amount --");
        getContentPane().add(lbl_prepaid_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 90, -1));

        jlabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel7.setText("Time :");
        getContentPane().add(jlabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 60, -1));

        jlabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel6.setText("Traffic :");
        getContentPane().add(jlabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 60, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 328, 220, -1));

        lbl_total_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_total_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_total_amt.setText("-- amount --");
        getContentPane().add(lbl_total_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 80, -1));

        lbl_time_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_time_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_time_amt.setText("-- amount --");
        getContentPane().add(lbl_time_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 80, -1));

        lbl_traffic_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_traffic_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_traffic_amt.setText("-- amount --");
        getContentPane().add(lbl_traffic_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, -1));

        jlabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel9.setText("Others :");
        getContentPane().add(jlabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 70, -1));

        lbl_time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(0, 102, 0));
        lbl_time.setText("Balance");
        getContentPane().add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 70, -1));

        lbl_balance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_balance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_balance.setText("-- amount --");
        getContentPane().add(lbl_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 80, -1));

        jlabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel11.setText("Total");
        getContentPane().add(jlabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 70, -1));

        jlabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel12.setText("Balance");
        getContentPane().add(jlabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 70, -1));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public static fullpage f = new fullpage();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.setVisible(false);
        
        this.dispose();
       Login l = new Login();
        
        f.setVisible(true);
        l.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        l.setSize(390,330);
        l.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed
public static int start = 0;
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
         //   public void run() {
               final Main m = new Main();
               m.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                m.setLocation(500, 150);            
               Timer timer=new Timer();
               final Time t1=new Time(0,0,0);
               timer.schedule(new TimerTask() {
                    
                public void run() {
                    if(start==1)
                    {
                        t1.setTime(t1.getTime());
                    }
                    else{
                  t1.setTime(t1.getTime() + 1000);}
                    
                 m.lbl_time.setText(String.valueOf(t1));
                 m.lbl_time_amt.setText("10.00 ");
                  //jPanel2.setVisible(true);
                }
              }, 0,1000);
              m.setVisible(true);
                
           // }
        //});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlabel11;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JLabel jlabel9;
    public javax.swing.JLabel lbl_balance;
    public javax.swing.JLabel lbl_loginId;
    public javax.swing.JLabel lbl_name;
    public javax.swing.JLabel lbl_others_amt;
    public javax.swing.JLabel lbl_payment;
    public javax.swing.JLabel lbl_prepaid_amt;
    public javax.swing.JLabel lbl_pricing;
    public javax.swing.JLabel lbl_time;
    public javax.swing.JLabel lbl_time_amt;
    public javax.swing.JLabel lbl_total_amt;
    public javax.swing.JLabel lbl_traffic_amt;
    // End of variables declaration//GEN-END:variables
}
