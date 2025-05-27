import java.util.ArrayList;
public class Practice {
   public static void main(String[]args) {
      ArrayList<Student> uuz = new ArrayList<>();
      Student s1 = new Student("Cell", 11, "male");
      Student s2 = new Student("Sky" , 18 , "femboy");
      Student s3 = new Student("reium" , 15 , "female");
      uuz.add(s1);
      uuz.add(s2);
      uuz.add(s3);
      System.out.println(Tool.getMaxage(uuz));
   }
}
class Student {
   String name;
   int age;
   String gender;
   public Student(String name, int age, String gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
   }
   public Student() {
   }
}
class Tool {
   public static int getMaxage(ArrayList<Student> uuz) {
      int maxAge=uuz.get(0).age;
      for(Student s : uuz) {
         if(s.age > maxAge) maxAge = s.age;
      }
      return maxAge;
   }
}
