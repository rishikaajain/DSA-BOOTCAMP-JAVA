package com.rishika;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

//        Given an array of ints, return true if 6 appears as either the
//        first or last element in the array. The array will be length 1 or more.
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false
        Scanner sc=new Scanner(System.in);
//        int[] arr={1,2,3,5,6,7};
//            if(arr[0] == 6 || arr[arr.length-1]==6){
//                System.out.println("true");
//            }
//            else
//                System.out.println("false");

//        Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//        sameFirstLast([1, 2, 3]) → false
//        sameFirstLast([1, 2, 3, 1]) → true
//        sameFirstLast([1, 2, 1]) → true
//        int[] arr1={1,2,1};
//            if(arr1[0] == arr1[arr1.length-1]){
//                System.out.println("true");
//            }
//            else
//                System.out.println("false");

//            Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

//        int[] ar=new int[3];
//        for (int i = 0; i <ar.length ; i++) {
//            ar[i]= sc.nextInt();
//        }
//        for (int ele:ar) {
//            System.out.println(ar + " " );
//        }

//        Given 2 arrays of ints, a and b, return true if they have
//        the same first element or they have the same last element. Both arrays will be length 1 or more.
//        commonEnd([1, 2, 3], [7, 3]) → true
//        commonEnd([1, 2, 3], [7, 3, 2]) → false
//        commonEnd([1, 2, 3], [1, 3]) → true
//        int n= sc.nextInt();
//
//        int[][] arr=new int[n][];
//        System.out.println(arr.length);//no of rows
//        for (int row = 0; row < arr.length ; row++) {
//            int m=sc.nextInt();
//            arr[row] = new int[m];
//            for (int col = 0; col < m ; col++) {
//               arr[row][col]= sc.nextInt();
//            }
//        }
//        for (int row = 0; row < arr.length ; row++) {
//            for (int col = 0; col < arr[row].length ; col++) {
//                System.out.println(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


//        Given an array of ints length 3, return the sum of all the elements.
//        int[] arr={1,2,3};
//        int sum=0;
//        for (int i = 0; i < arr.length ; i++) {
//            sum+=arr[i];
//        }
//        System.out.println(sum);


//        Given an array of ints length 3, return an reverse order array .
//        int[] arr={1,2,3};
//        for (int i = arr.length-1; i >=0 ; i--) {
//            System.out.println(arr[i]);
//        }


//        Given an array of ints length 3, figure out which is larger, the first or
//        last element in the array, and set all the other elements to be that value. Return the changed array.
//        maxEnd3([1, 2, 3]) → [3, 3, 3]
//        maxEnd3([11, 5, 9]) → [11, 11, 11]
//        maxEnd3([2, 11, 3]) → [3, 3, 3]

//        int[] nums={1,5,3};
//            int maxSoFar = nums[0];  // use nums[0] as the max to start
//
//        maxSoFar= Math.max(maxSoFar,nums[nums.length-1]);
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = maxSoFar;
//        }
//        return nums;


//        Given an array of ints, return the sum of the first 2 elements in the
//        array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

//  int[] arr=new int[3];
//  int sum=0;
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]= sc.nextInt();
//            sum=arr[0]+arr[1];
//        }
//        System.out.println(sum);


////        Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//    int[] a=new int[3];
//    int[] b=new int[3];
//    int[] c={0,0};
//        for (int i = 0; i <a.length ; i++) {
//            a[i]= sc.nextInt();
//        }
//        c[0]=a[1];
//        for (int i = 0; i <b.length ; i++) {
//            b[i]= sc.nextInt();
//        }
//        c[1]=b[1] ;
//        System.out.println(c[0] +" "+ c[1]);


//        int[][] arr = new int[3][3];
//        System.out.println(arr.length); // no of rows
//        // input
//
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }


//        Given an int array length 2, return true if it does not contain a 2 or 3.
//        no23([4, 5]) → true
//        no23([4, 2]) → false
//        no23([3, 5]) → false
        int[] num={1,9};
        no23(num);


    }
    public static boolean no23(int[] nums){
        if(nums[0] ==2 || nums[1]==2 || nums[0]==3 || nums[1]==3){
            System.out.println("true");
            return true;
        }else
            System.out.println("false");
            return false;
    }

}


