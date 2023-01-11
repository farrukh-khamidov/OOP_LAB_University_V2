package lib.linked.list;

import university.Student;

public class StudentNode {
    private Student element;
    private StudentNode next;

    public StudentNode(Student element) {
        this.element = element;
    }

    public StudentNode(Student element, StudentNode next) {
        this.element = element;
        this.next = next;
    }

    public Student getElement() {
        return element;
    }

    public void setElement(Student element) {
        this.element = element;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }
}
