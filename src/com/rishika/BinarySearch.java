package com.rishika;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {12, 17, 19, 32, 38, 40, 52, 66, 99,100};
        int target = 32;
        int ans= binarysearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int binarysearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static class searchin_rowcolwise_sortedmatrix {
        public static void main(String[] args) {
          int [][] arr={
                  {10,20,30,40},
                  {15,25,35,45},
                  {28,29,37,49},
                  {33,34,38,50}
          };
            System.out.println(Arrays.toString(search(arr,25)));
        }
        static int[] search(int[][] matrix , int target){
            int r=0;
            int c= matrix.length-1;
            while(r<matrix.length && c>=0){
               if(matrix[r][c] == target){
                   return new int[]{r,c};
               }
               if(matrix[r][c]<target){
                   r++;
               }else {
                   c--;
               }
            }
            return new int[]{-1,-1};
        }
    }
}