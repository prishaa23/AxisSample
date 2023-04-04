public class rectangle  {
    int l,b,a,p;
    rectangle() {
        l=31;
        b=23;
    }
    void area() {
        a=l*b;
        System.out.println("Area of Rectangle is : "+a);
    }
    void perimeter(){
        p=2*(l+b);
        System.out.println("perimeter of Rectangle is : "+p);
    }
}
class RectangleDefaultConstructor
{
    public static void main(String args[]) {
        rectangle Rect = new rectangle();
        Rect.area();
        Rect.perimeter();
    }
}
