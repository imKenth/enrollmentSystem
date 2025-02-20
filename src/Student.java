import java.util.*;

public class Student {

       private String studentID;
       private String firstName;
       private String middleName;
       private String lastName;
       private String email;
       private String phone;
       private List<String> courses = new ArrayList<>();
       private Map<String, Student> l = new HashMap<>();

       private String fullName = firstName + " " + middleName + " " + lastName;

       public void Student(String studentID, String fullName, String email, String phone){
           this.studentID = studentID;
           this.fullName = fullName;
           this.email = email;
           this.phone = phone;
       }

       public String getStudentID(){
           return studentID;
       }

       public String getFirstName(){
           return firstName;
       }

       public String getMiddleName(){
           return middleName;
       }

       public String getLastName(){
           return lastName;
       }

       public String getEmail(){
           return email;
       }

       public String getPhone(){
           return phone;
       }

       public List<String> getCourses(){

           courses.add("Bachelor of Science in Information Technology");
           courses.add("Bachelor of Science in Computer Science");
           courses.add("Bachelor of Science in Information Systems");
           courses.add("Bachelor of Library and Information Science");
           courses.add("Bachelor of Science in Entertainment and Multimedia Computing – Digital Animation");
           courses.add("Bachelor of Science in Entertainment and Multimedia Computing – Game Development");
           courses.add("Bachelor of Arts in Multimedia Arts");

           for(int i = 0; i < courses.size(); i++){
               System.out.println(i +". " +courses.get(i));
           }

           return courses;
       }

}
