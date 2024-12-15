/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interfaces.warObservableInterface;
import Interfaces.warObserver;

/**
 *
 * @author hp
 */
public class warObservable implements warObservableInterface{
    
    private warObserver[] mainWarArray = new warObserver[0];
    boolean isChecked = false;
    int value;
    String message;

    @Override
    public void areaClear(boolean isChecked) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void activeButton(int value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void messageFromMainController(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void extendWarArray(){
        warObserver[] tempArray = new warObserver[mainWarArray.length+1];
        for (int i = 0; i < mainWarArray.length; i++) {
            tempArray[i] = mainWarArray[i];
        }
        mainWarArray = tempArray;
    }
    public void addToWarArray(warObserver ob){
        extendWarArray();
        mainWarArray[mainWarArray.length-1] = ob;
    }
    
}
