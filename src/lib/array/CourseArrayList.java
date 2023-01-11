package lib.array;

import university.Course;

public class CourseArrayList {
    public static final int DEFAULT_CAPACITY = 10;
    private Course[] elements;
    private int size;

    public CourseArrayList() {
        this(DEFAULT_CAPACITY);
    }
    public CourseArrayList(int capacity) {
        elements = new Course[capacity];
        size = 0;
    }

    public void add(Course teacher) {
        if (size >= elements.length) {
            Course[] temp = new Course[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        elements[size++] = teacher;
    }

    public Course get(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Error: IndexOutOfBoundException");
            return null;
        }
        return elements[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
