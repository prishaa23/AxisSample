public abstract class shape {
     String color;

    public abstract double Area();

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color set to: " + color);
    }
}