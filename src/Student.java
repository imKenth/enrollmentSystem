import java.util.ArrayList;
import java.util.List;

public class Student {

       private String studentID;
       private String firstName;
       private String middleName;
       private String lastName;
       private String email;
       private String phone;
       private List<String> courses = new ArrayList<>();

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

           courses.add(1,"BACHELOR OF SCIENCE IN INFORMATION TECHNOLOGY");
           courses.add(2, "BACHELOR OF SCIENCE IN COMPUTER SCIENCE");

           String listCourses = courses.get(1);

           return courses;
       }

}
