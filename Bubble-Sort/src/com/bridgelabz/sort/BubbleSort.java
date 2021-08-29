package com.bridgelabz.sort;

public class BubbleSort {
    public static void main(String[] args) {
       Sort bubbleSort = new Sort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array");
        bubbleSort.printArray(arr);
        bubbleSort.sort(arr);
        System.out.println("Sorted array");
        bubbleSort.printArray(arr);
    }
}
