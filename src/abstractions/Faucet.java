/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author Alex
 */
public class Faucet extends Valve {
    
    @Override
    public void turnHandleOn(){
        System.out.println("I am on now");
    }
    @Override
    public void turnHandleOff(){
        System.out.println("I am off now");
    }
    
    @Override
    public void myUse(){
        System.out.println("I am here to control water flow");
    }
    
    
    
    
}
