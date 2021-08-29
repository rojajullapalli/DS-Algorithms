package com.bridgelabz.sort;

public class InsertionSort {
    public static void main(String[] args) {
        String fruits[] = { "grapes", "custardapple", "avacado", "litci", "kiwi", "apricot" };
        Sort sort=new Sort();
        System.out.println("Array before Sorting");
        sort.printArray(fruits);
        System.out.println("Array after Sorting");
        sort.toSort(fruits);
        sort.printArray(fruits);
    }

}
