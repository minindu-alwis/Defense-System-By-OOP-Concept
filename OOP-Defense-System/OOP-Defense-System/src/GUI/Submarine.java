/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Interfaces.warObserver;

/**
 *
 * @author hp
 */
public class Submarine extends javax.swing.JFrame implements warObserver{

    boolean isCheckedPosition = false;
    private Maincontroller main;

    public Submarine(Maincontroller main) {
        initComponents();
        this.main=main;
        setTitle("Submarine");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(20, 420);
        setVisible(true);
        shootbtns.setEnabled(false);
        tinderbtns.setEnabled(false);
        tomahawkbtns.setEnabled(false);
        sonarbtns.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areatextsub = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreasubmarine = new javax.swing.JTextArea();
        jTextFieldsubmarine = new javax.swing.JTextField();
        sendbtns = new javax.swing.JButton();
        shootbtns = new javax.swing.JButton();
        tomahawkbtns = new javax.swing.JButton();
        sonarbtns = new javax.swing.JButton();
        tinderbtns = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        soldiertext = new javax.swing.JLabel();
        ammotext = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        positionsubmarine = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areatextsub.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areatextsub.setForeground(new java.awt.Color(255, 255, 255));
        areatextsub.setText("Area Not Cleared");
        getContentPane().add(areatextsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jTextAreasubmarine.setColumns(20);
        jTextAreasubmarine.setRows(5);
        jScrollPane1.setViewportView(jTextAreasubmarine);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, 355, 140));
        getContentPane().add(jTextFieldsubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 292, 287, -1));

        sendbtns.setBackground(new java.awt.Color(255, 0, 51));
        sendbtns.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 12)); // NOI18N
        sendbtns.setText("Send");
        sendbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnsActionPerformed(evt);
            }
        });
        getContentPane().add(sendbtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 293, 62, -1));

        shootbtns.setBackground(new java.awt.Color(0, 0, 0));
        shootbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        shootbtns.setForeground(new java.awt.Color(255, 255, 0));
        shootbtns.setText("Shoot");
        shootbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootbtnsActionPerformed(evt);
            }
        });
        getContentPane().add(shootbtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 40, 123, 37));

        tomahawkbtns.setBackground(new java.awt.Color(0, 0, 0));
        tomahawkbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        tomahawkbtns.setForeground(new java.awt.Color(255, 255, 0));
        tomahawkbtns.setText("Tomahawk Misssile");
        tomahawkbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomahawkbtnsActionPerformed(evt);
            }
        });
        getContentPane().add(tomahawkbtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 85, 123, 37));

        sonarbtns.setBackground(new java.awt.Color(0, 0, 0));
        sonarbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        sonarbtns.setForeground(new java.awt.Color(255, 255, 0));
        sonarbtns.setText("Sonar Operation");
        sonarbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonarbtnsActionPerformed(evt);
            }
        });
        getContentPane().add(sonarbtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 40, 123, 37));

        tinderbtns.setBackground(new java.awt.Color(0, 0, 0));
        tinderbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        tinderbtns.setForeground(new java.awt.Color(255, 255, 0));
        tinderbtns.setText("Trident-2 Missile");
        tinderbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinderbtnsActionPerformed(evt);
            }
        });
        getContentPane().add(tinderbtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 85, 123, 37));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 6, -1, 28));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 52, -1, 28));

        soldiertext.setForeground(new java.awt.Color(0, 255, 0));
        soldiertext.setText("Soldier Count");
        getContentPane().add(soldiertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 12, -1, -1));

        ammotext.setForeground(new java.awt.Color(0, 255, 0));
        ammotext.setText("Ammo Count");
        getContentPane().add(ammotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 58, -1, -1));

        jSlider1.setForeground(new java.awt.Color(255, 0, 0));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(100);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 34, 58, 292));

        jSlider2.setForeground(new java.awt.Color(255, 0, 0));
        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(100);
        getContentPane().add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 34, 69, 292));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Energy");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 6, 49, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Oxigen");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 6, -1, -1));

        positionsubmarine.setForeground(new java.awt.Color(255, 255, 255));
        positionsubmarine.setText("Position");
        positionsubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionsubmarineActionPerformed(evt);
            }
        });
        getContentPane().add(positionsubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 98, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Call of Duty_ Modern Warfare II Worldwide Reveal Trailer.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnsActionPerformed
       main.setMessagesub(" "+jTextFieldsubmarine.getText());
    }//GEN-LAST:event_sendbtnsActionPerformed

    private void tinderbtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinderbtnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinderbtnsActionPerformed

    private void tomahawkbtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomahawkbtnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tomahawkbtnsActionPerformed

    private void sonarbtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonarbtnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonarbtnsActionPerformed

    private void shootbtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootbtnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shootbtnsActionPerformed

    private void positionsubmarineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionsubmarineActionPerformed
         isCheckedPosition = positionsubmarine.isSelected();
    }//GEN-LAST:event_positionsubmarineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammotext;
    private javax.swing.JLabel areatextsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextAreasubmarine;
    private javax.swing.JTextField jTextFieldsubmarine;
    private javax.swing.JCheckBox positionsubmarine;
    private javax.swing.JButton sendbtns;
    private javax.swing.JButton shootbtns;
    private javax.swing.JLabel soldiertext;
    private javax.swing.JButton sonarbtns;
    private javax.swing.JButton tinderbtns;
    private javax.swing.JButton tomahawkbtns;
    // End of variables declaration//GEN-END:variables

    @Override
     public void setAreaClear(boolean isChecked){
        if (isChecked) {
            areatextsub.setText("Area Cleared");
        }else{
            areatextsub.setText("Area Not Cleared");
        }
    }
     
    @Override
    public void setActivateButtons(int value) {
        if (isCheckedPosition) {
            if (value>20) {
                shootbtns.setEnabled(true);
            }else{
                shootbtns.setEnabled(false);
            }
            if (value>40) {
                sonarbtns.setEnabled(true);
            }else{
                sonarbtns.setEnabled(false);
            }
            if (value>60) {
                tomahawkbtns.setEnabled(true);
            }else{
                tomahawkbtns.setEnabled(false);
            }
            if (value>80) {
                tinderbtns.setEnabled(true);
            }else{
                tinderbtns.setEnabled(false);
            }
        }
    }

    @Override
    public void setMessageFromMainController(String message) {
         jTextAreasubmarine.setText(message);
    }
}
