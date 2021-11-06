package ru.mirea.practice12;

public class second_third_task<E> {

    private int size;
    private Object[] elements;

    public second_third_task() {
        elements = new Object[10];
        size = 0;
    }

    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
            Object[] old = new Object[size];
            old = elements;
            elements = new Object[size + 10];
            for (int i = 0; i < elements.length; i++) elements[i] = old[i];
        }
        ++size;
    }

    public E get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (E)elements[index];
    }

    public int size() { return size; }

    public static void main(String[] args) {
        second_third_task lst = new second_third_task();
        lst.add(12);
        lst.add("ahaha.wav");
        lst.add(12.333);
        for (int i = 0; i < lst.size; i++) System.out.println(lst.get(i));
    }
}
