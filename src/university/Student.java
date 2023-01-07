package university;

public class Student {
    private int id;
    private String firstName;
    private String lastName;

    private Course[] courses = new Course[25];
    private int courseCount = 0;

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
        courses[courseCount++] = course;
        course.addStudent(this);
    }

    public Course[] getCourses() {
        return courses;
    }

    public int getCourseCount() {
        return courseCount;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }
}
