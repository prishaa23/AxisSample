package Serializable;
import java.io.Serializable;
public class EmployeeEx implements Serializable {
    long empId;
    String empName;
    transient float salary;

    EmployeeEx(long id, String name, long salary ) {
        this.empId = id;
        this.empName = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeEx{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

