package ExceptionsExercise;

import java.util.Scanner;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Candidate {
    private String name;
    private String gender;
    private double expectedSalary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
}
public class Userdefined {
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("Gender");
        String gender = sc.nextLine();
        System.out.println("Expected Salary");
        double expectedSalary = sc.nextDouble();

        if (expectedSalary < 10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }

        Candidate candidate = new Candidate();
        candidate.setName(name);
        candidate.setGender(gender);
        candidate.setExpectedSalary(expectedSalary);

        return candidate;
    }
    public static void main(String[] args) {
        try {
            Candidate candidate = getCandidateDetails();
            if (candidate != null) {
                System.out.println("Registration Successful");
            }
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}