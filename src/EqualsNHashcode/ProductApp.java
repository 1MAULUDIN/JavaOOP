/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EqualsNHashcode;

import Programmer.data.*;

/**
 *
 * @author GIE
 */
public class ProductApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product product = new Product("Mac Book Pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);
        
        Product product2 = new Product("Mac Book Pro", 30_000_000);
        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
    
}
