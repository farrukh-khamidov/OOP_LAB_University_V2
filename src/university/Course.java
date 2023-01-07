package university;

public class Course {
    private int code;
    private String title;
    private String teacher;

    private Student[] students = new Student[100];
    private int studentCount = 0;

    public Course(int code, String title, String teacher) {
        this.code = code;
        this.title = title;
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    public void addStudent(Student student) {
        students[studentCount++] = student;
    }

    @Override
    public String toString() {
        return code + ", " + title + ", " + teacher;
    }
}
