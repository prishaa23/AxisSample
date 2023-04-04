package CollectionsFramework;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;
public class StudentAL {
    public static void main(String[] args) {
        List<StudentDb>slist = new ArrayList<StudentDb>();
        newStudent ns = new newStudent();
        for(int i =0;i<3;i++){
            slist.add(ns.std[i]);
        }
        //using for loop
        for(StudentDb s :slist){
            System.out.println(s.getCity());
        }
        System.out.println("Changing array to list: ");
        Object[] arr = slist.toArray();
        //Displaying array elements
        for(int i =0;i<3;i++)
            System.out.println(arr[i]+",");
        slist.sort(Comparator.comparing(StudentDb::getName));
        //Displaying using iterator
        Iterator it = slist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
    }

