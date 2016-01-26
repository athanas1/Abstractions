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
public abstract class WebBrowser implements Software {
    private String Name;
    private String AuthorName;
    
    @Override
    public String getName() {
        return Name;
    }
    @Override
    public void setName(String Name){
        
    }
    @Override
    public String getAuthorName() {
        return AuthorName;
    }
   
    @Override
    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }
    
    public abstract void SurfsUp();
    
    @Override
    public void myProcesses(){
        System.out.println("Our processes are ment to explore the web");
    }
}
