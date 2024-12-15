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

   public void areaClear(boolean isChecked) {
        if (this.isChecked!=isChecked) {
            this.isChecked=isChecked;
        }
        areaClearing();
    }
    
    public void areaClearing(){
        for (warObserver observer : mainWarArray) {
            observer.setAreaClear(isChecked);
        }
    }

    @Override
    public void activeButtons(int value) {
        if (value!=0) {
            this.value = value;
        }
        activatingButtons();
    
    }
    
     public void activatingButtons(){
        for (warObserver observer : mainWarArray) {
            observer.setActivateButtons(value);
        }
    }

  public void messageFromMainController(String message){
        if (message!=null) {
            this.message = message;
        }
        messageSending();
    }
    
    public void messageSending(){
        for (warObserver observer : mainWarArray) {
            observer.setMessageFromMainController(message);
        }
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
