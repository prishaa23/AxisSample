package StringClass;

public class Stringmethod {
    public static void main(String[] args) {
        String name = "Priya";
        String name2 = "prasanthi";
        System.out.println("name :" +name);
        System.out.println("3rd letter of name : "+ name.charAt(3));
        System.out.println("priya compared prasanthi : "+ name.compareTo("prasanthi"));
        System.out.println("using equals to :" + name.equals("priya"));
        System.out.println("length of the name : "+ name.length());
        System.out.println("to upper case : "+name.toUpperCase());
        System.out.println("finding the substring :" +name.substring(1,3));
        System.out.println("replacing a char :" +name.replace('a','n'));
        System.out.println("using trim : "+name.trim());
        System.out.println("using concatination : "+ name.concat(name2));
        System.out.println("get hashcode : "+name.hashCode());

    }
}
