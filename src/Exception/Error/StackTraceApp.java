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
public class StackTraceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }
    
    public static void sampleError() {
        try {
            String[] names = {"Egi", "Purnama", "M"};
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
