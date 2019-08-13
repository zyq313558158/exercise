package com.zyq;

import java.util.Arrays;

//选择排序---不稳定排序,可能无法保持相同数字的原有顺序,如{1,5,5,2}
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }


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

    //选择排序优化,在一次循环中同时找出最大值和最小值
    public static int[] selectionSort2(int[] arr){
        for (int i=0;i<arr.length/2;i++){
            int minIndex = i;
            int maxIndex =arr.length -1 - i;
            for (int j=i;j<arr.length - 1 - i;j++){
                minIndex = arr[minIndex] < arr[j] ? minIndex : j ;
                maxIndex = arr[maxIndex] > arr[j] ? maxIndex : j ;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
