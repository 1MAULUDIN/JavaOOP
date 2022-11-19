/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticKeyword;

/**
 *
 * @author GIE
 */
public class StaticBlock {
    public static final int PROCESSORS;
    
   static {
       System.out.println("Mengakses class StaticBlock");
       PROCESSORS = Runtime.getRuntime().availableProcessors();
   }
}
