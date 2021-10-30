package com.rishika;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        Given an int array, return a new array with double the length where its last element is the same as the original array,
//        and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
//        makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//        makeLast([1, 2]) → [0, 0, 0, 2]
//        makeLast([3]) → [0, 3]
//        int n= sc.nextInt();
//        int[] oldarr=new int[n];
//        for (int i = 0; i < n; i++) {
//            oldarr[i]= sc.nextInt();
//        }
//       int[] newarr=new int[oldarr.length*2];
//       newarr[newarr.length-1]= oldarr[oldarr.length-1];
//        System.out.println(Arrays.toString(newarr));

//        Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
//        fix23([1, 2, 3]) → [1, 2, 0]
//        fix23([2, 3, 5]) → [2, 0, 5]
//        fix23([1, 2, 1]) → [1, 2, 1]
//
//        int[] arr={1,2,3};
//       if(arr[0]==2 && arr[1]==3) {
//           arr[1] = 0;
//       }
//       if(arr[1]==2 && arr[2]==3){
//           arr[2] = 0;
//       }
//        System.out.println(Arrays.toString(arr));


//        Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//        start1([1, 2, 3], [1, 3]) → 2
//        start1([7, 2, 3], [1]) → 1
//        start1([1, 2], []) → 1
//        int n= sc.nextInt();
//        int m=sc.nextInt();
//        int[] a=new int[n];
//        int[] b=new int[m];
//        int count=0;
//        for (int i = 0; i <a.length ; i++) {
//            a[i]= sc.nextInt();
//        }
//        for (int i = 0; i <b.length ; i++) {
//            b[i]= sc.nextInt();
//        }
//        for (int ele:a) {
//            if(ele==1){
//                count++;
//            }
//        }
//        for (int ele1:b) {
//            if(ele1==1){
//                count++;
//            }
//        }
//        System.out.println(count);

//
//        Start with 2 int arrays, a and b, each length 2.
//        Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
//                biggerTwo([1, 2], [3, 4]) → [3, 4]
//                biggerTwo([3, 4], [1, 2]) → [3, 4]
//                biggerTwo([1, 1], [1, 2]) → [1, 2]

//        int[] a=new int[2];
//        int[] b=new int[2];
//        int sum=0;
//        int sum1=0;
//        for (int i = 0; i <2 ; i++) {
//            a[i]= sc.nextInt();
//            sum+=a[i];
//        }
//        for (int i = 0; i <2 ; i++) {
//            b[i]= sc.nextInt();
//            sum1+=b[i];
//        }
//        if(sum >=sum1){
//            System.out.println(Arrays.toString(a));
//        }else
//            System.out.println(Arrays.toString(b));










    }
}
