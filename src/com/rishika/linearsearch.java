package com.rishika;

public class linearsearch {
    static int linearsearch(int[] arr,int target){
        if(arr.length==0)
            return -1;
        for (int index = 0; index < arr.length ; index++) {
            int ele=arr[index];
            if(ele==target)
                return index;
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] nums={11,45,67,32,41,31,20,19,17,14,17};
       int target=41;
        System.out.println(linearsearch(nums,target));
    }
}
