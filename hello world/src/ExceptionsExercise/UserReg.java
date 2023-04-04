package ExceptionsExercise;

public class UserReg {
    class InvalidAgeException extends Exception{
        public InvalidAgeException(String message){
            super(message);
        }
    }
    public void registerProfile(String username,int age)
        throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("User is minor");
        }
    }

    public static void main(String[] args) {
        UserReg ur = new UserReg();
        try{
            ur.registerProfile("Prasanthi",11);
        }catch(InvalidAgeException ae){
            System.out.println(ae.getMessage());
        }
    }
}
