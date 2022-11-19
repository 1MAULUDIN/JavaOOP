/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;
/**
 *
 * @author GIE
 */
public class CategoriApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var category = new Category();
        category.setId("Id");
        category.setId(null);
        System.out.println(category.getId());
    }
    
}
