/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefensSystem;

import Controller.warObservable;
import GUI.Helicopter;
import GUI.Maincontroller;
import GUI.Submarine;
import GUI.Tank;
import Opening.openWindow;

/**
 *
 * @author hp
 */
public class DefenseSystem {
    
    public static void main(String[] args) {
        
        new openWindow().setVisible(true);
   
    }
    
    public static void openjfreams(){
    
        warObservable war = new warObservable();
        Maincontroller main = new Maincontroller(war);
        
        war.addToWarArray(new Helicopter(main));
        war.addToWarArray(new Tank(main));
        war.addToWarArray(new Submarine(main));
    
    }
}
