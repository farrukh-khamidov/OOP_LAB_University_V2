package university;

import lib.MyAbstractList;
import lib.array.MyArrayList;

public class Student {
    private int id;
    private String firstName;
    private String lastName;

    private MyAbstractList courses = new MyArrayList();

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public MyAbstractList getCourses() {
        return courses;
    }

    public int getCourseCount() {
        return courses.size();
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }
}
