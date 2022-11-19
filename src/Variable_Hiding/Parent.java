/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variable_Hiding;

/**
 *
 * @author GIE
 */
class Parent {
    String name;
    void doIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    String name;
    @Override
    void doIt() {
        System.out.println("Do it in Child");
        System.out.println("Parent name is " + super.name);
        
    }
}
