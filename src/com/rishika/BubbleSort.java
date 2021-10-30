package com.rishika;

import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
	// write your code here
        int [] arr ={1,3,4,2,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean swapped;
        //run steps for n-1 times
        for (int i = 0; i < arr.length ; i++) {
            swapped=false;
            //for each pass or step ,max item will come at the last respective index
            for (int j = 1; j <= arr.length-i-1 ; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
         //if you did not swapped for a particular value of i ,hence array is sorted
            //stop the program
            if(!swapped){ // !false==true
                break;
            }
        }
    }
}
