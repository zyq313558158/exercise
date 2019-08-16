package com.zyq;

import java.util.Arrays;

//冒泡排序---稳定排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            // 从后向前依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j=arr.length-1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    //arr[i],arr[j]交换位置
                    arr[j] = arr[j-1] + arr[j];
                    arr[j-1] = arr[j] - arr[j-1];
                    arr[j] = arr[j] - arr[j-1];
                }
            }
            System.out.format("第 %d 趟：\t", i);
            System.out.println(Arrays.toString(arr));
        }
    }

    //对冒泡排序常见的改进方法是加入标志性变量exchange，用于标志某一趟排序过程中是否有数据交换。
    //
    //如果进行某一趟排序时并没有进行数据交换，则说明所有数据已经有序，可立即结束排序，避免不必要的比较过程。
    private static void bubbleSort2(int[] arr) {
        boolean bChange = false; // 交换标志
        for (int i=0;i<arr.length-1;i++){
            bChange = false;
            // 从后向前依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j=arr.length-1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    //arr[i],arr[j]交换位置
                    arr[j] = arr[j-1] + arr[j];
                    arr[j-1] = arr[j] - arr[j-1];
                    arr[j] = arr[j] - arr[j-1];
                    bChange = true;
                }
            }
            // 如果标志为false，说明本轮遍历没有交换，已经是有序数列，可以结束排序
            if (false == bChange)
                break;
            System.out.format("第 %d 趟：\t", i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
