package com.zyq;

import java.util.Arrays;

//希尔排序---不稳定排序
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        //shellSort1(arr);
        shellSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 希尔排序 针对有序序列在插入时采用移动法。
    private static void shellSort2(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap=arr.length/2;gap>0;gap/=2){
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i=gap;i<arr.length;i++){
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j-gap]){
                    while (j-gap>=0 && arr[j-gap]>temp){
                        //移动法
                        arr[j] = arr[j-gap];
                        j-=gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }

    //希尔排序 针对有序序列在插入时采用交换法
    private static void shellSort1(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap=arr.length/2;gap>0;gap/=2){
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i=gap;i<arr.length;i++){
                int j = i;
                //插入排序采用交换法
                while ((j-gap)>=0 && arr[j] < arr[j-gap]){
                    swap(arr,j,j-gap);
                    j-=gap;
                }
            }
        }

    }

    //交换数组元素
    private static void swap(int[] arr, int j, int i) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
