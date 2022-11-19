/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variable_Hiding;

/**
 *
 * @author GIE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Child child = new Child();
        child.name = "Egi";
        child.doIt();
        System.out.println(child.name);
        System.out.println();
        
        Parent parent = (Parent) child; 
        parent.doIt();
    }
    
}
