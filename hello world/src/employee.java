public class employee {
    long empId;
    String empName;
    String empAddress;
    long empPhone;
    double basicSalary;
    double specialAllowance=250.80;
    double hra=1000.50;
    float salary;

    employee(long id, String name, String add, long phone){
        this.empId=id;
        this.empName=name;
        this.empAddress=add;
        this.empPhone=phone;
    }

    void calculateSalary(){
        float salary;
        salary= (float) (basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100));
        System.out.println("Salary of "+this.empName+ ": "+salary);
    }

    void calculateTransportAllowance(){
        double transport=10*basicSalary/100;
        System.out.println("TransportAllowance of Trainee:"+transport);
    }

}