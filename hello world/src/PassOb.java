class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void alterPrimitive(int x, int y) {
        x = 60;
        y = 70;
    }

    void alterObject(Test o) {
        o.a = 23;
        o.b = 31;
    }
}
    public class PassOb{
        public static void main(String[] args) {
            Test ob1 = new Test(100,2);
            System.out.println("before alterPrimitive ob1.a:"+ob1.a+" , ob1.b:"+ob1.b);
            ob1.alterPrimitive(ob1.a,ob1.b);
            System.out.println("after alterPrimitive ob1.a:"+ob1.a+" , ob1.b:"+ob1.b);
            ob1.alterObject(ob1);
            System.out.println("after alterobject ob1.a:"+ob1.a+" , ob1.b:"+ob1.b);
        }
    }

