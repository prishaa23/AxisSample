public class circle extends shape {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double Area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }
}
