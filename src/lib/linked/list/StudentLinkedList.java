package lib.linked.list;

import university.Student;

public class StudentLinkedList {
    private StudentNode head;
    private StudentNode tail;
    private int size;

    public StudentLinkedList() {
        size = 0;
    }

    public void add(Student element) {
        StudentNode node = new StudentNode(element);
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = tail.getNext();
        }
        size++;
    }

    public Student get(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Error: IndexOutOfBoundException");
            return null;
        }
        StudentNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getElement();

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
