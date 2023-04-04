package CollectionsFramework;

import java.util.*;
public class VectorListEx {
    public static void main(String[] args) {
        Vector<String>v = new Vector<String>();
        v.add("Priya");
        v.add("Prasanthi");
        v.add("Nisha");
        v.add("jeshy");
        v.add("pranith");
        System.out.println(v);
        System.out.println("Size after addition: "+v.size());
        v.remove(1);
        System.out.println(v.toString());
        System.out.println(v.capacity());

    }
}
