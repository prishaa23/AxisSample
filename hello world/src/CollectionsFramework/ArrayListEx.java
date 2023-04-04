package CollectionsFramework;

import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(2000);
        al.add(30000);
        al.add("Prasanthi");
        al.add(3,"Priya");
        System.out.println(al.toString());
        System.out.println(al.get(4));
        System.out.println(al.size());
        System.out.println(al.indexOf(2000));
        System.out.println(al.subList(2,4));
        System.out.println(al.remove(0));
        System.out.println(al.clone());
        for(Object o :al){
            System.out.println(o);
        }
    }
}
