package Linearsearch;

import tut4.Array;

public class Search {
    public static void main(String[] args) {
    int[] num = { 1,33,43,6,54,-2,23,534,-5};
    int target = 23;
    int ans = linearSearch(num,target);
        System.out.println( ans);
    }
    static int linearSearch(int[] num, int target){
        if (num.length == 0){
            return -1;
        }
        for (int i = 0; i < num.length; i++) {
            int element = num[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }


}
