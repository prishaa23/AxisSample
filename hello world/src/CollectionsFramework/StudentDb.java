package CollectionsFramework;

public class StudentDb {
    int rollno;
    String name;
    String branch;
    String city;

    @Override
    public String toString() {
        return "CollectionsFramework.StudentDb{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public  StudentDb(int rollno,String name,String branch,String city) {
        this.rollno=rollno;
        this.name=name;
        this.branch=branch;
        this.city=city;

    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }



}
