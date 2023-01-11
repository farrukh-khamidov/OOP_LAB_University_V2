package university;

import lib.MyAbstractList;
import lib.array.MyArrayList;

public class Course {
    private int code;
    private String title;
    private String teacher;

    private MyAbstractList students = new MyArrayList();

    public Course(int code, String title, String teacher) {
        this.code = code;
        this.title = title;
        this.teacher = teacher;
    }

    public MyAbstractList getStudents() {
        return students;
    }

    public int getStudentCount() {
        return students.size();
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
        students.add(student);
    }

    @Override
    public String toString() {
        return code + ", " + title + ", " + teacher;
    }
}
