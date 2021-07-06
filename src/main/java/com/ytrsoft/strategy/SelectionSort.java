package com.ytrsoft.strategy;

public class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int p = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[p] > arr[j]) {
                    p = j;
                }
            }
            if (p != i) {
                int tmp = arr[p];
                arr[p] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}
