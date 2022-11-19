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
public class PersonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var person = new Person("Egi", "Tokyo");
        System.out.println(person.sayHello("Mauludin"));
    }
    
}
