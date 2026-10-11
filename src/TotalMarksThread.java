import java.util.List;

public class TotalMarksThread extends Thread {
    private List<Student> students;

    public TotalMarksThread(List<Student> students) {
        this.students = students;
    }

    @Override
    public void run() {
        for (Student s : students) {
           // System.out.println("/n Total marks");
            System.out.println("Total Marks for " + s.getName() + ": " + s.getTotalMarks());
        }
    }
}