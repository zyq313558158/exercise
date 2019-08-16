package com.zyq;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        for (int i=arr.length/2-1;i>=0;i--){
            headAdjust(arr,arr.length,i);
        }
    }

    private static void headAdjust(int[] arr, int length, int i) {
        int k = i;
        int temp = arr[i];
        int index = 2 * k + 1;
        while (index < length) {
            if (index + 1 < length) {
                if (arr[index] < arr[index + 1]) {
                    index = index + 1;
                }
            }
            if (arr[index] > temp) {
                arr[k] = arr[index];
                k = index;
                index = 2 * k + 1;
            } else {
                break;
            }
        }
        arr[k] = temp;
    }
}
