package CollectionsFramework;
import java.util.HashMap;
import java.util.*;
public class CollegeMain {
    private Map<String,Set<StudentHash>>College;
    public CollegeMain(){
        College = new HashMap<String,Set<StudentHash>>();
    }
    public CollegeMain(Map<String,Set<StudentHash>>College){
        this.College=College;
    }
    public Map<String,Set<StudentHash>>getCollege(){
        return College;
    }

    public static void main(String[] args) {
        CollegeMain cm = new CollegeMain();
        StudentHash s1 = null;
        Set<StudentHash> set = new HashSet<>();
        String key = "CSE";
        set.add(new StudentHash(1,"prasanthi",89,"cse"));
        set.add(new StudentHash(2,"pooja",90,"cse"));
        set.add(new StudentHash(3,"pranith",92,"cse"));
        Set<StudentHash> set1 = new HashSet<>();
        String key1 = "ECE";
        set.add(new StudentHash(1,"nisha",82,"ece"));
        set.add(new StudentHash(2,"jeshy",75,"ece"));
        set.add(new StudentHash(3,"anu",96,"ece"));
        cm.getCollege().put(key,set);
        cm.getCollege().put(key1,set1);

        Set s=cm.getCollege().keySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(cm.getCollege().get(itr.next()));
        }
    }
}
