/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programmer.app;

import Programmer.data.*;

/**
 *
 * @author GIE
 */
public class Application {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30_000_000);
        System.out.println(product.name);
    }
}
