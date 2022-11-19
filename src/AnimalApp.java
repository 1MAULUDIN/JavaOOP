/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import AbstractClass.data.*;
/**
 *
 * @author GIE
 */
public class AnimalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
    
}
