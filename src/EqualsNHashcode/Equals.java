/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EqualsNHashcode;

/**
 *
 * @author GIE
 */
public class Equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String first = "Egi";
        first = first + " " + "Purnama";
        System.out.println(first);
        
        String second = "Egi Purnama";
        String third = "Egi Purnama";
        
        System.out.println(second);
        System.out.println(third);
        System.out.println(second == first);
        System.out.println(second == third);
        System.out.println(second.equals(first));
        
    }
    
}
