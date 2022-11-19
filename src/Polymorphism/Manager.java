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
public class Manager extends Employee{
    
    String company;
    
    Manager(String name){
        super(name);
    }
    
    Manager(String name, String company) {
        super(name);
        this.company = company;
    }
    
    @Override
    String sayHello (String name) {
        return "Hi " + name + ", I am is manager " + super.name;
    }
}
