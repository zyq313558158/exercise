package com.zyq;

import java.util.Arrays;

//直接插入排序---稳定排序
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,5,56,1,0,33,999};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertSort(int[] arr){
        int i,j,k,temp;
        for (i=1;i < arr.length;i++){
            for (j=i-1;j>=0;j--){
                if (arr[j] <= arr[i]){
                    break;
                }
            }
            if (j != i-1){
                temp = arr[i];
                for (k = i;k>j+1;k--){
                    arr[k] = arr[k-1];
                }
                arr[j+1] = temp;
            }
        }
        return arr;
    }

}
