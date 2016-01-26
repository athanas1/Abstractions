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
public interface Software {
     
    public abstract String getName();
    
    public abstract void setName(String Name);
    
    public abstract String getAuthorName();
    
    public abstract void setAuthorName(String AuthorName);
    
    
    public abstract void myProcesses();
}
