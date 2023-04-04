package CollectionsFramework;

import java.util.TreeSet;
import java.util.*;

public class TreesetEx {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Java" );
        ts.add("Python");
        ts.add("C");
        ts.add("C++");
        ts.add("C++");
        ts.add("WT" );
        ts.add("PhP" );
        ts.add("SDLC" );
        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.first());
        System.out.println(ts.ceiling("C++"));
        System.out.println("pollLast: remove the highest(last) element: "+ts.pollLast());
        System.out.println("TailSet: "+ts.tailSet("C++", false));
        //using iterator
        Iterator i=ts.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
