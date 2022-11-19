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
public class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }
    
    String sayHello(String name) {
        return "Helo " + name + " my name is Employee " + this.name;
    }
}
