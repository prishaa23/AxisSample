public class inheritenceActivity{
    public static void main(String[] args) {
        manager m= new manager(126823,"peter","Chennai",2628622,65000);
        trainee t= new trainee(254623,"jack","Mumbai",400081,45000);


        m.calculateSalary();
        m.calculateTransportAllowance();
        t.calculateSalary();
        t.calculateTransportAllowance();
    }
}