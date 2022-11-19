/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass.app;
import AbstractClass.data.Location;
import AbstractClass.data.City;
/**
 *
 * @author GIE
 */
public class LocationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //var location = new Location(); ERROR
        
        var city = new City();
        city.name = "Sumedang";
        
        System.out.println(city.name);
    }
    
}
