import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generate your Security Code ");
        String code = sc.nextLine();
        sc.close();

        if (isValidCode(code)) {
            System.out.println("Security Code Generated Successfully");
        } else {
            System.out.println("Invalid Security Code, Try Again!");
        }
    }
    public static boolean isValidCode(String code) {
        if (code.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (c == '@' || c == '*' || c == '#') {
                hasSpecialChar = true;
            } else {
                return false; // invalid character found
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar;
    }
}
