/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author Alex Thanas
 */
public class Chrome extends WebBrowser {
    
    @Override
    public void SurfsUp(){
        System.out.println("Were Surfing the web, Man.");
    }
    @Override
    public void myProcesses(){
        System.out.println("We are the Process called Google Chrome.");
    }
}
