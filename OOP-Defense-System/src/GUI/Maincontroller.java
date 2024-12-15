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
        setLocation(360, 100);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainController");

        jComboBoxselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        jComboBoxselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxselectActionPerformed(evt);
            }
        });

        collect.setBackground(new java.awt.Color(255, 0, 51));
        collect.setText("Collect Informations");
        collect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Soldier Count");

        jLabel2.setText("Fuel Amount");

        jLabel3.setText("Ammo Amount");

        jLabel4.setText("Position");

        msgareasub.setBackground(new java.awt.Color(0, 0, 0));
        msgareasub.setColumns(20);
        msgareasub.setForeground(new java.awt.Color(255, 255, 255));
        msgareasub.setRows(5);
        jScrollPane2.setViewportView(msgareasub);

        sendmsgarea.setColumns(20);
        sendmsgarea.setRows(5);
        jScrollPane4.setViewportView(sendmsgarea);

        areaclearcheckbox.setText("Area Clear");
        areaclearcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaclearcheckboxActionPerformed(evt);
            }
        });

        sendcheckbox.setText("Send Privet");

        sendbtn.setBackground(new java.awt.Color(51, 255, 255));
        sendbtn.setText("Send");
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });

        msgareaheli.setBackground(new java.awt.Color(0, 0, 0));
        msgareaheli.setColumns(20);
        msgareaheli.setForeground(new java.awt.Color(255, 255, 255));
        msgareaheli.setRows(5);
        jScrollPane5.setViewportView(msgareaheli);

        msgareatank.setBackground(new java.awt.Color(0, 0, 0));
        msgareatank.setColumns(20);
        msgareatank.setForeground(new java.awt.Color(255, 255, 255));
        msgareatank.setRows(5);
        jScrollPane6.setViewportView(msgareatank);

        jLabel5.setText("Helicopter");

        jLabel6.setText("Submarine");

        jLabel7.setText("Tank");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mainsliderdefence, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(sendbtn)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sendcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(collect))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(areaclearcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxselect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaclearcheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainsliderdefence, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sendcheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
