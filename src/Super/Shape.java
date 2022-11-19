/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author GIE
 */
public class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    @Override
    int getCorner() {
        return 5;
    }
    
    int getParentCorner() {
        return super.getCorner();
    }
}
