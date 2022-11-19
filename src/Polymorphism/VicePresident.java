/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author GIE
 */
public class VicePresident extends Manager{
    VicePresident(String name){
        super(name);
        
    }
    VicePresident(){
        super(null);
    }
    
    @Override
    String sayHello (String name) {
        return "Hi " + name + ", I am is VicePresident " + super.name;
    }
}
