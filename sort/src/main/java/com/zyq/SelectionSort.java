package com.zyq;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    public static int[] selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minIndex = i;
            for (int j=i;j<arr.length;j++){
                minIndex = arr[minIndex] < arr[j] ? minIndex : j ;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
