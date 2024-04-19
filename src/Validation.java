import java.util.Arrays;

public class Validation {
    private String login;
    private String password;
    private String confirmPassword;
    private static final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_',
            'Q', 'A', 'Z', 'W', 'S', 'X', 'E', 'D', 'C', 'R', 'F', 'V', 'T', 'G', 'B', 'Y', 'H', 'N', 'U', 'J', 'M',
            'I', 'K', 'O', 'L', 'P',
            'q', 'a', 'z', 'w', 's', 'x', 'e', 'd', 'c', 'r', 'f', 'v', 't', 'g', 'b', 'y', 'h',
            'n', 'u', 'j', 'm', 'i', 'k', 'o', 'l', 'p'};

    public Validation(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        checkValidation(login, password, confirmPassword);
    }

    private static void checkValidation(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPasswordAndConfirmPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!checkSymbols(login)) {
            throw new WrongLoginException("Login содержит недопустимые символы");
        }
    }

    private static void checkPasswordAndConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!checkSymbols(password)) {
            throw new WrongPasswordException("Password содержит недопустимые символы");
        }
        char[] c = password.toCharArray();
        char[] b = confirmPassword.toCharArray();
        if (!Arrays.equals(c, b)) {
            throw new WrongPasswordException("Password и ConfirmPassword не совпадают");
        }
    }

    private static boolean checkSymbols(String a) {
        boolean k = true;
        char[] c = a.toCharArray();
        int count = 0;
        if (c.length <= 20) {
            for (char item : c) {
                for (char value : m) {
                    if (item == value) {
                        count++;
                    }
                }
            }
        }
        if (count != c.length) {
            k = false;
        }
        return k;
    }


}




