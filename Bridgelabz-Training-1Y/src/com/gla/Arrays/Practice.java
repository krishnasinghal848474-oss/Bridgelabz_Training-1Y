package com.gla.Arrays;

import java.util.Arrays;

public class Practice {
    public int[] linearSearch(int arr[],int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return new int[]{i};
            }
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        Practice p1=new Practice();
        int[] arr={3,45,65,867,43};
        int target=867;
        int[] Search=p1.linearSearch(arr,target);
        System.out.println(Arrays.toString(Search));
    }
    public int[] twoSum(int nums[],int target){
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

