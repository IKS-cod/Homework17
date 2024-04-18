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
    }

    public static void checkValidation(String login, String password, String confirmPassword) {
        try {
            WrongLoginException.checkLogin(login);
            WrongPasswordException.checkPasswordAndConfirmPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}




