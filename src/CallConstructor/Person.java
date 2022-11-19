/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallConstructor;

/**
 *
 * @author GIE
 */
public class Person {
    String name;
    String address;
    final String country = "Indonesia";
    
    
    Person (String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }
    
    Person(String paramName) {
        this(paramName,null);
    }
    Person() {
        this(null);
    }
    
    String sayHello(String paramName) {
        return "Hi " + paramName +  " my name is " + name;
    }
    
}
