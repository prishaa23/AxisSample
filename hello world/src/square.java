
    public class square extends shape {
        private double length;
        private double breadth;

        public square(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        public double Area() {
            double area = length * breadth;
            System.out.println("Area of Square: " + area);
            return area;
        }
    }

