public class trainee extends  employee {
    trainee(long id, String name, String add, long phone, float salary) {
        super(id, name, add, phone);
        super.basicSalary = salary;
    }
}
