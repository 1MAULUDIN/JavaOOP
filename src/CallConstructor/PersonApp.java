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
public class PersonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var person1 = new Person("Egi");
        System.out.println(person1.sayHello("Mauludin"));
        
    }
    
}
