package CollectionsFramework;
import java.util.*;
public class MapEx {

    public static void main(String[] args) {
            Map map=new HashMap();
            //Adding elements to map
            map.put(1,"Java");
            map.put(5,"Python");
            map.put(2,"C");
            map.put(6,"WT");
            map.put(2,"Banana");
            map.put(4,"Grapes");
            map.put(23,null);
        System.out.println(map.get(5));

        //Traversing Map
            Set set=map.entrySet();//Converting to Set so that we can traverse
            Iterator itr=set.iterator();
            while(itr.hasNext()){
                //Converting to Map.Entry so that we can get key and value separately
                Map.Entry entry=(Map.Entry)itr.next();
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
    }
    }

