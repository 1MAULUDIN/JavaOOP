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
public class LoginRequest {
    public String username;
    public String password;

    LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    LoginRequest(String username) {
        this.username = username;
    }
    LoginRequest() {
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

