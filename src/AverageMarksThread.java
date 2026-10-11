import java.util.List;

public class AverageMarksThread extends Thread {
    private List<Student> students;

    public AverageMarksThread(List<Student> students) {
        this.students = students;
    }

    @Override
    public void run() {
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
            System.out.printf("Average marks: %.2f\n", s.getAverageMarks());
            System.out.println("letter grade: " + s.getGrade());
            System.out.printf("grade point: %.2f\n\n", s.getGradePoint());
        }
    }
}