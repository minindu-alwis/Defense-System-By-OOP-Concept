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
public class Helicopter extends javax.swing.JFrame implements warObserver {

    boolean isCheckedPosition = false;
    private Maincontroller main;

    public Helicopter(Maincontroller main) {
        initComponents();
        this.main=main;
        setTitle("Helicopter");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(960, 100);
        setVisible(true);
        laserbtnh.setEnabled(false);
        missilebtnh.setEnabled(false);
        shootbtnh.setEnabled(false);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areatext = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreahelicopter = new javax.swing.JTextArea();
        jTextFieldhelicopter = new javax.swing.JTextField();
        sendbtnh = new javax.swing.JButton();
        shootbtnh = new javax.swing.JButton();
        laserbtnh = new javax.swing.JButton();
        missilebtnh = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        soldiertext = new javax.swing.JLabel();
        ammotext = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        positionhelicopter = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");

        areatext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areatext.setText("Area Not Cleared");

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

        shootbtnh.setBackground(new java.awt.Color(255, 51, 51));
        shootbtnh.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        shootbtnh.setText("Shoot");
        shootbtnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootbtnhActionPerformed(evt);
            }
        });

        laserbtnh.setBackground(new java.awt.Color(0, 255, 102));
        laserbtnh.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        laserbtnh.setText("Laser Operation");
        laserbtnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laserbtnhActionPerformed(evt);
            }
        });

        missilebtnh.setBackground(new java.awt.Color(255, 255, 51));
        missilebtnh.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        missilebtnh.setText("Missile Operation");
        missilebtnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missilebtnhActionPerformed(evt);
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

        positionhelicopter.setText("Position");
        positionhelicopter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionhelicopterActionPerformed(evt);
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
                        .addComponent(shootbtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(missilebtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(laserbtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(positionhelicopter)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addComponent(areatext))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldhelicopter, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sendbtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                                .addComponent(positionhelicopter))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(areatext)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shootbtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(missilebtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(laserbtnh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        main.setMessageheli(" "+jTextFieldhelicopter.getText());
    }//GEN-LAST:event_sendbtnhActionPerformed

    private void laserbtnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserbtnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laserbtnhActionPerformed

    private void missilebtnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missilebtnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missilebtnhActionPerformed

    private void shootbtnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootbtnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shootbtnhActionPerformed

    private void positionhelicopterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionhelicopterActionPerformed
            isCheckedPosition = positionhelicopter.isSelected();
    }//GEN-LAST:event_positionhelicopterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammotext;
    private javax.swing.JLabel areatext;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextAreahelicopter;
    private javax.swing.JTextField jTextFieldhelicopter;
    private javax.swing.JButton laserbtnh;
    private javax.swing.JButton missilebtnh;
    private javax.swing.JCheckBox positionhelicopter;
    private javax.swing.JButton sendbtnh;
    private javax.swing.JButton shootbtnh;
    private javax.swing.JLabel soldiertext;
    // End of variables declaration//GEN-END:variables

    @Override
     public void setAreaClear(boolean isChecked){
        if (isChecked) {
            areatext.setText("Area Cleared");
        }else{
            areatext.setText("Area Not Cleared");
        }
    }
    @Override
    public void setActivateButtons(int value) {
        if (isCheckedPosition) {
            if (value>25) {
                shootbtnh.setEnabled(true);
            }else{
                shootbtnh.setEnabled(false);
            }
            if (value>50) {
                missilebtnh.setEnabled(true);
            }else{
                missilebtnh.setEnabled(false);
            }
            if (value>75) {
                laserbtnh.setEnabled(true);
            }else{
                laserbtnh.setEnabled(false);
            }
        }
    }

    @Override
    public void setMessageFromMainController(String message) {
        jTextAreahelicopter.setText(message);
    }
}
