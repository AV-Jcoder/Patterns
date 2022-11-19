package Behavior.Iterator;

public class ArrayList<E> implements Iterable {
    private Object[] array;
    private int currentSize;

    public ArrayList(int size) {
        array = new Object[size];
    }

    public void add(E element) {
        array[currentSize++] = element;
    }

    public void remove(int index) {
        for (int i = index; i < currentSize-1 ; i++) {
            array[i] = array[i+1];
        }
        currentSize--;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentSize; i++) {
            sb.append("[" + array[i] + "]");
        }
        return sb.toString();
    }

    private class ListIterator implements Iterator {
        int lastReturn = -1;
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < currentSize;
        }

        @Override
        public Object next() {
            lastReturn = cursor;
            return array[cursor++];
        }

        @Override
        public void remove() {
            if (lastReturn == -1) throw new IllegalStateException();
            for (int i = lastReturn; i < currentSize-1 ; i++) {
                array[i] = array[i+1];
            }
            currentSize--;
            cursor = lastReturn;
        }
    }
}