import java.util.Scanner;

public class triangle {
    private double side1;
    private double side2;
    private double side3;


    public triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double s1 = input.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double s2 = input.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double s3 = input.nextDouble();
        
        triangle tri = new triangle(s1, s2, s3);
        System.out.println("The perimeter of the triangle is: " + tri.getPerimeter());
        System.out.println("The area of the triangle is: " + tri.getArea());

    }
}
