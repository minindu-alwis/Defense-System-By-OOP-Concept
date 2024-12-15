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
        setLocation(960, 500);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");

        areatextsub.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areatextsub.setText("Area Not Cleared");

        jTextAreasubmarine.setColumns(20);
        jTextAreasubmarine.setRows(5);
        jScrollPane1.setViewportView(jTextAreasubmarine);

        sendbtns.setBackground(new java.awt.Color(0, 204, 204));
        sendbtns.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 12)); // NOI18N
        sendbtns.setText("Send");
        sendbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnsActionPerformed(evt);
            }
        });

        shootbtns.setBackground(new java.awt.Color(255, 51, 51));
        shootbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        shootbtns.setText("Shoot");
        shootbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootbtnsActionPerformed(evt);
            }
        });

        tomahawkbtns.setBackground(new java.awt.Color(0, 255, 102));
        tomahawkbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        tomahawkbtns.setText("Tomahawk Misssile");
        tomahawkbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomahawkbtnsActionPerformed(evt);
            }
        });

        sonarbtns.setBackground(new java.awt.Color(255, 255, 51));
        sonarbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        sonarbtns.setText("Sonar Operation");
        sonarbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonarbtnsActionPerformed(evt);
            }
        });

        tinderbtns.setBackground(new java.awt.Color(255, 0, 255));
        tinderbtns.setFont(new java.awt.Font("Myriad Pro Light", 0, 12)); // NOI18N
        tinderbtns.setText("Trident-2 Missile");
        tinderbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinderbtnsActionPerformed(evt);
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

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(100);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Energy");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Oxigen");

        positionsubmarine.setText("Position");
        positionsubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionsubmarineActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shootbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sonarbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(79, 79, 79)
                                            .addComponent(areatextsub))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldsubmarine, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sendbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tomahawkbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tinderbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(positionsubmarine)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26))))
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
                                .addComponent(positionsubmarine))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(areatextsub)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shootbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sonarbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tomahawkbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tinderbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldsubmarine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendbtns)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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
