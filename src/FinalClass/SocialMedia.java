/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalClass;

/**
 *
 * @author GIE
 */
public class SocialMedia {
    String name;
   
    public static void main(String[] args) {
      SocialMedia facebook = new Facebook();
    }
    
}

//final class Facebook extends SocialMedia {
//    
//}

 class Facebook extends SocialMedia {
    final void login(String username, String password) {
        
    }
}

class FakeFacebook extends Facebook {
//    @Override
//    void login(String username, String password){
//        will be an error 
//    }
}
