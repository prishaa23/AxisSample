 class Student {
     String studentId;
     int mark1,mark2;

     public static void main(String[] args) {
         Student s = new Student();
                 s.studentId="1A";
                 s.mark1=100;
                 s.mark2=80;
          Resultcal rc = new Resultcal();
                 System.out.println(rc.calculateResult(s));

     }
 }
     class Result {
         String studentId,grade;

         @Override
         public String toString() {
             return  "studentId='"+studentId+'\''+", Grade : '"+grade+'\'';
         }
     }

    public class Resultcal {
        public Result calculateResult(Student student){
            int total = student.mark1+ student.mark2;
            Result result = new Result();
            result.studentId = student.studentId;
            if((total/2)<60){
                result.grade = "fail";
            } else{
                result.grade="pass";
            }
            return result;
        }
    }

