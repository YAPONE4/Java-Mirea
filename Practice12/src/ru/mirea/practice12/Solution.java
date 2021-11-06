package ru.mirea.practice12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<T, K, V> {

    private ArrayList<T> lst;
    private HashSet<T> hsh;
    private HashMap<K, V> hsm;

    public Solution() {};

    public void newArrayList() {
        lst = new ArrayList<T>();
    }

    public void newHashSet() {
        hsh = new HashSet<T>();
    }

    public void newHashMap() {
        hsm = new HashMap<K, V>();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.newArrayList();
        sol.lst.add(1);
        sol.lst.add("kek");
        sol.newHashSet();
        sol.hsh.add(2);
        sol.hsh.add("kekw");
        sol.newHashMap();
        sol.hsm.put(123, 1);
        sol.hsm.put(12313, "lol");
        for(int i = 0; i < sol.lst.size(); i++) System.out.println(sol.lst.get(i));
        System.out.println(sol.hsh);
        System.out.println(sol.hsm.get(123));
        System.out.println(sol.hsm.get(12313));
    }
}
