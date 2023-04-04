package DateFormats;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EmployeeYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the date of joining from the user
        System.out.print("Enter the date of joining (YYYY-MM-DD): ");
        String dateOfJoiningString = scanner.nextLine();

        // Convert the date of joining string to a Date object
        Date dateOfJoining = null;
        try {
            dateOfJoining = new Date(dateOfJoiningString);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format.");
            System.exit(0);
        }
        // Calculate the experience
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfJoining);
        int yearOfJoining = calendar.get(Calendar.YEAR);
        int monthOfJoining = calendar.get(Calendar.MONTH) + 1;
        int dayOfJoining = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        int yearsOfExperience = currentYear - yearOfJoining;
        int monthsOfExperience = currentMonth - monthOfJoining;
        int daysOfExperience = currentDay - dayOfJoining;

        if (daysOfExperience < 0) {
            monthsOfExperience--;
            daysOfExperience += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (monthsOfExperience < 0) {
            yearsOfExperience--;
            monthsOfExperience += 12;
        }

        // Display the experience
        System.out.printf("The employee has %d years, %d months, and %d days of experience.%n",
                yearsOfExperience, monthsOfExperience, daysOfExperience);
    }
}
