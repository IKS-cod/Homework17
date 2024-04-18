import java.io.IOException;
import java.util.Arrays;

public class Validation {
    private String login;
    private String password;
    private String confirmPassword;


    public Validation(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public static void checkValidation(String login, String password, String confirmPassword) {
        try {
            WrongLoginException.checkLogin(login);
            WrongPasswordException.checkPasswordAndConfirmPassword(password, confirmPassword);
        } catch (IOException e) {
            System.out.println("WrongLoginException");
        } catch (Exception e) {
            System.out.println("WrongPasswordException");
        }
    }
}




