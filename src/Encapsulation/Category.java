/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author GIE
 */
public class Category {
    private String id;
    private boolean expensive;
    
    public String getId(){
        return id;   
    }
    
    public void setId(String id) {
        if(id != null) {
        this.id = id;
        }
    }
    
    public boolean isExpensive() {
        return this.expensive;
    }
    
    public void setExpensive(boolean isExpensive) {
        this.expensive = expensive;
    }
}
