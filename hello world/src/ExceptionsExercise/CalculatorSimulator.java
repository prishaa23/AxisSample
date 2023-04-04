package ExceptionsExercise;

public class CalculatorSimulator  {
    public static void main(String[] args) {
        String empName = "Prasanthi";
        boolean isIndian = false;
        double empSal = 34000;

        try {
            double taxAmount = TaxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + taxAmount);
        } catch (EmployeeNameInvalidException e) {
            e.printStackTrace();
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (CountryNotValidException e) {
            e.printStackTrace();
            System.out.println("Country not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            e.printStackTrace();
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }
}
