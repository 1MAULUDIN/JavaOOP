/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variable_Shadowing;

/**
 *
 * @author GIE
 */
public class Person {
    String name;
    String address;
    final String country = "Jepang";
    
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    String sayHello (String name) {
        return "Hi " + name + " my name is " + this.name;
    }
}
