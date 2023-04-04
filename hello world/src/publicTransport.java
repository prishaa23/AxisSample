public class publicTransport implements vehicle {
    int no_of_passengers;

    @Override
    public void drive() {
        System.out.println("Bus is in driving mode");
    }

    @Override
    public void turnleft() {
        System.out.println("Bus is taking left");
    }

    @Override
    public void brake() {
        System.out.println("Bus is on brake");
    }
}
