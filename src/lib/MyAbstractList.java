package lib;

public abstract class MyAbstractList {
    public abstract void add(Object element);
    public abstract Object get(int index);
    public abstract int size();
    public boolean isEmpty() {
        return size() == 0;
    }
}
