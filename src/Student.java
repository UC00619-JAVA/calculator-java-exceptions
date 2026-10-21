public class Student {

    private int grade;

    public Student(String name) {
    }

    public int getGrade() {
        return grade;
    }

    // Refuses grades outside 0-20
    public void setGrade(int grade) {
        if (grade < 0 || grade > 20) {
            throw new IllegalArgumentException("Grade must be between 0 and 20: " + grade);
        }
        this.grade = grade;
    }
}
