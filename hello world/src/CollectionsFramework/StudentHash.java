package CollectionsFramework;

public class StudentHash {
    int sid;
    String sname;
    int marks;
    String dept;
    public StudentHash(int sid, String sname,int marks,String dept){
        this.sid=sid;
        this.sname=sname;
        this.marks= marks;
        this.dept=dept;
    }

    @Override
    public String toString() {
        return "StudentHash{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                ", dept='" + dept + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
