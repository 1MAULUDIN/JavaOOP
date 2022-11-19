/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryResource;

import java.io.BufferedReader;
import java.io.FileReader;


/** 
 *
 * @author GIE
 */
public class ReadApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try(BufferedReader reader = new BufferedReader(new FileReader("README.txt"))) {
            while (true) {                
                String line = reader.readLine();
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }
    }
    
}
