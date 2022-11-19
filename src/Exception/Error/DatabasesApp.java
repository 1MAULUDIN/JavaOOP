/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception.Error;
    
/**
 *
 * @author GIE
 */
public class DatabasesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connectDatabase("Egi",null);
    }
    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabasesError("Tidak bisa konek ke databases");
        }
    }
}
