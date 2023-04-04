package DateFormats;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class EmployeeArray {
    public String name;
    public Date hireDate;

    public EmployeeArray(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int getYearsOfExperience() {
        Calendar c = Calendar.getInstance();
        c.setTime(hireDate);
        Calendar now = Calendar.getInstance();
        int years = now.get(Calendar.YEAR) - c.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < c.get(Calendar.DAY_OF_YEAR)) {
            years--;
        }
        return years;
    }

    public static void main(String[] args) {
        ArrayList<EmployeeArray> employees = new ArrayList<>();
        employees.add(new EmployeeArray("Prasanthi", new Date(111, 7, 31))); // hired in 2021
        employees.add(new EmployeeArray("Pranith", new Date(117, 5, 23))); // hired in 2017
        employees.add(new EmployeeArray("Nisha", new Date(115, 6, 1))); // hired in 2015

        int maxex = 0;
        String ename = "";
        for (EmployeeArray employee : employees) {
            int experience = employee.getYearsOfExperience();
            System.out.println(employee.getName() + " has " + experience + " years of experience.");
            if (experience > maxex) {
                maxex = experience;
                ename = employee.getName();
            }
        }
        System.out.println(ename +" has highest years of experience that is: " + maxex);


    }
}
