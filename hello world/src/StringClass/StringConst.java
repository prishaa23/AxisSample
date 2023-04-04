package StringClass;

public class StringConst {
    public static void main(String[] args) {
        String s1 = new String();
        char chars [] ={'p','r','i','y','a'};
        String s2 = new String(chars);
        byte bytes [] ={'p','r','a','s','a','n','t','h','i'};
        String s3 = new String(bytes);
        String s4 = new String(chars,1,3);
        String s5 = new String(s2);
        String s6 = s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

    }
}
