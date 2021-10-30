package ru.mirea;

public class Main {

    public static void sortVst(int[] mass) {
        for (int left = 0; left < mass.length; left++) {
            int value = mass[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < mass[i]) {
                    mass[i + 1] = mass[i];
                } else {
                    break;
                }
            }
                mass[i + 1] = value;
        }
    }

    public static void printMass(int[] mass) {
        for(int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    public static void mergeSort(int[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        int[] buffer = new int[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || source[cursor] < source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }

    public static void main(String[] args) {
        int[] mass1 = {66, 34, 6, 7, 2, 9, 23, 76, 55};
        int[] mass2 = {66, 34, 6, 7, 2, 9, 23, 76, 55};
        int[] mass3 = {66, 34, 6, 7, 2, 9, 23, 76, 55};
        sortVst(mass1);
        printMass(mass1);
        System.out.println();
        SortingStudentsByGPA obj2 = new SortingStudentsByGPA();
        obj2.quickSort(mass2, 0, mass2.length - 1);
        printMass(mass2);
        System.out.println();
        mergeSort(mass3, 0, mass3.length - 1);
        printMass(mass3);
    }
}
