import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Rahim", Department.CSE, 80, 75, 90),
                new Student(102, "Karim", Department.CSE, 92, 88, 95),
                new Student(103, "Sadia", Department.EEE, 70, 65, 72),
                new Student(104, "Tanvir", Department.EEE, 45, 50, 48),
                new Student(105, "Nusrat", Department.BBA, 85, 82, 88),
                new Student(106, "Mim", Department.BBA, 60, 58, 62)
        );

        for (Student s : students) {
            s.displayInfo();
        }

        TotalMarksThread t1 = new TotalMarksThread(students);
        AverageMarksThread t2 = new AverageMarksThread(students);
        DepartmentGradeCountThread t3 = new DepartmentGradeCountThread(students);

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result processing completed");
    }
}