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
    
}
