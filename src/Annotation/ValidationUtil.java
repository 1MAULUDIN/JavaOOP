/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Exception.Checked.*;
import Exception.Runtime.BlankException;
import java.lang.reflect.Field;

/**
 *
 * @author GIE
 */
public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if(loginRequest.getUsername().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if(loginRequest.getPassword() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.getPassword().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }
    
    public static void validationReflection(Object object) {
       Class aClass = object.getClass();
       Field[] fields = aClass.getDeclaredFields();
       
       for(Field field : fields) {
           field.setAccessible(true);
           if(field.getAnnotation(NotBlank.class) != null) {
               //validate
               try {
                   String value = (String) field.get(object); 
                   if(value == null || value.isBlank()) {
                       throw new BlankException("Field " + field.getName() + " is blank");
                   }
               } catch(IllegalAccessException exception) {
                   System.out.println("Tidak bisa mengakses fiel " + field.getName());
               }
           }
       }
    }
    
}
