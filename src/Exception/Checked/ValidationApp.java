
package Exception.Checked;

/**
 *
 * @author GIE
 */
public class ValidationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginRequest loginRequest = new LoginRequest("Egi");
        
        try {     
             ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch(ValidationException | NullPointerException e) {
            System.out.println("Terjadi Error dengan pesan : " + e.getMessage());
        } finally {
            System.out.println("Terimakasih, salam hangat");
        }
    }
    
}
