package com.zyq;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,199};
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int exp = 1;max/exp>0;exp*=10){
            countSort(arr,exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int[] outPut = new int[arr.length];
        int[] buckets = new int[10];
        for (int i:arr) {
            buckets[(i/exp)%10]++;
        }
        for (int i=1;i<buckets.length;i++){
            buckets[i]+=buckets[i-1];
        }
        for (int i=arr.length-1;i>=0;i--){
            outPut[ buckets[(arr[i]/exp)%10]-1] = arr[i];
            buckets[(arr[i]/exp)%10]--;
        }
        for (int i=arr.length-1;i>=0;i--){
            arr[i] = outPut[i];
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }
}
