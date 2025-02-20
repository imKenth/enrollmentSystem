import java.util.*;

public class Student {

       private String studentID;
       private String firstName;
       private String middleName;
       private String lastName;
       private String email;
       private String phone;
       private List<Course> courses;


       public Student(String studentID, String firstName, String middleName, String lastName, String email, String phone){
           this.studentID = studentID;
           this.firstName = firstName;
           this.middleName = middleName;
           this.lastName = lastName;
           this.email = email;
           this.phone = phone;
           this.courses = new ArrayList<>();
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
           if(email.contains("@") && email.contains(".")){
               return email;
           } else {
               return "Invalid Format!";
           }
       }

       public String getPhone(){
           return phone;
       }

       public void enrollCourse(Course course){
           courses.add(course);
           System.out.print("Enroll in: " +course.getCourseName());
       }

       public List<Course> getCourses(){
         return courses;
       }

       public void chooseCourses(){
           List<Course> availableCourses = new ArrayList<>();
           availableCourses.add(new Course("1","Bachelor of Science in Information Technology", "IT101", "MTW"));
           availableCourses.add(new Course("2", "Bachelor of Science in Computer Science", "CS101", "TTh"));
           availableCourses.add(new Course("3", "Bachelor of Science in Information Systems", "IS101", "MWF"));

           for(int i = 0; i < courses.size(); i++){
               System.out.println(i +". " +courses.get(i));
           }

           Scanner sc = new Scanner(System.in);
           System.out.print("Choose a course to enroll: ");
           int index = sc.nextInt();
           if(index >= 0 && index < courses.size()){
               System.out.print("Enrolled in: " +courses.get(index));
           } else {
               System.out.print("Invalid course selection");
           }
       }
}
