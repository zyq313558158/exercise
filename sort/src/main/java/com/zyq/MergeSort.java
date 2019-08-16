package com.zyq;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int L, int R) {
        if (L >= R){
            return;
        }
        int M = (L+R)/2;
        mergeSort(arr,L,M);
        mergeSort(arr,M+1,R);
        merge(arr,L,M+1,R);
    }

    private static void merge(int[] arr, int L, int M, int R) {
        int[] leftArr = new int[M-L];
        int[] rightArr = new int[R-M+1];
        for (int i=L;i<M;i++){
            leftArr[i-L] = arr[i];
        }
        for (int i=M;i<R+1;i++){
            rightArr[i-M] = arr[i];
        }
        int i = 0,j = 0;
        int k = L;
        //比较两个有序数组,i,j指针所在位置哪个数值小,就放进大数组,同时相应指针和k指针右移
        while (i<leftArr.length && j<rightArr.length){
            if (leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }else {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        //如果左边的数组还没比较完,右边的比较完了,则把左边数组剩余元素按照顺序放入大数组中
        while (i < leftArr.length){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        //如果右边的数组还没比较完,左边的比较完了,则把右边数组剩余元素按照顺序放入大数组中
        while (j < rightArr.length){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
