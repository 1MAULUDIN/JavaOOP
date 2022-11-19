/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception.Runtime;

import Exception.Checked.*;

/**
 *
 * @author GIE
 */
public class LoginRequestApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Egi","rahasia");
        System.out.println(loginRequest.username);
        System.out.println(loginRequest.password);
        
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Egi"));
        System.out.println(new LoginRequest("Egi","rahasia"));
    }
}
