import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID:");
        String employeeId = scanner.nextLine();
        if (validateId(employeeId)) {
            System.out.println("Login success");
        } else {
            System.out.println("Incorrect ID");
        }
    }

    public static boolean validateId(String employeeId) {
        if (employeeId.length() != 12) {
            return false;
        }
        if (!employeeId.substring(0, 3).equals("GBL")) {
            return false;
        }
        if (!employeeId.substring(3, 4).equals("/")) {
            return false;
        }
        if (!employeeId.substring(7, 8).equals("/")) {
            return false;
        }
        try {
            int num1 = Integer.parseInt(employeeId.substring(4, 7));
            int num2 = Integer.parseInt(employeeId.substring(8));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
