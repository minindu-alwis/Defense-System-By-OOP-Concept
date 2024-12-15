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
public class Tank extends javax.swing.JFrame implements warObserver{

    boolean isCheckedPosition = false;
    private Maincontroller main;

    public Tank(Maincontroller main) {
        initComponents();
        this.main=main;
        setTitle("Tank");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(360, 500);
        setVisible(true);
        missilebtnt.setEnabled(false);
        redarbtnt.setEnabled(false);
        rotatebtnht.setEnabled(false);
        shootbtnt.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreahelicopter = new javax.swing.JTextArea();
        jTextFieldhelicopter = new javax.swing.JTextField();
        sendbtnh = new javax.swing.JButton();
        shootbtnt = new javax.swing.JButton();
        redarbtnt = new javax.swing.JButton();
        missilebtnt = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        soldiertext = new javax.swing.JLabel();
        ammotext = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        rotatebtnht = new javax.swing.JButton();
        positiontank = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Area Not Cleared");

        jTextAreahelicopter.setColumns(20);
        jTextAreahelicopter.setRows(5);
        jScrollPane1.setViewportView(jTextAreahelicopter);

        sendbtnh.setBackground(new java.awt.Color(0, 204, 204));
        sendbtnh.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 12)); // NOI18N
        sendbtnh.setText("Send");
        sendbtnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnhActionPerformed(evt);
            }
        });

        shootbtnt.setBackground(new java.awt.Color(255, 51, 51));
        shootbtnt.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        shootbtnt.setText("Shoot");
        shootbtnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootbtntActionPerformed(evt);
            }
        });

        redarbtnt.setBackground(new java.awt.Color(0, 255, 102));
        redarbtnt.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        redarbtnt.setText("Redar Operation");
        redarbtnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redarbtntActionPerformed(evt);
            }
        });

        missilebtnt.setBackground(new java.awt.Color(255, 255, 51));
        missilebtnt.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        missilebtnt.setText("Missile Operation");
        missilebtnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missilebtntActionPerformed(evt);
            }
        });

        soldiertext.setText("Soldier Count");

        ammotext.setText("Ammo Count");

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(100);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        rotatebtnht.setBackground(new java.awt.Color(255, 0, 255));
        rotatebtnht.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        rotatebtnht.setText("Rotate Shootion");
        rotatebtnht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotatebtnhtActionPerformed(evt);
            }
        });

        positiontank.setText("Position");
        positiontank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positiontankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shootbtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(missilebtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(soldiertext)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ammotext)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(redarbtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotatebtnht, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(positiontank, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldhelicopter)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sendbtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soldiertext))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ammotext)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(positiontank))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shootbtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(missilebtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redarbtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotatebtnht, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldhelicopter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendbtnh)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbtnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendbtnhActionPerformed

    private void redarbtntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redarbtntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redarbtntActionPerformed

    private void missilebtntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missilebtntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missilebtntActionPerformed

    private void shootbtntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootbtntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shootbtntActionPerformed

    private void rotatebtnhtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotatebtnhtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotatebtnhtActionPerformed

    private void positiontankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positiontankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positiontankActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammotext;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextAreahelicopter;
    private javax.swing.JTextField jTextFieldhelicopter;
    private javax.swing.JButton missilebtnt;
    private javax.swing.JCheckBox positiontank;
    private javax.swing.JButton redarbtnt;
    private javax.swing.JButton rotatebtnht;
    private javax.swing.JButton sendbtnh;
    private javax.swing.JButton shootbtnt;
    private javax.swing.JLabel soldiertext;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setAreaClear(boolean isChecked) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setActivateButtons(int value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setMessageFromMainController(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
