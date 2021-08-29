package com.bridgelabz.sort;

public class Sort {
    public void toSort(String[] fruits) {
        int size = fruits.length;
        for (int i = 1; i < size; ++i) {
            String key = fruits[i];
            int j = i - 1;

            while (j >= 0 && fruits[j].compareTo(key)>0) {
                fruits[j + 1] = fruits[j];
                j = j - 1;
            }
            fruits[j + 1] = key;
        }
    }


    public void printArray(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n; ++i)
            System.out.print(fruits[i] + " ");

        System.out.println();
    }
}
