import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentGradeCountThread extends Thread {
    private List<Student> students;

    public DepartmentGradeCountThread(List<Student> students) {
        this.students = students;
    }

    @Override
    public void run() {
        String[] grades = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
        Map<Department, Map<String, Integer>> deptGradeCounts = new HashMap<>();

        // Initialize counts for each department
        for (Department dept : Department.values()) {
            Map<String, Integer> gradeMap = new HashMap<>();
            for (String g : grades) {
                gradeMap.put(g, 0);
            }
            deptGradeCounts.put(dept, gradeMap);
        }

        // Calculate counts using student's department and grade methods
        for (Student s : students) {
            String grade = s.getGrade();
            Department dept = s.getDepartment();
            deptGradeCounts.get(dept).put(grade, deptGradeCounts.get(dept).get(grade) + 1);
        }

        // Display counts
        System.out.println("Department wise Grade count:");
        for (Department dept : Department.values()) {
            System.out.print(dept + ":");
            Map<String, Integer> gradeMap = deptGradeCounts.get(dept);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < grades.length; i++) {
                String g = grades[i];
                sb.append(g).append("=").append(gradeMap.get(g));
                if (i < grades.length - 1) {
                    sb.append(",");
                }
            }
            System.out.println(sb.toString());
        }
    }
}