
package Exception.Runtime;


/**
 *
 * @author GIE
 */
public class ValidationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BlankException {
        // TODO code application logic here
        LoginRequest loginRequest = new LoginRequest("Egi","djaii");
        ValidationUtil.validateRuntime(loginRequest);
    }
    
}
