/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Interfaces.warObservableInterface;

/**
 *
 * @author hp
 */
public class Maincontroller extends javax.swing.JFrame {
    private final warObservableInterface warObservable;

    /**
     * Creates new form Helicopter
     */
    public Maincontroller(warObservableInterface warObservable) {
        initComponents();
        this.warObservable=warObservable;
        
        setTitle("Main Controller");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(80, 10);
        setVisible(true);
    }
      public void setMessageheli(String message){
        msgareaheli.setText(message);  
    }
       public void setMessagesub(String message){
        msgareasub.setText(message);  
    }
        public void setMessagetank(String message){
        msgareatank.setText(message);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxselect = new javax.swing.JComboBox<>();
        collect = new javax.swing.JButton();
        mainsliderdefence = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgareasub = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        sendmsgarea = new javax.swing.JTextArea();
        areaclearcheckbox = new javax.swing.JCheckBox();
        sendcheckbox = new javax.swing.JCheckBox();
        sendbtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        msgareaheli = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        msgareatank = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainController");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        jComboBoxselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxselectActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, 30));

        collect.setBackground(new java.awt.Color(255, 0, 51));
        collect.setText("Collect Informations");
        collect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectActionPerformed(evt);
            }
        });
        getContentPane().add(collect, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 6, -1, 30));

        mainsliderdefence.setMajorTickSpacing(20);
        mainsliderdefence.setMinorTickSpacing(10);
        mainsliderdefence.setPaintLabels(true);
        mainsliderdefence.setPaintTicks(true);
        mainsliderdefence.setValue(100);
        mainsliderdefence.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainsliderdefenceStateChanged(evt);
            }
        });
        getContentPane().add(mainsliderdefence, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 176, 214, 66));

        jLabel1.setText("Soldier Count");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 48, 83, -1));

        jLabel2.setText("Fuel Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 82, 83, -1));

        jLabel3.setText("Ammo Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 116, 83, -1));

        jLabel4.setText("Position");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 154, 83, -1));

        msgareasub.setBackground(new java.awt.Color(0, 0, 0));
        msgareasub.setColumns(20);
        msgareasub.setForeground(new java.awt.Color(255, 255, 255));
        msgareasub.setRows(5);
        jScrollPane2.setViewportView(msgareasub);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 270, 130, -1));

        sendmsgarea.setColumns(20);
        sendmsgarea.setRows(5);
        jScrollPane4.setViewportView(sendmsgarea);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 48, 166, -1));

        areaclearcheckbox.setText("Area Clear");
        areaclearcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaclearcheckboxActionPerformed(evt);
            }
        });
        getContentPane().add(areaclearcheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 11, 85, -1));

        sendcheckbox.setText("Send Privet");
        getContentPane().add(sendcheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 146, 85, -1));

        sendbtn.setBackground(new java.awt.Color(51, 255, 255));
        sendbtn.setText("Send");
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });
        getContentPane().add(sendbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 172, -1, -1));

        msgareaheli.setBackground(new java.awt.Color(0, 0, 0));
        msgareaheli.setColumns(20);
        msgareaheli.setForeground(new java.awt.Color(255, 255, 255));
        msgareaheli.setRows(5);
        jScrollPane5.setViewportView(msgareaheli);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, -1));

        msgareatank.setBackground(new java.awt.Color(0, 0, 0));
        msgareatank.setColumns(20);
        msgareatank.setForeground(new java.awt.Color(255, 255, 255));
        msgareatank.setRows(5);
        jScrollPane6.setViewportView(msgareatank);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 270, 130, -1));

        jLabel5.setFont(new java.awt.Font("Order Pizza", 1, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Helicopter");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, -1));

        jLabel6.setFont(new java.awt.Font("Order Pizza", 1, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Submarine");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, -1));

        jLabel7.setFont(new java.awt.Font("Order Pizza", 1, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tank");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 248, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/another.gif"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 180, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/another.gif"))); // NOI18N
        jLabel9.setText("jLabel8");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, 120));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/another.gif"))); // NOI18N
        jLabel10.setText("jLabel8");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void collectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collectActionPerformed

    private void areaclearcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaclearcheckboxActionPerformed
        warObservable.areaClear(areaclearcheckbox.isSelected());
    }//GEN-LAST:event_areaclearcheckboxActionPerformed

    private void sendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnActionPerformed
        warObservable.messageFromMainController("Main Controller : "+sendmsgarea.getText());
    }//GEN-LAST:event_sendbtnActionPerformed

    private void jComboBoxselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxselectActionPerformed
        
    }//GEN-LAST:event_jComboBoxselectActionPerformed

    private void mainsliderdefenceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainsliderdefenceStateChanged
         warObservable.activeButtons(mainsliderdefence.getValue());
    }//GEN-LAST:event_mainsliderdefenceStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox areaclearcheckbox;
    private javax.swing.JButton collect;
    private javax.swing.JComboBox<String> jComboBoxselect;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSlider mainsliderdefence;
    private javax.swing.JTextArea msgareaheli;
    private javax.swing.JTextArea msgareasub;
    private javax.swing.JTextArea msgareatank;
    private javax.swing.JButton sendbtn;
    private javax.swing.JCheckBox sendcheckbox;
    private javax.swing.JTextArea sendmsgarea;
    // End of variables declaration//GEN-END:variables
}
