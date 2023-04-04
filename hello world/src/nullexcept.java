public class nullexcept {
    public static void main(String[] args) {

     String s = null;
            try {
                System.out.println(s.toString());
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }

}
