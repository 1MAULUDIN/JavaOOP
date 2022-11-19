
package Inheritance;

public class VicePresident extends Manager{
    VicePresident(String name) {
        super(name);
    }
    
    VicePresident(){
    
    }
    
    @Override
    String sayHello (String name) {
        return "Hi " + name + ". I'm your VicePresident " + this.name;
    }
}
