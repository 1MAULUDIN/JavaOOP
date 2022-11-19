/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DefaultMethod;



/**
 *
 * @author GIE
 */
public class CarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Car car = new Porsche();
        System.out.println(car.isMaintence());
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        car.drive();
    }
    
}
