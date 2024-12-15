/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Opening;

import DefensSystem.DefenseSystem;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class openWindow extends javax.swing.JFrame {

     private Clip clip;
     
    public openWindow() {
        initComponents();
        setTitle("Defence System");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(400, 150);
        
         try {
            playMusic("src/Opening/123123123.wav");  // Specify your audio file path
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
        }
         
    }
    
     private void playMusic(String musicFile) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Load the music file
        File musicPath = new File(musicFile);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(musicPath);
        clip = AudioSystem.getClip();  // Assign the clip to the class-level variable
        clip.open(audioIn);

        // Start playing the music
        clip.start();

        // Optionally, you can loop the track
        clip.loop(Clip.LOOP_CONTINUOUSLY);  // Uncomment to loop the music
    }

    // Method to stop the music
    private void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();  // Stop the music if it's currently playing
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Order Pizza", 0, 8)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Opening/Call of Duty_ Modern Warfare II Worldwide Reveal Trailer.gif"))); // NOI18N
        jLabel1.setText("Defence System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"Are You Mad Bro !");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        stopMusic();
        dispose();
        DefenseSystem.openjfreams();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
