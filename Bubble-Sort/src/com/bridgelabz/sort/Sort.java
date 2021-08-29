package com.bridgelabz.sort;

public class Sort {
    public void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }

    public void printArray(int[] arr) {
        int size = arr.length;
        for (int i=0; i<size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
