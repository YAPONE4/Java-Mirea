package ru.mirea.practice12;

import java.util.ArrayList;

public class first_task {

    public static<E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) lst.add(e);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst =  new ArrayList<Integer>();
        ArrayList<String> lst2 = new ArrayList<String>();

        Integer[] intArray = {55, 66};
        ArrayToArrayList(intArray, lst);
        for (Integer i : lst) System.out.println(i);

        String[] strArray = {"one", "two", "three"};
        ArrayToArrayList(strArray, lst2);
        for (String i : lst2) System.out.println(i);
    }
}
