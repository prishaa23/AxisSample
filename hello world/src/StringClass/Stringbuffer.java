package StringClass;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("prasanthi");
        System.out.println(sb.length());
        sb.append(" pulipati");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(2,'n');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.substring(1,4));

    }
}
