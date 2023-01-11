package university;

import lib.array.CourseArrayList;

public class Student {
    private int id;
    private String firstName;
    private String lastName;

    private CourseArrayList courses = new CourseArrayList();

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

    public CourseArrayList getCourses() {
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
