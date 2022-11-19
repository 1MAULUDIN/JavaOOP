/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author GIE
 */
public interface Car {
    void drive();
    int getTire();
}

class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("Avanza Drive");
    }

    
    @Override
    public int getTire() {
        return 4;
    }

   
    
}