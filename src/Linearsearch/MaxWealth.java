package Linearsearch;

public class MaxWealth {
    public static void main(String[] args) {
       int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++) {
            int temp_sum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                temp_sum += accounts[i][j];
            }
            if(temp_sum > ans) {
                ans = temp_sum;
            }
        }
        return ans;
    }}