public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 45, "Male", "T67890", "Mathematics");
        teacher.addClassHandled("Math 101");
        teacher.addGradeSubmitted(89.5);
        System.out.println(teacher);
    }
}
