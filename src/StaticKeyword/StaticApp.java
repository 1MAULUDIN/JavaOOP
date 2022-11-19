/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticKeyword;
import static StaticKeyword.Constant.*;
import static StaticKeyword.StaticBlock.PROCESSORS;
/**
 *
 * @author GIE
 */
public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        
        System.out.println(
            MathUtil.sum(1,2,3)
        );
        
        Country.City city = new Country.City();
        city.setName("Sumedang");
        System.out.println(city.getName());
        
        System.out.println(PROCESSORS);
    }
}
