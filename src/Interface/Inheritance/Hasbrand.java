/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Inheritance;

/**
 *
 * @author GIE
 */
public interface Hasbrand {
    String getBrand();
}

interface IsMaintenance {
    boolean isMaintenance();
}

interface Car extends Hasbrand, IsMaintenance {
    void drive();
    int getTier();
}
 
class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Porsche Taycan Turbo");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Porsche";
    }
    
    @Override
    public boolean isMaintenance() {
        return false;
    }
}