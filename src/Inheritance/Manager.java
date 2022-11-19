/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author GIE
 */
class Manager {
    String name;
    
    Manager(String name) {
        this.name = name;
    }
    
    Manager(){
        
    }
    
    String sayHello (String name) {
        return "Hi " + name + ". Introduce i'am Manager " + this.name;
    }
    
}
