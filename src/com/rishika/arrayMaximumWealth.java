package com.rishika;

public class arrayMaximumWealth {
    public static void main(String[] args) {
      int[][] account={
              {1,2,3},
              {3,2,1}
      };
        System.out.println(maxwealth(account));
    }
    static int maxwealth(int[][] accounts) {
//        person=row account=col
        int ans = Integer.MAX_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
