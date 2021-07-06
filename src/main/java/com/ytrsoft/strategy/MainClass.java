package com.ytrsoft.strategy;

import java.util.Arrays;
import java.util.Random;

/**
 * 策略模式
 */
public class MainClass {

    public static void sample(Sortable sort) {
        int size = 10;
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(89) + 10;
        }
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        sort.sort(arr);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        System.out.println("冒泡排序");
        sample(new BubbleSort());
        System.out.println("=========================================");
        System.out.println("选择排序");
        sample(new SelectionSort());
        System.out.println("=========================================");
        System.out.println("插入排序");
        sample(new InsertionSort());
        System.out.println("=========================================");
    }
}
