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
public class CarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car = new Porsche();
        System.out.println(car.getTier());
        car.drive();
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
    }
    
}
