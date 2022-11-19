/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception.Runtime;

/**
 *
 * @author GIE
 */
public class BlankException extends RuntimeException{
    public BlankException(String message) {
        super(message);
    }
    
    
    //manual
//    private String message;
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
    
}
