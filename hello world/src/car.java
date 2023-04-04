
    public class car extends imotorizedvehicle implements ivehicle {
        @Override
        public void drive() {
            System.out.println("The car is driving");
        }

        @Override
        public void turnLeft() {
            System.out.println("The car is turning left");
        }

        @Override
        public void brake() {
            System.out.println("The car is in brake mode");
        }
    }


