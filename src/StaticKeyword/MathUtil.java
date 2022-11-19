/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticKeyword;




/**
 *
 * @author GIE
 */
public class MathUtil {
    public static int sum(int...values) {
        int total = 0;
        for(var value : values) {
            total += value;
        }
        return total;
    }
}


