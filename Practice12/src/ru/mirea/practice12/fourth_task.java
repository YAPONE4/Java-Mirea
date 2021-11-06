package ru.mirea.practice12;

import java.io.File;
import java.util.ArrayList;

public class fourth_task {
    public static void main(String[] args) {
        File dir = new File("C:/Program Files (x86)");
        ArrayList<File> lst = new ArrayList<File>();
        if (dir.isDirectory())
            for (File i : dir.listFiles())
                lst.add(i);
        int iter;
        if (lst.size() < 5)
            iter = lst.size();
        else
            iter = 5;
        for(int i = 0; i < iter; i++) System.out.println(lst.get(i));
    }
}
