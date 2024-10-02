public class Student extends User {
    private String studentID;
    private double creditHours;
    private double gpa;

    // Constructor
    public Student(String name, int age, String gender, String studentID, double creditHours, double gpa) {
        super(name, age, gender);
        this.studentID = studentID;
        this.creditHours = creditHours;
        this.gpa = gpa;
    }

    // Getter methods
    public String getStudentID() {
        return studentID;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter methods
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{studentID='" + studentID + "', creditHours=" + creditHours + ", gpa=" + gpa + "}";
    }
}
