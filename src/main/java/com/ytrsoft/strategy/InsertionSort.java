package com.ytrsoft.strategy;

public class InsertionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int p = 1;
        while (p < arr.length) {
            int t = p;
            while(t > 0) {
                if (arr[t] < arr[t - 1]) {
                    int tmp = arr[t];
                    arr[t] = arr[t - 1];
                    arr[t - 1] = tmp;
                }
                t--;
            }
            p++;
        }
    }
}
