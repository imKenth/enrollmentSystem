import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseID;
    private String courseName;
    private String courseCode;
    private String schedule;
    private List<Student> students;

    public Course(String courseID, String courseName, String courseCode, String schedule){
        this.courseID = courseID;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.schedule = schedule;
        this.students = new ArrayList<>();
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getSchedule() {
        return schedule;
    }

    public List<Student> getStudents() {
        return students;
    }
}
