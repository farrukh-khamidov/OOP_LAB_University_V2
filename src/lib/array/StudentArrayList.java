package lib.array;

import university.Student;

public class StudentArrayList {
    public static final int DEFAULT_CAPACITY = 10;
    private Student[] elements;
    private int size;

    public StudentArrayList() {
        this(DEFAULT_CAPACITY);
    }
    public StudentArrayList(int capacity) {
        elements = new Student[capacity];
        size = 0;
    }

    public void add(Student teacher) {
        if (size >= elements.length) {
            Student[] temp = new Student[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        elements[size++] = teacher;
    }

    public Student get(int index) {
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
