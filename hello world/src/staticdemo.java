public class staticdemo {

        private static int x=0;
        private int y=3;
        public staticdemo(){
            x++;
            y+=5;
            System.out.println("X is"+x+"and Y is "+y);
        }

        public static void main(String[] args) {
            staticdemo s1 = new staticdemo();
            staticdemo s2 = new staticdemo();
            staticdemo s3 = new staticdemo();
        }
    }

