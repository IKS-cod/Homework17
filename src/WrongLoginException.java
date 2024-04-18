import java.io.IOException;

public class WrongLoginException {
    private static final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_',
            'Q', 'A', 'Z', 'W', 'S', 'X', 'E', 'D', 'C', 'R', 'F', 'V', 'T', 'G', 'B', 'Y', 'H', 'N', 'U', 'J', 'M',
            'I', 'K', 'O', 'L', 'P',
            'q', 'a', 'z', 'w', 's', 'x', 'e', 'd', 'c', 'r', 'f', 'v', 't', 'g', 'b', 'y', 'h',
            'n', 'u', 'j', 'm', 'i', 'k', 'o', 'l', 'p'};


    public static void checkLogin(String login) throws IOException {
        char[] c = login.toCharArray();
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
            throw new IOException();
        }
    }
}

