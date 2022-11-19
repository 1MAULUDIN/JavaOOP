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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee = new Employee("Egi");
        System.out.println(employee.sayHello("Mauludin"));
        
        employee = new Manager("Egi");
        System.out.println(employee.sayHello("Mauludin"));
        
        employee = new VicePresident();
        System.out.println(employee.sayHello("Mauludin")+"\n");
        
        sayHello(new Employee("Egi"));
        sayHello(new Manager("Kubo"));
        sayHello(new VicePresident("Minamino"));
    }
    
    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hallo VP " + vicePresident.name);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hallo manager " + manager.name);
        } else {
            System.out.println("Hallo Employee " + employee.name);
        }
    }
}
