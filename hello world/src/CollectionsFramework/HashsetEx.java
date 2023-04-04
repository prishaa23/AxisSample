package CollectionsFramework;

import java.util.*;
public class HashsetEx {
    public static void main(String[] args) {


        HashSet<String> hs = new HashSet<String>();
        hs.add("Java" );
        hs.add("Python");
        hs.add("C");
        hs.add("C++");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.remove("C"));
        //Displaying using for loop
        for(Object o :hs) {
            System.out.println(o);
        }
    }
}
