public class Student {
    private int id;
    private String name;
    private Department department;
    private int mark1, mark2, mark3;

    public Student(int id, String name, Department department,
                   int mark1, int mark2, int mark3) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getTotalMarks() {
        return mark1 + mark2 + mark3;
    }

    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    public String getGrade() {
        double avg = getAverageMarks();

        if (avg >= 90) return "A+";
        else if (avg >= 85) return "A";
        else if (avg >= 80) return "B+";
        else if (avg >= 75) return "B";
        else if (avg >= 70) return "C+";
        else if (avg >= 65) return "C";
        else if (avg >= 60) return "D+";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public double getGradePoint() {
        switch (getGrade()) {
            case "A+": return 4.00;
            case "A":  return 3.75;
            case "B+": return 3.50;
            case "B":  return 3.25;
            case "C+": return 3.00;
            case "C":  return 2.75;
            case "D+": return 2.50;
            case "D":  return 2.25;
            default:   return 0.00;
        }
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println(
                id + " ," + name + " ," + department + ",[" + mark1 + " ," + mark2 + " ," + mark3 + "]"
        );
    }
}