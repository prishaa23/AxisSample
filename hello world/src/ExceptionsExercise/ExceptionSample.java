package ExceptionsExercise;

public class ExceptionSample {
    public static void main(String[] args) {
        int x= 5/0;
        try {

        }
        catch(ArithmeticException e ){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("From finally");
        }
        System.out.println("Hello");
    }
}
