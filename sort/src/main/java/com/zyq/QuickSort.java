package com.zyq;

import java.util.Arrays;

//快速排序---稳定排序
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int low,int high) {
        int i = low;
        int j = high;
        if (low < high){
            int temp = arr[low];
            while (low < high){
                //这里必须有等于，否则将死循环
                while (low < high && temp <= arr[high]){
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= temp){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = temp;
            quickSort(arr,i,low-1);
            quickSort(arr,low+1,j);
        }
    }
}
