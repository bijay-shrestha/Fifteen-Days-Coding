package com.fifteendays.coding.day07;

/**
 * Given a sorted array of integers nums,
 * determine if there exists a pair of numbers that sum to a given target.
 * Example: Input: nums = [1,3,4,6,8,10,13], target = 13 Output: True (3 + 10 = 13)
 * Input: nums = [1,3,4,6,8,10,13], target = 6 Output: False
 */
public class TwoSum {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
        int[] nums = {1,2,3,4,5};
        int target = 9;

        System.out.println(hasTwoSum(nums, target));

    }

    //Not So Efficient Way
    public static boolean hasTwoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j= i+1; j< nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    //Efficient Way
    public static boolean efficientHasTwoSum(int[] nums, int target) {
        int left = 0; int right = nums.length-1;

        while(left < right){
            int currentSum  = nums[left] + nums[right];

            if(currentSum == target){
                return true;
            }

            if(currentSum < target){
                left++;
            }else{
                right--;
            }
        }

        return false;
    }
}
