
    public class itrain implements ivehicle, ipublicTransport {
        private int numOfPeople;

        public itrain(int numOfPeople) {
            this.numOfPeople = numOfPeople;
        }

        @Override
        public void drive() {
            System.out.println("The train is driving");
        }

        @Override
        public void turnLeft() {
            System.out.println("The train is turning left");
        }

        @Override
        public void brake() {
            System.out.println("The train is in brake mode");
        }

        @Override
        public int getNumberOfPeople() {
            return numOfPeople;
        }
    }


