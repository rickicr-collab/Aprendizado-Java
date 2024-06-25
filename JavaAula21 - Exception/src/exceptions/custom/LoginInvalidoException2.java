package exceptions.custom;

@SuppressWarnings("serial")
public class LoginInvalidoException2 extends Exception {
    
    public LoginInvalidoException2() {
	super("Login Invelido");
    }
    
    public LoginInvalidoException2(String message) {
	super(message);
    }

}
