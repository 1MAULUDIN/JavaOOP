/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

/**
 *
 * @author GIE
 */
public class ReflectionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Egi");
        request.setPassword("28dnjdn");
        ValidationUtil.validationReflection(request);
    }
    
}
