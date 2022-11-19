/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIE
 */
public class Person {
    
    String name;
    String address;
    int age;
    final String country = "Indenesia";
    
    //constructor
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }
    
    //constructor overloading
    Person(String paramName) {
        name = paramName;
    }
    
    //constructor overloading tanpa parameter
    Person() {
        
    }
    
    String sayHello(String paramName) {
        return "Hello " + paramName + " my name is " + name;
    }
}

