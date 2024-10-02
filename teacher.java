import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private String teacherID;
    private String subject;
    private List<String> classesHandled;
    private List<Double> gradesSubmitted;

    // Constructor
    public Teacher(String name, int age, String gender, String teacherID, String subject) {
        super(name, age, gender);
        this.teacherID = teacherID;
        this.subject = subject;
        this.classesHandled = new ArrayList<>();
        this.gradesSubmitted = new ArrayList<>();
    }

    // Getter methods
    public String getTeacherID() {
        return teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getClassesHandled() {
        return classesHandled;
    }

    public List<Double> getGradesSubmitted() {
        return gradesSubmitted;
    }

    // Setter methods
    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addClassHandled(String className) {
        classesHandled.add(className);
    }

    public void addGradeSubmitted(Double grade) {
        gradesSubmitted.add(grade);
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{teacherID='" + teacherID + "', subject='" + subject + "', classesHandled=" + classesHandled + ", gradesSubmitted=" + gradesSubmitted + "}";
    }
}
