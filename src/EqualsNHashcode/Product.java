/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EqualsNHashcode;

import Programmer.data.*;
import java.util.Objects;

/**
 *
 * @author GIE
 */
public class Product {
    public String name;
    public int price;
    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    //toString for easier read.
    @Override
    public String toString() {
        return "Product name: " + name  + ", price : " + price;
    }
    
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        
//        if (!(o instanceof Product)) return false;
//        
//        Product product = (Product) o;
//        if(this.price != product.price) return false;
//        return name != null ? name.equals(product.name) : product.name == null;
//    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + this.price;
        return hash;
    }
    
    
    
}
