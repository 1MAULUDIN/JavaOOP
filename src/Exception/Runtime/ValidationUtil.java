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
public class ValidationUtil {
    public static void validateRuntime(LoginRequest loginRequest) throws BlankException{
        if(loginRequest.getUsername() == null) {
            throw new BlankException("Username tidak boleh null");
        } else if(loginRequest.getUsername().isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        } else if(loginRequest.getPassword() == null) {
            throw new BlankException("Username tidak boleh null");
        } else if(loginRequest.getPassword().isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        }
    }
    
}
