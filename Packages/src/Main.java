import college.student.student;
import college.faculty.Faculty;
public class Main {
    public static void main(String[] args) {
        student s = new student();
        s.displayStudent("Krishna", 33);
        Faculty f = new Faculty();
        f.displayFaculty("Tanmay Lohakare", "Java Programming");
    }
}
