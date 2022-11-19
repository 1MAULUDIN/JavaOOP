/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception.Checked;

/**
 *
 * @author GIE
 */
public class ValidationException extends Throwable{
    public ValidationException(String message) {
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
