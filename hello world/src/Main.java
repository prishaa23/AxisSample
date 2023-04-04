public class Main {
    public static void main(String[] args) {
        vehicle v;
        v = new motarizedVehicle();
            v.drive();
            v.turnleft();
            v.brake();

        v = new publicTransport();
            v.drive();
            v.turnleft();
            v.brake();
    }
}