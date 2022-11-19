/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        var person1 = new Person("Egi", "Jawa Barat");
        
        
        
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        System.out.println(person1.sayHello("Mauludin")+"\n");
        
        Person person2 = new Person("Mauludin");
        System.out.println(person2.sayHello("Purnama"));
        
        Person person3;
        person3 = new Person();
         
    }
    
}
