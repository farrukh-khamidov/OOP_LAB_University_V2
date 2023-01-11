package lib.linked.list;

import lib.MyAbstractList;

public class MyLinkedList extends MyAbstractList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add(Object element) {
        Node node = new Node(element);
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = tail.getNext();
        }
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Error: IndexOutOfBoundException");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getElement();

    }

    public int size() {
        return size;
    }

}
