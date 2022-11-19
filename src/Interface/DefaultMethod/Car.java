/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DefaultMethod;

interface Hasbrand {
    String getBrand();
}
interface IsMaintenance {
    boolean isMaintence();
}
interface Car extends Hasbrand, IsMaintenance{
    void drive();
    int getTier();
    
    //this is default method
    default boolean isBig() {
        return false;
    }
}

class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Porsche Taycan Turbo");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public boolean isMaintence() {
        return false;
    }

    @Override
    public String getBrand() {
        return "Porsche";
    }

    
}

class Bus implements Car {

    @Override
    public void drive() {
        System.out.println("CBU");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public boolean isMaintence() {
        return false;
    }

    @Override
    public String getBrand() {
        return "Porsche";
    }

    //implementasi default method
    @Override
    public boolean isBig() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
}