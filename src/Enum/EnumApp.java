/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author GIE
 */
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Egi");
        customer.setLevel(Level.VIP);
        
        System.out.println(customer.getName());
        System.out.println(customer.getLevel().toString());
        System.out.println(customer.getLevel().getDescription());
    
        String levelName = Level.VIP.name();
        System.out.println(levelName);
        
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);
        
        Level[] level2 = Level.values();
        for (var i : level2) {
            System.out.println(i);
        }
    }
}
